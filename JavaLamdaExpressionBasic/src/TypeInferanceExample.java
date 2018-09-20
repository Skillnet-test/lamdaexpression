
public class TypeInferanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeInferanceExample.methodExpression(s-> s.length());

	}
	
	
	public static void methodExpression(testInferance myLamda){
		//testInferance myLamda=s-> s.length();
		System.out.println(myLamda.returnLength("hellow"));
		
		
	}

}

 interface testInferance{
	int returnLength(String s);
	
}
