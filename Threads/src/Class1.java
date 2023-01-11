
public class Class1 extends Thread{
	
	public void run() {
		System.out.println("Code1");
	}
	public static void main(String[] args) {
		Class1 m1=new Class1();
		m1.start();
	}

}
