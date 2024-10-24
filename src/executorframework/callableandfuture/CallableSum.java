package executorframework.callableandfuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSum {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newCachedThreadPool();
		Future<Integer> totalSum = service.submit(() ->{
			int sum=0;
			for(int i=0;i<10000;i++) {
				sum=sum+i;
			}
			return sum;
			
		}); 
		
		while(!totalSum.isDone()) {
			
		}
		
		System.out.println(totalSum.get());
	}

}
