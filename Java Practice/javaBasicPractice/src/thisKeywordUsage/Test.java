package thisKeywordUsage;

public class Test {
	
	
	int i;  //declaring instace variable
	
	//creating own metod
	void setValue(int i) //method 1
	{
		
		//i=i;
		this.i=i;
		//this.i---> referrign to instance variable or global variable of a current class i.e. "Test" class.
		//i----> referring to a local variable .
		
	}
	
	void show()  //method 2
	{
		System.out.println(i);
		
	}
	
}
