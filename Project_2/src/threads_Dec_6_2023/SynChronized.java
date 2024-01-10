package threads_Dec_6_2023;

public class SynChronized implements Runnable {
	Another a;
	public SynChronized() {
		
	}
	

	public SynChronized(Another a) {
		super();
		this.a = a;
	}
	public static synchronized  void method() {
		System.out.println("i am here");
		
	}
	public  void  run() {
		SynChronized.method();
		a.method2();
		
	}
	
	public static void main(String[] args) {
		
		Another a=new Another();
		a.start();
		Thread t=new Thread(new SynChronized(a));
		t.start();
		
		
	}


}
class Another extends Thread{
	public void method2() {
		System.out.println("happy .....happy");
	}
	public void run() {
		System.out.println("my fate");
			
		}
	}

