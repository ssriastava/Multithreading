package executorframework.cachedthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorDemo {
	
	public static void main(String[] as) {
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i=0; i<20; i++) {
			service.execute(()->{
				System.out.println("Thread "+ Thread.currentThread().getName()+" started the task ");});
		}
		
		service.shutdown();
	}

}
