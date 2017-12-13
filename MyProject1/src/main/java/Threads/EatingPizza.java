package Threads;

public class EatingPizza implements Runnable{
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Brothers eating pizza");}
	
	
}}
