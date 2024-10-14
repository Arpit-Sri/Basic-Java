package javaBasicProgram;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the desired number: ");
		int no=s.nextInt();
		//int no=7;
		int temp=0;
		
		for(int i=2; i<no-1; i++) {
			
			if(no%i==0) {
				
				temp=temp+1;
			}
			
		}
		if(temp>0) {
			
			System.out.println("it is not a prime number");
		}
		else {
			System.out.println("it is a prime number");
		}
		
		
		

	}

}
