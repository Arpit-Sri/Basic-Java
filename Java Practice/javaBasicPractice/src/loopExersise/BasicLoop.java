package loopExersise;

public class BasicLoop {

	public void printEven() {
		for (int i = 1; i <= 100; i++) {

			// printing even nmber
			if (i % 2 == 0) {

				System.out.print(i + " ");
			}

		}
	}

	public void printOdd() {
		for (int i = 1; i <= 100; i++) {

			// printing even nmber
			if (i % 2 != 0 || i == 1) {

				System.out.print(i + " " + "\n");
			}

		}
	}

	public void evenDecreasing() {
		for (int i = 100; i >= 1; i--) {

			// printing even nmber
			if (i % 2 == 0 || i == 1) {

				System.out.print(i + " ");
			}

		}
	}

	public void oddDecreasing() {
		for (int i = 100; i >= 1; i--) {

			// printing even nmber
			if (i % 2 != 0 || i == 1) {

				System.out.print(i + " ");
			}

		}
	}

	// wap to print the even number b/w 1 to 100 in an increasing order.
	public static void main(String[] args) {
		BasicLoop obj = new BasicLoop();

		/*
		 * obj.printEven(); obj.printOdd();
		 * 
		 * obj.evenDecreasing();
		 */
		
		obj.oddDecreasing();

	}

}
