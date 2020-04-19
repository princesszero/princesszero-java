package staticProxy;
/**
 * @Description:静态代理-真实角色
 * @version 1.0
 * @since JDK1.8
 * @author Li-Ying
 * @date 2020年4月19日 上午9:23:43
 */
public class StaticProxy implements Proxy_star{
	
	private Proxy_star star;
	
	public StaticProxy (Proxy_star star) {
		super();
		this.star=star;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("confer");
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		star.sing();
		
	}

	@Override
	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("bookTicket");
	}

}
