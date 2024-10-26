package executorframework.invoke;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class InvokeAnyDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		int x=23;
		int y=12;
		ExecutorService service = Executors.newCachedThreadPool();
		HashSet<Callable<Integer>> taskList = new HashSet<Callable<Integer>>();
		
		taskList.add(() -> {return x-y;});
		taskList.add(() -> {return x+y;});
		taskList.add(() -> {return x*y;});
		taskList.add(() -> {return y/x;});
		
		int data=service.invokeAny(taskList);
		service.shutdown();
		
		System.out.println(data);
		
	}

}
