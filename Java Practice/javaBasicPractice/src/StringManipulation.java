
public class StringManipulation {
	
		
	
	
	public  String revString(String s) {
		
		StringBuilder sb= new StringBuilder(s);
		System.out.println(sb.reverse());
		return s;
	}
	
	/*
	 * public String revEntire(String str) {
	 * 
	 * String[] words = str.split(" "); StringBuilder result=new StringBuilder();
	 * 
	 * for(int i =0;i<words.length; i++) {
	 * 
	 * 
	 * } return ""; }
	 */
	
	public  String revTargetString(String s) {
		return s;
		
	}
	
	public  String replaceString(String rs) {
		
		String replaced = rs.replace("Bond", "Heisenberg");
		System.out.println(replaced);
		return replaced;
		
	}
	
	public  String convertToLower(String s) {
		
		System.out.println(s.toLowerCase());
		return s;
		
	}
	
	public  String convertToUpperr(String s) {
			
		System.out.println(s.toUpperCase());
		  return s;
		
		
	}
	
	public  int countEachWords(String str) {
		String[] words=str.split(" ");
		int count = words.length;
		System.out.println("no of words are: "+count);
		return count;
		
	}
	
	public  int vowelCount(String rs) {
		
		int vowelC=0;
		String vowels="aeiouAEIOU";
		for(int i=0; i<rs.length(); i++) {
			if(vowels.indexOf(rs.charAt(i) )!=-1) {
				vowelC++;
			}
			
		}
		System.out.println(vowelC);
		return vowelC;
		
		
	}
	
	public  int consonentCount(String rs) {
		
		int vowelC=0;
		String vowels="aeiouAEIOU";
		for(int i=0; i<rs.length(); i++) {
			if(vowels.indexOf(rs.charAt(i) )!=-1) {
				vowelC++;
			}
			else {
				System.out.println("itt is not vo");
			}
			
		}
		System.out.println(vowelC);
		return vowelC;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		String rs="My name is Bond";
		
		String str="Say my name";
		String s="Heisenberg";
		StringManipulation sm=new StringManipulation();
		//sm.convertToLower(s);
		
		
		sm.revString(s);
		sm.convertToUpperr(s);
		sm.convertToLower(s);
		//sm.revEntire(str);
		sm.countEachWords(str);
		sm.replaceString(rs);
		sm.vowelCount(rs);
		
		
		
		
		
		
		
		
		
		}
		
	



}
