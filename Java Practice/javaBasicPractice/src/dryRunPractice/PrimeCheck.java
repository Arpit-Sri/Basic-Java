package dryRunPractice;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the desired number :");
		int n=s.nextInt();
		int sum=0;
		
		for(int i=1; i<=n/2; i++) {
			
			if(n%i==0) {
				System.out.println("");
			}
			
		}
		
		

	}

}
