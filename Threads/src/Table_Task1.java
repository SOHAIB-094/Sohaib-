
public class Table_Task1 extends Thread{

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("26 November");
		}
	}
	public static void main(String[] args) {
	
		Table_Task task1=new Table_Task();
		task1.start();
		Table_Task1 task2=new Table_Task1();
		task2.start();
	}
	

}


