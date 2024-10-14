package oopsConcept;

class Human {

	private int age;
	private String name;

	// the only way to acess these data with help of calling the  method after making the object .

	// creating a method() to acess these data outside this class ,however we can
	// acess these data in this same class.

	
	  public int getAge() {
	  
	  
	  return age; }
	  
	  
	  //now we are setting the value by making the set methhod, so we don't need to return somethig
	  
	  public void setAge(int a) { 
		  age=a; }
	 
	public String getName() {

		return name;

	}

	public void setName(String n) {

		name = n;
	}

}

public class EncapsDemo {

	public static void main(String[] args) {

		Human obj = new Human();

		// obj.age=11;
		// obj.name="James";

		// intead assigning the value to the variable ,assign to the method .
		// obj.setAge(17);
		obj.setName("Bond");

		System.out.println(" : " + obj.getName());

	}

}
