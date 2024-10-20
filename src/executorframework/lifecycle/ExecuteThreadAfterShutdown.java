package executorframework.lifecycle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Trying to invoke new thread after executorservice is shutdown
 * This will throw exception java.util.concurrent.RejectedExecutionException
 */

public class ExecuteThreadAfterShutdown {
	
public static void main(String[] as) {
		
		ExecutorService execService = Executors.newFixedThreadPool(3);
		
		for(int i=0;i<10;i++) {
			execService.execute(() -> {
				for(int j=0;j<1000;j++) {
					System.out.println(Thread.currentThread().getName()+" :"+j);
				}});
			
		}
		
		execService.shutdown();
		
		execService.execute(() -> {
			for(int j=0;j<1000;j++) {
				System.out.println(Thread.currentThread().getName()+" :"+j);
			}});
	}

}
