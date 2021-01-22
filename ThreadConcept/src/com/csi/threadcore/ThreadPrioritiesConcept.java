package com.csi.threadcore;

class MyThread11 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("FULL STACK");
	}
}

class MyThread12 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("CSI PUNE");
	}
}

class MyThread13 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("INSPIRIA MALL");
	}
}

public class ThreadPrioritiesConcept {
	public static void main(String[] args) {

		MyThread11 t1 = new MyThread11();
		MyThread12 t2 = new MyThread12();
		MyThread13 t3 = new MyThread13();

		t1.setName("TOM");

		t1.setPriority(5);
		t2.setPriority(1);
		t3.setPriority(10);

		System.out.println("Thread 1 Id: " + t1.getId());
		System.out.println("Thread 1 Name: " + t1.getName());
		System.out.println("Thread 1 Priority: " + t1.getPriority());

		System.out.println("\n Thread 2 Id: " + t2.getId());
		System.out.println("Thread 2 Priority: " + t2.getPriority());
		t1.start();
		t2.start();
		t3.start();
	}
}
