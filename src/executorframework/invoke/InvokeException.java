package executorframework.invoke;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeException {
	
	static class FetchData implements Callable<Integer> {
		int x;
		public FetchData(int x) {
			this.x=x;
		}
		
		public Integer call() {
			if(x==5) {
				throw new RuntimeException();
			} else {
				return x*x;
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ArrayList<Callable<Integer>> taskList=new ArrayList<Callable<Integer>>();
		taskList.add(new FetchData(1));
		taskList.add(new FetchData(2));
		taskList.add(new FetchData(3));
		taskList.add(new FetchData(4));
		taskList.add(new FetchData(5));
		
		ExecutorService service=Executors.newCachedThreadPool();
		List<Future<Integer>> data=service.invokeAll(taskList);
		service.shutdown();
		try {
			System.out.println(data.get(0).get());
			System.out.println(data.get(1).get());
			System.out.println(data.get(2).get());
			System.out.println(data.get(3).get());
			System.out.println(data.get(4).get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
