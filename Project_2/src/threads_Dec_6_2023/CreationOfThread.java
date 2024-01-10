package threads_Dec_6_2023;

public class CreationOfThread extends Thread {

	public void run() {
		System.out.println("my devil is dhraksha");

	}
	public static void main(String[] args) {
		CreationOfThread thread=new CreationOfThread();
		thread.start();
		
		Second second=new Second();
		Thread t=new Thread(second);
		t.start();
	}


}

class Second implements Runnable {

	@Override
	public void run() {
		System.out.println("my goodness");
	}
	
}

