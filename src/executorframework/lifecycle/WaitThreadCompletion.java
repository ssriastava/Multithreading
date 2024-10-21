package executorframework.lifecycle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/*
 * 10 threads are submitted to executor service to be executed
 * once all the threads are complete, message All threads are complete now should be printed
 */
public class WaitThreadCompletion {
	
	public static void main(String[] as) {
		ExecutorService execService = Executors.newCachedThreadPool();
		
		for(int i=0; i<10; i++) {
			execService.execute(() -> {
				for(int j=0; j<1000; j++) {
					System.out.println(Thread.currentThread().getName()+" :"+j);
				}
			});
		}
		
		execService.shutdown();
		System.out.println("Waiting for all threads to complete.............");
		while(!execService.isTerminated()) {
			
		}
		
		System.out.println("All threads have finished now");
	}

}
