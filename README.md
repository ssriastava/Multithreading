# Multithreading
 Java Multithreading Practice Questions

1. Program that uses an Executor to execute a Runnable task, it must print "Hello from Executor!" followed by the current thread name.
2. Create a task using Executor that simulates incrementing a shared counter 10 times, with each increment happening in a separate thread managed by the executor.
3. Program that creates a fixed thread pool of size 3 using ExecutorService. Submit 10 tasks to it.
4. Program using ExecutorService to submit a set of tasks, then gracefully shut down the executor after all tasks are complete, ensuring no new tasks are accepted after shutdown is initiated.
5. In the last program try to execute new thread after the executorservice is shutdown.
6. Implement a program that creates a fixed thread pool of size 3, then submit 10 threads to it and then await completion of all threads submitted. When all the threads are complete print that threads have completed the execution.
7. Implement a program that creates a fixed thread pool of size 3, submit 10 threads to it and then force shutdown the thread in middle of execution.
