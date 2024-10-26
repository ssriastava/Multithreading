package executorframework.callableandfuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureCallableTimed {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		
		
		ExecutorService service = Executors.newCachedThreadPool();
		Future<Integer> data = service.submit(() -> {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return 25;
		});
		service.shutdown();
		int d=data.get(10010, TimeUnit.MILLISECONDS);
		System.out.println(d);
		
	}

}
