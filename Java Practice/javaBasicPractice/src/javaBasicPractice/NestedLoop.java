package javaBasicPractice;

public class NestedLoop {

	public static void main(String[] args) {
		
		/* O/P should be 
		
		*
		**
		***
		****
		*****
		
		
		*/
		
		
		/*String str="#";
		Integer num=Integer.valu
		System.out.println(num);
		num++;
		System.out.println(num); */
		
		/*for(int i=0; i<=5; i++) {
			
			for(int j=0; j<=5; j++) 
			{
			System.out.println("value of I: "+i+" value of J: "+j);
			
			//System.out.println(i+j);
			}
			
		System.out.println("*******");
		}*/
		
		
	/*	for(int i=0; i<3; i++)
		{
			
			for(int j=0; j<3; j++) 
			{
			System.out.println("\n"+"*");
			
			//System.out.println(i+j);
			}
			
		
		}*/
		
		/*for(int i=1;  i<5; i++) 
		{
		System.out.println("1\n 1\n  1\n   1");
		}
		*/
		String str="*";
		
		for(int i=1;  i<=3; i++) 
		{
			
			//System.out.println(i);
			
			for(int j=1;  j<=i; j++)
			{
				
				
				
				System.out.print(str);
				
				}
			System.out.println();
		
			
		}
		
		//System.out.println("*\n"+"**"+"\n***"+"\n****");
		
	
		
		
		
		
		
	}
		
	
		

	

}
