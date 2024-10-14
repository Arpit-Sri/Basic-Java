package oopsConcept;

//this keword can be used to  invoke current class construtor.

class ThisCons{
	
	//default construtor 
	ThisCons()
	{
		this(7);
		System.out.println("in default construtor : ");
		
	}
	
	//paramenterized construtor 
	ThisCons(int a)
	{
		 //this is calling a deafult constructor 
		System.out.println("in parameterized construtor ");
	}
}
public class ThisUsageType3 {

	public static void main(String[] args) {
		
		ThisCons tc=new ThisCons();
		
		
		
	}
	
	

}
