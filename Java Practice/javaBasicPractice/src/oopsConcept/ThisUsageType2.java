package oopsConcept;


//this keword can be used to invoke current class method (implicitly)
class ThisDemo{
	
	
	void display() {
		System.out.println("hello there !");
	}
	void show() {
		
		display();     //if we don't use this keyword ,compiler autometically add this keyword while invoking the method.
	   this.display(); //use this keword here is optional. 
	}
}


public class ThisUsageType2 {

	public static void main(String[] args) {
		
		ThisDemo td=new ThisDemo();
		//td.display();
		td.show();
	}

}
