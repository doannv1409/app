package vn.edu.imic.hoangnd;

public class Worker implements Runnable {

	@Override
	public void run() {
		long sum = 0;
		for (int i = 0; i < 10000000; i++) {
			sum = sum + 1;

			if (i % 1000000 == 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}

	}

	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.run();

		Thread a = new Thread(new Worker());
		a.start();

		Thread b = new Thread(new Worker());
		b.start();
		try {
			a.join();
			//b.join();
		} catch (Exception ignored) {

		}

		System.out.println(Thread.currentThread().getName() + " ALl done");
	}
}
