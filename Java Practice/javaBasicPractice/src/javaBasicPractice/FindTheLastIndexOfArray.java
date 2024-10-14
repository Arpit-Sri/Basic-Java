package javaBasicPractice;

public class FindTheLastIndexOfArray {

	public static void main(String[] args) {
		
		int[] ar = {6,7,8,9,7,2,5,50};
		
		int sizeOfAr = ar.length;
		
		int lastIndexofArray = sizeOfAr-1;
		
		
		System.out.println(lastIndexofArray);
		System.out.println(ar[lastIndexofArray]);

	}

}
