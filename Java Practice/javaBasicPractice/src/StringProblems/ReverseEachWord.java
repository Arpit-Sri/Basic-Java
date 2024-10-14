package StringProblems;

public class ReverseEachWord {

	 void case4() {
		
		String str="My name is Bond" ;
		String[]  words= str.split(" ");
		
		StringBuilder results = new StringBuilder();
		
		for(int i=0; i<words.length; i++) {
			
			StringBuilder sb= new StringBuilder(words[i]);
			results.append(sb.reverse().append(" "));
			
		}
		
		System.out.println(results.toString().trim());
	}
	
	 //change case of Each charactor 
	 void case5() {
		 
		String str="My name is Bond";
		 
		String lower=str.toLowerCase();
		String upper=str.toUpperCase();
		
		System.out.println(lower);
		System.out.println(upper);
		 
	 }
	 
	 //target some random charchtor and replace with another
	 void case6() {
		 
		 String str="My name is Band";
		 
		 char target='B';
		 char target1='s';
		 char replacement ='G';
		 char replacement1='Z';
		 
		 String result=str.replace(target, replacement).replace(target1, replacement1);
		 System.out.println(result);
		 

}
	 
	 //swapping the case(lower to upper, upper to lower)
	static void case7() {
		 
		 String str="My name is James Bund hellOO ThErE";
		 StringBuilder swappedCase= new StringBuilder();
		 
		 for(int i =0; i<str.length(); i++)
		 {
			char ch= str.charAt(i);
			//check if the character in lower case
			if(Character.isLowerCase(ch))
			{
				swappedCase.append(Character.toUpperCase(ch));
			}
			//convert into lower case 
			else
			{
				swappedCase.append(Character.toLowerCase(ch));
			
			}
			
		 }
		 
		 System.out.println(swappedCase.toString());
		 
		 
	 }
	
	        //replacement of a specfic charcter
			void case8()
				{
				String str = "My name Is Bond";
				
		
				}
	public static void main(String args[]) {
		
		//ReverseTheEntireString revString = new ReverseTheEntireString();
		//srevString.case2();
		
		//revString.case1();
		
		
		ReverseEachWord revEach = new ReverseEachWord();
		revEach.case4();
		
		revEach.case5();
		
		revEach.case6();
		
		ReverseEachWord.case7();
		
		
		
	}
	
	
}
