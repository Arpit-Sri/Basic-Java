package StringProblems;

public class BasicsOperators {

	void unaryOperators() {
		
		int x=5;
		System.out.println(++x);
		
		boolean y=true;
		
		System.out.println(!y);
		
	}
	
	 void binaryOperators() {
		
		int x=7;
		System.out.println(x+9);
		
		int a=7;
		int z=8;
		System.out.println(a+z);
	}
	 
	 void ternaryOperators() {
		 
		 int x=10;
		 
		 
		String result= (x==10)?"X is 10":"X is not 10";
		System.out.println(result);
		
		int y =12;
		
		boolean result1= (y==12)?true:false;
		System.out.println(result1);
		 
	 }
	
	

	
	public static void main(String[] args) {
		
		BasicsOperators op = new BasicsOperators();
		
		op.unaryOperators();
		op.binaryOperators();
		op.ternaryOperators();
		
		
		
	}

}
