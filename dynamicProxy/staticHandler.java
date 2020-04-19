package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;



/**
 * @Description:TODO
 * @version 1.0
 * @since JDK1.8
 * @author Li-Ying
 * @date 2020年4月19日 下午4:42:42
 */
public class staticHandler implements InvocationHandler{

	Star realstar;
	
   public staticHandler(Star realstar) {
		// TODO Auto-generated constructor stub
	   super();
	   this.realstar=realstar;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("=======");
		if(method.getName().equals("sing"))//需要使用真实对象的时候进行动态激活调用的方法
		   method.invoke(realstar, args);
		return null;
	}

}
