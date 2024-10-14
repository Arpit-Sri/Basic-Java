package StringProblems;

public class ReverseTheEntireString {

	static  void case1() {
		
		String str="My name is Bond" ;
		String reversed =new StringBuilder(str).reverse().toString();
		
		System.out.println(reversed);
		
		//int a =3;
	//	int b =1;
		//int y=a-b;
	//	System.out.println(y);

		
	}
	
	void case2() {
		
		System.out.println("hell no");
	}
	
	
	 
	 public static void main(String args[]) {
		 
		 
		 //as this method(case1) a static method , we can directly call with class name and method name .
		 ReverseTheEntireString.case1();
		 
		 
		 //as the case2 is non-static method ,we have to make an object first with the help of class name and new keyoword .
		 ReverseTheEntireString revString = new ReverseTheEntireString();
		 
		 revString.case2();
	 }
	 
	 
}
