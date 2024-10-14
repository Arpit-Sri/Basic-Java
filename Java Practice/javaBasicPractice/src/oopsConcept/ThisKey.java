package oopsConcept;


class Test{
	
	int i;
	void setValues(int i) {
		this.i=i;
		System.out.println(i);
	}
	void show() {
		
		System.out.println(i);
	}
}
public class ThisKey {

	public static void main(String[] args) {
		
		Test t=new Test();
		t.setValues(13);
		t.show();
	}

}
