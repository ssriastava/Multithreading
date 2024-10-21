package executorframework.scheduledthreadpool;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
 * ScheduledThreadPool created with a pool of 5 threads
 * 10 tasks are scheduled to be run after 5 seconds
 */
public class SimpleScheduledThreadPoolDemo {
	
	public static void main(String[] args) {
		
		ScheduledThreadPoolExecutor threadPool = new ScheduledThreadPoolExecutor(5);
		long ts1=System.currentTimeMillis();
		for(int i=0;i<10;i++) {
			threadPool.schedule(() -> 
			{
				System.out.println("Difference in timestamp :"+(System.currentTimeMillis()-ts1));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}, 5000, TimeUnit.MILLISECONDS);
		}
		
		threadPool.shutdown();
		
		
	}

}
