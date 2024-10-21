package executorframework.scheduledthreadpool;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Heartbeat {
	
	public static void main(String[] args) throws InterruptedException {
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
		executor.scheduleAtFixedRate(() -> System.out.println(Thread.currentThread().getName()+"Heartbeat"), 5000, 5000, TimeUnit.MILLISECONDS);
		Thread.sleep(30000);
		executor.shutdown();
	}

}
