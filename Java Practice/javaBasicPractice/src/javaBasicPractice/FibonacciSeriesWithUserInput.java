package javaBasicPractice;

import java.util.Scanner;

public class FibonacciSeriesWithUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number :");
		
		int num = sc.hashCode();
		
		int a=1 , b=1;
		b=1;
		System.out.println(a+" ");
		System.out.println(a+" ");
		
		int f=0;
		
		while(f<=num)
		{
			f=a+b;
			System.out.println(f+" ");
			
			if(f>num) 
			break;
			System.out.println(f+" ");
			a=b;
			b=f;
		}
		
		

	}

}
