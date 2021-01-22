package com.csi.threadcore;

class ExtendsThread extends Thread {

	public void run() {
		// TODO Auto-generated method stub

		int i;
		for (i = 1; i <= 10; i++) {
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

public class ExtendsThreadConcept {
	public static void main(String[] args) {

		ExtendsThread t1 = new ExtendsThread();
		t1.start();
		// t1.start();
	}
}
