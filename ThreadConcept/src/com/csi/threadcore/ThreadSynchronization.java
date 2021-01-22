package com.csi.threadcore;

class Table {
	synchronized public void printTable(int n) {
		int i;
		for (i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i * n);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread {
	Table t;

	public MyThread1(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table t;

	public MyThread2(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(100);
	}
}

class MyThread3 extends Thread {
	Table t;

	public MyThread3(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(1000);
	}
}

class MyThread4 extends Thread {
	Table t;

	public MyThread4(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(10000);
	}
}

class MyThread5 extends Thread {
	Table t;

	public MyThread5(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(100000);
	}
}

class MyThread6 extends Thread {
	Table t;

	public MyThread6(Table t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(1000000);
	}
}

public class ThreadSynchronization {
	public static void main(String[] args) {

		Table tt = new Table();
		MyThread1 t1 = new MyThread1(tt);
		MyThread2 t2 = new MyThread2(tt);
		MyThread3 t3 = new MyThread3(tt);
		MyThread4 t4 = new MyThread4(tt);
		MyThread5 t5 = new MyThread5(tt);
		MyThread6 t6 = new MyThread6(tt);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}
