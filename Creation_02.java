package multithreading;
/**
 * @Description:实现Runnnable接口创建线程
 * @version 1.0
 * @since JDK1.8
 * @author Li-Ying
 * @date 2020年4月18日 上午10:55:48
 */
public class Creation_02 implements Runnable{
	/*
	 *线程入口点
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++)
		{
			System.out.println("写作业");
		}
	}
	public static void main(String [] args)
	{
		//创建实现类对象
		Creation_02 ceCreation_02=new Creation_02();
		//创建代理类对象
		Thread thread=new Thread(ceCreation_02);
		
		thread.start();
		
		for(int i=0;i<20;i++)
		{
			System.out.println("听歌");
		}
	}
}
