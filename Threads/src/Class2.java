

public class Class2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is running");

		
	}
	public static void main(String[] args) {
		Class1 class1=new Class1();
		Class2 class2=new Class2();
		Thread class_t1=new Thread(class2);
		Thread class_t2=new Thread(class2);
		class_t1.start();
		class_t1.setName("Asher Tameem ");
		class_t1.setPriority(3);
		class_t2.start();
		class1.setPriority(5);
		class_t2.setPriority(4);
		System.out.println(class_t1.getName());
		System.out.println("Number of threads " + Thread.activeCount());
		
		
		
		
	}
}
