package com.csi.threadcore;

class ImplRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for (i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("CSI PUNE");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ImplementsRunnableConcept {
	public static void main(String[] args) {
		ImplRunnable ir = new ImplRunnable();
		Thread t1 = new Thread(ir);
		t1.start();

	}
}
