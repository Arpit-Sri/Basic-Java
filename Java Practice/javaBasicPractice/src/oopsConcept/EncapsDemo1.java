package oopsConcept;
class Payment{
	
	private String cardNumber;
    private double amount;
    
// Setter for card number with validation
public void setCardNumber(String cardNumber) {
    if (isValidCard(cardNumber)) {
        this.cardNumber = cardNumber;
    } else {
        System.out.println("Invalid card number. Must be 16 digits.");
    }
}

// Getter for masked card number
public String getCardNumber() {
    return maskCard(this.cardNumber);  // Returns masked version of card number
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

// Method to process the payment
public void processPayment() {
    if (cardNumber != null && amount > 0) {
        System.out.println("Payment of $" + amount + " processed from card: " + getCardNumber());
    } else {
        System.out.println("Payment failed. Check card number and amount.");
    }
}

// Private method to validate card number
private boolean isValidCard(String cardNumber) {
    return cardNumber != null && cardNumber.length() == 16;
}

// Private method to mask the card number (only show last 4 digits)
private String maskCard(String cardNumber) {
    return "**** **** **** " + cardNumber.substring(12);
}
}

public class EncapsDemo1 {
	
	
	 public static void main(String[] args) {
	        Payment payment = new Payment();

	        // Set card number and amount using setter methods
	        payment.setCardNumber("1234567812345678");  // Valid card number
	        payment.setAmount(-100.50);  // Valid amount

	        // Process the payment
	        payment.processPayment();

	        // Access masked card number and amount using getter methods
	        System.out.println("Masked Card: " + payment.getCardNumber());
	        System.out.println("Amount: $" + payment.getAmount());
	    }

}
