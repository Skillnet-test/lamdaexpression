
public class RunnableExample {

	public static void main(String[] args) {
		// using annonimous inner class
		/*Thread t=new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("here i am");
				
			}
				
				
		});
		
		t.start();
*/		//t.run();
		
		// using lamda expression
		Thread myThread=new Thread(()->System.out.println("here i am"));
		myThread.start();
		
		
		
		

	}

}
