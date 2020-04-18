package multithreading;
/**
 * @Description:TODO
 * @version 1.0
 * @since JDK1.8
 * @author Li-Ying
 * @date 2020年4月18日 上午10:28:46
 */
public class Creation_01 extends Thread{
	/*
	 *此处作为线程的入口点 
	 */
	@Override
		public void run() {
			// TODO Auto-generated method stub
			//super.run();
			for(int i=0;i<20;i++)
			{
				System.out.println("写作业");
			}
		}
	
	public static void main(String [] args) {
		Creation_01 thCreation_01=new Creation_01();
		
		//启动线程，由Java虚拟机决定什么时候调用run()方法
		thCreation_01.start();
		//直接调用run()方法，就变成了普通的方法体
		//thCreation_01.run();
		
		for(int i=0;i<20;i++)
		{
			System.out.println("听歌");
		}
	} 

}
