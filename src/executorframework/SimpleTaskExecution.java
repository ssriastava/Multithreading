package executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleTaskExecution {
	
	public static void main(String[] args) {
		Runnable simpleTask1= () -> { System.out.println("Hello from thread "+ Thread.currentThread().getName()); };
		
		Runnable simpleTask2= () -> { System.out.println("Hello from thread "+ Thread.currentThread().getName()); };
		
		
		ExecutorService exec=Executors.newCachedThreadPool();
		
		exec.submit(simpleTask1);
		exec.submit(simpleTask2);
		exec.shutdown();
	}

}
