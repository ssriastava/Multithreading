package executorframework.lifecycle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/*
 * 10 threads created and executed in fixed thread pool of size 3
 */
public class ManageThreads {
	
	public static void main(String[] as) {
		
		ExecutorService execService = Executors.newFixedThreadPool(3);
		
		for(int i=0;i<10;i++) {
			execService.execute(() -> {
				for(int j=0;j<1000;j++) {
					System.out.println(Thread.currentThread().getName()+" :"+j);
				}});
			
		}
		
		execService.shutdown();
	}

}
