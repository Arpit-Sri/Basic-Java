package dryRunPractice;
import java.util.Scanner;

public class Demo1{

	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	
	int x=0;
	

	
	while(x<=100){
		
	System.out.print("Enter the number :");
	x+=sc.nextInt();
	if(x>100)
		break;
		
	}
	System.out.println("done : u have reached the limit "+x);
	
	 

 }

}
