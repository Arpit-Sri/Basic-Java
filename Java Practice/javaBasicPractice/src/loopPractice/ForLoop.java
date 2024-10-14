package loopPractice;

public class ForLoop {
	
	
	//for loop
	void case1() {
		
		for(int i=0; i<=10; i++) {
			
			System.out.println(i);
		}
		
	}
	
	static void case2() {
		
		for(int i =10; i>=0; i--) {
			
			System.out.println(i);
		}
		
	}
		//for each loop
		void case3() {
		int [] x= {3,4,8,9,4,50};
		
		for(int temp:x) {
			
			System.out.println(temp);
		}
		
		}
	
	public static void main(String args[]) {
		
		//ForLoop fL=new ForLoop();
		//fL.case1();
		
		//static method calling with class and method refrence coz it's a static method no need to make an object
		//ForLoop.case2();
		
		
		ForLoop fL1=new ForLoop();
		fL1.case3();
	}

}


