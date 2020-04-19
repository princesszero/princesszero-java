package dynamicProxy;

import java.lang.reflect.Proxy;



/**
 * @Description:客户
 * @version 1.0
 * @since JDK1.8
 * @author Li-Ying
 * @date 2020年4月19日 上午9:41:42
 */
public class Client {
	public static void main(String [] args)
	{
		Star realStar=new RealStar();
		
		staticHandler handler=new staticHandler(realStar);
		
		Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
		
		proxy.confer();
		proxy.sing();
	}
}
