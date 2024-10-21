package executorframework.fixedthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimulateRequests {
	
	public static void main(String[] as) {
		ExecutorService service = Executors.newFixedThreadPool(4);
		long start = System.currentTimeMillis();
		for(int i=0;i<8;i++) {
			service.submit(()->{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
		service.shutdown();
		while(!service.isTerminated()) {
			
		}
		long end=System.currentTimeMillis();
		System.out.println("All tasks took "+((end-start)/1000)+" seconds to execute");
	}

}
