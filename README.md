# Multithreading
 Java Multithreading Practice Questions

1. Program that uses an Executor to execute a Runnable task, it must print "Hello from Executor!" followed by the current thread name. Class:[executorframework.SimpleTaskExecution](/src/executorframework/SimpleTaskExecution.java)
2. Create a task using Executor that simulates incrementing a shared counter 10 times, with each increment happening in a separate thread managed by the executor. Class:[executorframework.ThreadCounter](/src/executorframework/ThreadCounter.java)
3. Program that creates a fixed thread pool of size 3 using ExecutorService. Submit 10 tasks to it. Class:[executorframework.lifecycle.ManageThreads](/src/executorframework/lifecycle/ManageThreads.java)
4. Program using ExecutorService to submit a set of tasks, then gracefully shut down the executor after all tasks are complete, ensuring no new tasks are accepted after shutdown is initiated. Class:[executorframework.lifecycle.ManageThreads](/src/executorframework/lifecycle/ManageThreads.java)
5. In the last program try to execute new thread after the executorservice is shutdown. Class: executorframework.lifecycle.ExecuteThreadAfterShutdown. Class:[executorframework.lifecycle.ExecuteThreadAfterShutdown](/src/executorframework/lifecycle/ExecuteThreadAfterShutdown.java)
6. Implement a program that creates a fixed thread pool of size 3, then submit 10 threads to it and then await completion of all threads submitted. When all the threads are complete print that threads have completed the execution. Class:  executorframework.lifecycle.WaitThreadCompletion
7. Implement a program that creates a fixed thread pool of size 3, submit 10 threads to it and then force shutdown the thread in middle of execution. Class: executorframework.lifecycle.ForceShutDownThreads
8. Create a fixed thread pool of size 5 using Executors.newFixedThreadPool(). Submit 10 tasks that each print the current timestamp and the thread name. Ensure tasks are handled in batches due to limited concurrency. (Problem similar as Problem#3) executorframework.fixedthreadpool.FixedThreadPoolDemo
9. Write a program to schedule a task that prints "Scheduled Task Executed" after a delay of 5 seconds using ScheduledThreadPoolExecutor.
10. Implement a periodic task using ScheduledExecutorService that prints "Heartbeat" every 5 seconds. Allow the task to run for 30 seconds before shutting down the executor.
11. Use a cached thread pool to execute 20 short-lived tasks, each printing a unique message. Observe how threads are dynamically created and reused.
12. Implement a task submission scenario where 30 tasks are generated at unpredictable rates which range from 0 to 5 seconds. Use a cached thread pool to handle these tasks.
