package dryRunPractice;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter the desired number :");
		int n=s.nextInt();
		int sum=1;
		
	
		
		
		for(int i=2; i<=n/2; i++ ) 
			if(n%i==0) 
					sum+=i;
			
				System.out.println(sum==1 ?"prime number":"not a Prime");
			
				
			
				
				
			
		
		
		}

	

}
