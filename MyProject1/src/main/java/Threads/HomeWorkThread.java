package Threads;

public class HomeWorkThread implements Runnable {

	BringPizza bp = new BringPizza();
	Thread getPizza = new Thread(bp);
	EatingPizza ep = new EatingPizza();
	Thread eatingPizza = new Thread(ep);

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Brother 1 Doing Homework");
			if (i == 10) {
				getPizza.start();

			}

		}
	}

	public void eatPizza() {
		if (!getPizza.isAlive()) {
			eatingPizza.start();
			try {
				eatingPizza.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		HomeWorkThread bh = new HomeWorkThread();
		Thread homework = new Thread(bh);
		homework.setName("homework thread: ");
		// new thread created
		homework.start();

		for (int i = 1; i <= 20; i++) {
			System.out.println("Main thread");
			try {
				homework.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
