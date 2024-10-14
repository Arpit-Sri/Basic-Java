package StringProblems;

public class StringManipulation {
	
	public static void reverseEntireString() {
		
		String str="arpit";
		
		//String revEntire =  new StringBuilder(str).reverse().toString();
		StringBuilder rev=new StringBuilder(str).reverse();
		System.out.println(rev);
		
		
		}
	public static void reverseEachString() {
		
		String str="My name is Bond";
		String [] words =str.split(" ");
		StringBuilder result= new StringBuilder();
		
		//System.out.println(eachWord[1]); //to print the ord sapretly as its stored in array.
		
		for(int i=0; i<words.length; i++) {
			
			
		}
		
		
	}
	
	public static void reverseEntireString(double a) {
		
	}
	
	
		
		public static void main(String[] args) {
			
			//reverseEntireString();
			
			reverseEachString();
			
		}
		
		
		
	

}
