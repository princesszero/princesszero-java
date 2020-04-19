package dynamicProxy;
/**
 * @Description:静态代理-真实对象
 * @version 1.0
 * @since JDK1.8
 * @author Li-Ying
 * @date 2020年4月19日 上午9:30:59
 */
public class RealStar implements Star{

	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.confer");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.sing");
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("RealStar.bookticket");
		
	}

}
