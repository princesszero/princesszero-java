package staticProxy;
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
		Proxy_star realStar=new RealStar();
		Proxy_star proxyStar=new StaticProxy(realStar);//代理对象绑定真实对象
		
		proxyStar.confer();
		proxyStar.bookTicket();
		proxyStar.sing();
		
	}
}
