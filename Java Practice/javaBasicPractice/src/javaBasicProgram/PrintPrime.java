package javaBasicProgram;

public class PrintPrime {

	public static void main(String[] args) {
		
		
	
		for(int i=0; i<100; i++) {
			
			boolean isPrime=true;
			
			for(int j=0; j<i; j++) {
				
				if(j%i==0) {
					isPrime=false;
				}
				
				
				
				}
			if(isPrime) {
				System.out.println(i);
			}
			
				
			}
		
		
		}

	

}
