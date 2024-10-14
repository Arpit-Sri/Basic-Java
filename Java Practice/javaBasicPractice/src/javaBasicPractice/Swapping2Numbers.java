package javaBasicPractice;

public class Swapping2Numbers {

	public static void main(String[] args) {
		
		int a = 13,  b = 7;
		System.out.println("before swapping :" +a+ " "+b  );
		
		//logic1 using 3rd Variable   
		
		/*int c = a;
		a=b;
		c=b;
		
		System.out.println("After swapping  :" +a+ " "+b  );
		*/
		
		
		//logic2 without using 3rd Variable Use + and -
		
		/*a=a+b;
		b=a-b;
		a=a-b;
		*/
		
		//logic2 without using 3rd Variable Use * and / Only applicable  if these value is non-zero
		
		/*a=a*b;
		b=a/b;
		a=a/b;
		*/
		
	
		
		
		//logic4 using  bitwise xor(^)
		
		/*a=a^b;  
		b=a^b;
		a=a^b;	
		*/
		
		
		//logic5
		b=a+b-(a=b);
		
		System.out.println("After swapping :" +a+ " "+b  );
	}

}
