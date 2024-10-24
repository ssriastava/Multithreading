package executorframework.singlethreadexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorDemo {
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		for(int i=0;i<20;i++) {
			service.execute(()->{
				System.out.println(Thread.currentThread().getName()+" thread has started");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" thread has ended");
			});
		}
		
		service.shutdown();
	}

}
