
public class LamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LamdaExpression lamdaExp=new LamdaExpression();
		
		// interface implementation
		Greetings greetings=new GreetingsImpl(); 
		//lamdaExp.performance(greetings);
		
		//lamda expression implementation 
		// actually it is interface 'Greetings' implementation
		// this lamda expression  is type of Greetings
		Greetings GreetingExpressionFunction=() -> System.out.println(" you are in perform");
		//addNumber addfunction=(int a,int b)-> a+b;
		
		// annonyamous inner class
		// it is not the object of interface
		Greetings innerClassgreetings=new Greetings(){
			public void perform(){
				System.out.println("hellow world");
			}
			
		};
		
		//System.out.println(GreetingExpressionFunction.foo());
		//System.out.println(""+addfunction.add(5, 3));
		//GreetingExpressionFunction.perform();
		lamdaExp.performance(GreetingExpressionFunction);
		lamdaExp.performance(innerClassgreetings);
		
		

	}
	
	public void performance(Greetings greetings){
		greetings.perform();
		
	}


}


interface MyLamda{
	void foo();
}

interface addNumber{
	int add(int a,int b);
}
