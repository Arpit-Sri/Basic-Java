package oopsConcept;

class Ptm {
    // Private fields to hide sensitive data
    private String cardNumber;
    private double amount;

    // Setter for card number with validation
    public void setCardNumber(String cardNumber) {
        if (cardNumber.length() == 16) {
            this.cardNumber = cardNumber;
        } else {
            System.out.println("Invalid card number. It must be 16 digits.");
        }
    }

    // Getter for masked card number (show only last 4 digits)
    public String getCardNumber() {
        if (cardNumber != null) {
            return "**** **** **** " + cardNumber.substring(12);
        } else {
            return "No valid card number.";
        }
    }

    // Setter for amount with validation
    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("Amount must be greater than 0.");
        }
    }

    // Getter for amount
    public double getAmount() {
        return amount;
    }
}
class EncapsDemo2 {

	public static void main(String[] args) {
		
		Ptm ptm = new Ptm();

        // Set invalid card number
     //   payment.setCardNumber("12345678");  // Invalid card number, should print error

        // Set valid card number
      // ptm.setCardNumber("1234567812345678");  // Valid card number

        // Set invalid amount
     //  ptm.setAmount(-50.25);  // Invalid amount, should print error

        // Set valid amount(here we are passing the value of amount to the method whio acepting the value or argunet )
		ptm.setAmount(150.75);  // Valid amount 
        
       // System.out.println(ptm.getAmount());

        // Access card number and amount using getters
       System.out.println("Card Number: " + ptm.getCardNumber());
      // System.out.println("Amount: $" + ptm.getAmount());
        
        
	}

}
