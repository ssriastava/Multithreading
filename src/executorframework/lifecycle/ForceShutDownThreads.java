package executorframework.lifecycle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * Create and execute threads with executorservice
 * interrupt and stop all the threads in executorservice
 */
public class ForceShutDownThreads {
	
	public static void main(String[] as) {
		
		ExecutorService service = Executors.newCachedThreadPool();
		for(int i=0; i<1000; i++) {
			service.execute(() -> {for(int j=0; j<10000; j++) {
				if(Thread.currentThread().isInterrupted()) {
					System.out.println(Thread.currentThread().getName()+" was interrupted. Exiting");
					return;
				}
				System.out.println(Thread.currentThread().getName()+" :"+j);
			}}); 
		}
		service.shutdownNow();
	}

}
