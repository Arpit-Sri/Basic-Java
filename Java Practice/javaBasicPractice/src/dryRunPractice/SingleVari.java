package dryRunPractice;

import java.util.Scanner;

public class SingleVari {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int sum=0;
		
		while(sum<0) {
			System.out.println("enter the number :");
			
			sum+=sc.nextInt();
			
			if(sum>100) {
				
				break;
			}
		}
		System.out.println("done you have exceeded the limit " +sum);
		

	}

}
