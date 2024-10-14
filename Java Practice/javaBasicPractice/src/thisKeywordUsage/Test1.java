package thisKeywordUsage;



public class Test1 {

	
	
	int i;
	
	void setValue(int i) //method 1
	{
		//i=i;
		i=i;
		
	}
	
	void show()  //method 2
	{
		System.out.println(i);
		
	}

	
	public static void main(String[] args) 

	{	Test1 t1 = new Test1();
		
		t1.setValue(17);
		t1.show();
			
	}
	
}
