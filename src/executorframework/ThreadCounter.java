package executorframework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* 
 * Create 10 threads to count from 1 to 10.
 * Each thread should print an integer, 
 * also the integers must be printed in order from 0 to 10
 */
public class ThreadCounter {
	
	int number=0;
	
	public static void main(String[] args) throws InterruptedException {
		usingAtomicInteger();
		Thread.sleep(1000);
		usingSynchronizedMethod();
	}
	
	
	
	/*
	 * Use atomic integer to increment
	 */
	public static void usingAtomicInteger() {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		AtomicInteger counter = new AtomicInteger(0);
		
		for(int i=0; i<10; i++) {
			executor.execute(() -> {
				System.out.println(counter.incrementAndGet());
			});
		}
		
		executor.shutdown();
	}
	
	
	/*
	 * Use synchronized method block
	 * new class variable number created
	 * synchronized method incrementAndPrint() created to increment and print the number
	 */
	public static void usingSynchronizedMethod() {
		ExecutorService executor = Executors.newCachedThreadPool();
		ThreadCounter threadCounter = new ThreadCounter();
		for(int i=0;i<10; i++) {
			executor.execute(() -> threadCounter.incrementAndPrint());
		}
	}
	
	public synchronized void incrementAndPrint() {
		number++;
		System.out.println(number);
	}
	
	
	
}
