package executorframework.callableandfuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int number=7;
		ExecutorService service = Executors.newCachedThreadPool();
		Future<Integer> square=service.submit(() -> {
			return number*number;
		});
		
		Future<Integer> cube = service.submit(() -> {
			return number*number*number;
		});
		
		Future<Integer> factorial = service.submit(() -> {
			int fact=1;
			for(int i=1;i<=number;i++) {
				fact=fact*i;
			}
			return fact;
		});
		service.shutdown();
		
		while(!(square.isDone()&&cube.isDone()&&factorial.isDone())) {
			
		}
		System.out.println("Cube: "+cube.get());
		System.out.println("square: "+square.get());
		System.out.println("factorial: "+factorial.get());
	}

}
