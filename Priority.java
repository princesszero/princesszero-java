package multithreading;
/**
 * @Description:线程的优先级
 * @version 1.0
 * @since JDK1.8
 * @author Li-Ying
 * @date 2020年4月17日 下午7:13:12
 */

/*线程优先级:1-10
 * 1.NORM_PRIORITY:分配给现成的默认优先级：5
 * 2.MAX_PRIORITY:线程可以拥有的最大优先级：10
 * 3.MIN_PRIORITY:线程可以拥有的最小优先级：1
  * 代表概率，不代表绝对的先后顺序
*/
public class Priority {
	public static void main(String[] args) {
//		System.out.println(Thread.NORM_PRIORITY);
//		System.out.println(Thread.MAX_PRIORITY);
//		System.out.println(Thread.MIN_PRIORITY);
//		System.out.println(Thread.currentThread().getPriority());
		
		MyPriority myPriority=new MyPriority();
		
		Thread t1=new Thread(myPriority);
		Thread t2=new Thread(myPriority);
		Thread t3=new Thread(myPriority);
		Thread t4=new Thread(myPriority);
		Thread t5=new Thread(myPriority);
		Thread t6=new Thread(myPriority);
		
		
		
		//设置线程的优先级必须要在线程启动之前
		t1.setPriority(2);
		t2.setPriority(3);
		t3.setPriority(4);
		t4.setPriority(5);
		t5.setPriority(6);
		t6.setPriority(1);
		
		
		
		
		//开启多线程
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	
		
	}
}
class MyPriority implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());
		//Thread.yield();
	}
}
