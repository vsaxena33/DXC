package thread;

public class Demo extends Thread {
	Thread t1;
	public Demo() {
		t1 = new Thread(this);
		t1.start();
		System.out.println("Cons");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("run");
	}
	public static void main(String[] args) {
		new Demo();
		System.out.println("MAIN");
	}

}
