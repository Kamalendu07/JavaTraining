package Thread;

class Print { // shared resource
	void display(int num) {

		for (int i = 1; i<=5; i++) {
			System.out.println(num * i);
			try {
				Thread.sleep(500);
			}

			catch (Exception e) {
				System.out.println(e);
			}

		}
	}
}

class MyThread1 extends Thread {
	Print p;

	MyThread1(Print p) {
		p.display(5);
	}
}

class MyThread2 extends Thread {
	Print p;

	MyThread2(Print p) {
		p.display(10);
	}
}

public class NonSyncEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p1 = new Print(); // only one object
		MyThread1 t1 = new MyThread1(p1);
		MyThread2 t2 = new MyThread2(p1);

		t1.start();
		t2.start();

	}

}
