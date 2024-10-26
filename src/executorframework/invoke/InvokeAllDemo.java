package executorframework.invoke;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		int x = 34;
		int y = 56;
		ExecutorService service = Executors.newCachedThreadPool();
		List<Callable<Integer>> taskList = new ArrayList<>();

		// Add tasks with sleep statements
		taskList.add(() -> {
		    Thread.sleep(1000); // Sleep for 1 second
		    return x + y;
		});

		taskList.add(() -> {
		    Thread.sleep(1000); // Sleep for 1 second
		    return x - y;
		});

		taskList.add(() -> {
		    Thread.sleep(1000); // Sleep for 1 second
		    return x * y;
		});

		taskList.add(() -> {
		    Thread.sleep(1000); // Sleep for 1 second
		    return x / 6;
		});

		try {
		    // invokeAll blocks until all tasks are finished
		    List<Future<Integer>> responseList = service.invokeAll(taskList);
		    
		    service.shutdown(); // shut down the executor after all tasks are submitted
		    System.out.println("Outputs...");
		    
		    // Print the results of each task
		    responseList.forEach(resp -> {
		        try {
		            System.out.println("Data: " + resp.get()); // get() waits for the result
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    });
		    
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}

		
		
	}

}
