package vn.edu.imic.quangminh.thread;

public class Worker implements Runnable {
	private long sum = 0;
	private Object obj = new Object();

	@Override
	public void run() {
		sum();
		syncSum();
	}

	private synchronized void sum() {
		for (int i = 0; i <= 2; i++) {
			sum += i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " i=" + i);
		}
	}

	private void syncSum() {
		synchronized (obj) {
			for (int i = 0; i <= 2; i++) {
				sum += i;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " i=" + i);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Worker worker = new Worker();
		// worker.run();

		Thread a = new Thread(worker, "Thread worker 1");
		a.start();

		Thread b = new Thread(worker, "Thread worker 2");
		b.start();

		a.join();// cho cho thread a, b xu ly xong moi chay tiep thread main
		b.join();

		System.out.println("End : " + Thread.currentThread().getName() + " , sum = " + worker.getSum());
	}

	public long getSum() {
		return sum;
	}

}


class Worker2 extends Thread {
	@Override
	public void run() {
		
	}
}

