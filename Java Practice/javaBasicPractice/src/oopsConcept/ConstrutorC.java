package oopsConcept;

class A{
	//default constructor 
	public A()
	{
		super();
		System.out.println("in A");
	}
	//parameterized constructor
	public A(int n) 
	{
		super();
		System.out.println("in A int");
	}
	
}

class B extends A {
	
	public B()
	{
		super();
		System.out.println("in B");
	}
	
	public B(int n)
	{
		super();
		System.out.println("in B int");
		
	}
}

public class ConstrutorC {

	public static void main(String[] args) {

		B obj = new B(7);
	}

}
