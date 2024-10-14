package importaceOfClassAndObject;


class Computer {
	 
				//method1
	 			public void playMusic() {
		
	 					System.out.println("music playing...");
	 			}
	
	 			//method2
	 			public String xeroxMachine(int cost) {
		
	 					System.out.println("ready to print");
	 					if(cost>=5)
	 					return "Xerox sucessfully"; 
	 					
	 					else
	 						return "insuffcient balace";
	 			}
	
	
}
public class MethodCalling {

	
	public static void main(String[] args) {

		
		int price=3;
		Computer com = new Computer();
		
		com.playMusic();
		
		String result = com.xeroxMachine(price);
		System.out.println(result);
		

	}

}
