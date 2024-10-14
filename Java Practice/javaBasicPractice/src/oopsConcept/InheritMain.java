package oopsConcept;


//SciCalc extends AdvCalc
//AdvCalc extends Calc
//as we can see Calc-Parent Class or Super Class of evry Class
//AdvCalc is child Class of Calc Class and Parent class of SciCalc Class
public class InheritMain {

	public static void main(String[] args) {
		
		SciCalc obj=new SciCalc();
				
		int r1=obj.add(7,4);
		int r2=obj.sub(15,9);
		int r3=obj.multi(7,3);
		int r4=obj.div(15,9);
		int r5=obj.power(2,4);
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
		
		//SciCalc obj = new SciCalc();
		//System.out.println(obj.power(2,3));

	}

}
