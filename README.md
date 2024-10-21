# Multithreading
 Java Multithreading Practice Questions

1. Program that uses an Executor to execute a Runnable task, it must print "Hello from Executor!" followed by the current thread name. Class: executorframework.SimpleTaskExecution
2. Create a task using Executor that simulates incrementing a shared counter 10 times, with each increment happening in a separate thread managed by the executor. Class: executorframework.ThreadCounter
3. Program that creates a fixed thread pool of size 3 using ExecutorService. Submit 10 tasks to it. Class: executorframework.lifecycle.ManageThreads
4. Program using ExecutorService to submit a set of tasks, then gracefully shut down the executor after all tasks are complete, ensuring no new tasks are accepted after shutdown is initiated. Class: executorframework.lifecycle.ManageThreads
5. In the last program try to execute new thread after the executorservice is shutdown. Class: executorframework.lifecycle.ExecuteThreadAfterShutdown
6. Implement a program that creates a fixed thread pool of size 3, then submit 10 threads to it and then await completion of all threads submitted. When all the threads are complete print that threads have completed the execution. Class:  executorframework.lifecycle.WaitThreadCompletion
7. Implement a program that creates a fixed thread pool of size 3, submit 10 threads to it and then force shutdown the thread in middle of execution. Class: executorframework.lifecycle.ForceShutDownThreads
8. o	Create a fixed thread pool of size 5 using Executors.newFixedThreadPool(). Submit 10 tasks that each print the current timestamp and the thread name. Ensure tasks are handled in batches due to limited concurrency. (Problem similar as Problem#3) executorframework.fixedthreadpool.FixedThreadPoolDemo
