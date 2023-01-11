
public class Table_Task extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("BSE-2020F-004");
		}
	}
	public static void main(String[] args) {
	
		Table_Task task1=new Table_Task();
		task1.start();
	}
	

}
