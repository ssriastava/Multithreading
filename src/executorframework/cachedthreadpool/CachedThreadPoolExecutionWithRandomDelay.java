package executorframework.cachedthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExecutionWithRandomDelay {
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i=0;i<30;i++) {
			Thread.sleep(getRandomNumber(0, 5000));
			service.execute(()->{
				try {
					Thread.sleep(5000);
					System.out.println("Running thread "+Thread.currentThread().getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
		
	}
	
	public static int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}

}
