package Threads;

public class ExtendsThreadClassDemo extends Thread{

	//create thread using thread class
	public void run(){
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
		ExtendsThreadClassDemo td=new ExtendsThreadClassDemo();
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
	//implements runnable
	
public class Runnable {
	 Runnable myRunnable = new Runnable();
	public void run(){
		
	}
	
}
	}
	

