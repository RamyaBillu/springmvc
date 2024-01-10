package threads_Dec_6_2023;

public class Numbers  implements Runnable{

	public static void main(String[] args) {
		Thread t=new Thread(new Numbers());
		t.start();
	}

	@Override
	public void run() {
     for(int i=1;i<=100;i++) {
    	 System.out.println(i);
    	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
	}

}
