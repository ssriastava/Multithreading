package executorframework.fixedthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {
	
	public static void main(String[] as) {
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<10;i++) {
			service.execute(()->{for(int j=0;j<10;j++) {
				System.out.println(Thread.currentThread().getName()+": "+j+": "+System.currentTimeMillis());
			}});
		}
		
		service.shutdown();
		
	}

}
