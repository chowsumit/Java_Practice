package newjavapackage;

public class Multy_thread_example extends Thread {

	/**
	 * @param args
	 */
	
	public void run(){
		
		System.out.println("Thread is running.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multy_thread_example multi = new Multy_thread_example();
		
		multi.run();
	}

}
