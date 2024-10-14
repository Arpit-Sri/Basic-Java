package importaceOfClassAndObject;




class Calculator1{
	
		
		public int sum(int n1 ,int n2,int n3) {
			
			int r=n1+n2+n3;
			return r;
		}
		
		//method 1
		public String sum(int n1) {
			
			if(n1>=18)
			return "you are an adult";
			
			return "hold on! kiddo";
		}
		//method  2
		public String sum(String str) {
			
			String disPlay="A "+str;
			return disPlay;
		}
		//method 3
		public double sum(double n1 ,int n2,int n3) {
			
			double r=n1+n2+n3;
			return r;
		}
		
		//method 4
	/*	public String sum(String s) {
			
			String y="he";
			if(s.equals(y))
			return "you are a boy";
			return "hell! no";
			
			//what we sses here is that we have a same method name but have to satisfy this condtion i.e. 
			//the no. of paramenter must be diffrent 
			//must accepet the diffrent data type 
			//this is called "method overloading".
			
			//return "hold on! kiddo";
		}
	*/
}
		public class MethodOverloading {

					public static void main(String[] args) {
		
								//we need to execute the methods from the Caluclator class for that we need to make an object(instace).
								Calculator1 calC= new Calculator1();
								
								
								int iValue = calC.sum(7,6,-6);
								System.out.println(iValue);
								
								String sValue = calC.sum(17);
								System.out.println(sValue);
								
								double dValue = calC.sum(5.0336, 5454, 54);
								System.out.println(dValue);
								
								
								//String stringVal = calC.sum("he");
								//System.out.println(stringVal);
								
								String engVocab = calC.sum("for Apple");
								System.out.println(engVocab);
										
								
								
								 
		
		
		}

}
