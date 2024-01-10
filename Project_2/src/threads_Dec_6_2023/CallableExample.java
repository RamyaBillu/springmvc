package threads_Dec_6_2023;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CallableMessage implements Callable<String> {

	public String call() throws Exception {
		return "Hello World!";
	}
}

public class CallableExample {
	static ExecutorService executor = Executors.newFixedThreadPool(2);

	public static void main(String[] args) throws Exception {
		CallableMessage task = new CallableMessage();
		Future<String> message = executor.submit(task);
		System.out.println(message.get().toString());
	}
}
