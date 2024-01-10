package threads_Dec_6_2023;

	
	import java.io.FileNotFoundException;
	import java.util.concurrent.*;

	
	class RunnableImpl implements Runnable {

	public void run()
	{
		System.out.println("Hello World ");
	}
	}
	public class RunnableExample{
		static ExecutorService executor = Executors.newFixedThreadPool(2);
	public static void main(String[] args){
			// Creating and running runnable task using Thread class
			RunnableImpl task = new RunnableImpl();
			RunnableImpl task1 = new RunnableImpl();
			Thread thread = new Thread(task);
			Thread thread1 = new Thread(task1);
			thread.start();
			thread1.start();
			// Creating and running runnable task using Executor Service.
			executor.submit(task);
			executor.submit(task1);
		}
	}



