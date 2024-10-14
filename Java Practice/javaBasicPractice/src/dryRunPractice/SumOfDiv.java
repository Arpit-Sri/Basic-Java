package dryRunPractice;

import java.util.Scanner;

public class SumOfDiv {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int ui=s.nextInt(); 
		
		int i=1;
		int sum=0;
		
		while(i<=ui/2) {
		
			if(ui%i==0) {
				sum=sum+i;
					
			}
			i++;
			
			
			
		}
		System.out.println(sum);
		
		

	}

}
