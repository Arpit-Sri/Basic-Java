package importaceOfClassAndObject;


//here we can say it is a design or implementation class where we are implementing something.
class Calculator{
	
		//int a;
	
	
	
		//these parameter in this bracket(int n1,int n2,int n3) is acting like a reciver whic reciev the value from the main method.
		public int add(int n1, int n2, int n3) {
			
			
			
			int r= n1+n2+n3;   //r is the refrence variable of the sum n1 n2 n3
			
			return r;  //now "return" will return the value to the main method . 
		
			
		}
	
		//int n1 =num1;
		//int n2 =num2;
		//int n3 =num3;
	
}

//here we are calling an object and assigning or passing some values to the Calculator class and aslo running the program .
public class BasicClass {

	public static void main(String[] args) {
		
		int num1=7;
		int num2=4;
		int num3=-4;
		
		Calculator calc=new Calculator();
	
		//calc.add(7,5,-5);
		int result = calc.add(num1,num2,num3);   //we are passing these values to the method "add" in Calculator class.
		
		//System.out.println(calc.add(num1,num2,num3));
		System.out.println(result);
		

	}

}
