package Thread;

class Printt{
	synchronized void display(int num) {
		
		for (int i=1; i<=5;i++) {
		System.out.println(num*i);
		try {
		Thread.sleep(500);
		}
		catch(Exception e) {
		System.out.println(e);
		}
		}
	}
	
}

public class SyncEg  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Printt p = new Printt();
		
		Thread t1 = new Thread() {
		public void run() {
			p.display(5);
		}};
		Thread t2 = new Thread() {
		public void run() {
			p.display(10);
		}};
		Thread t3 = new Thread() {
		public void run() {
			p.display(20);
		}};
		t1.start();
		t2.start();
		t3.start();
	}

}
