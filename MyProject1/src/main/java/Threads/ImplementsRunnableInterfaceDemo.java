package Threads;

public class ImplementsRunnableInterfaceDemo implements Runnable {

	public void run() {
		for(int i=1;i<=100;i++){
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.println("from main");
		Thread td=new Thread(new ImplementsRunnableInterfaceDemo());
		td.start();
		for(int i=200;i<=300;i++){
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
