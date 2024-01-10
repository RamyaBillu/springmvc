package threads_Dec_6_2023;

public class ThreadName extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		ThreadName name=new ThreadName();
		name.start();

	}

}
