// Refactoring Step 1: Create a new object that will be fed into the parameter

class Card {
    String cardNumber;
    int expMonth;
    int expYear;
    int cvv;

    public Card(String cardNumber, int expMonth, int expYear, int cvv) {
        this.cardNumber = cardNumber;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.cvv = cvv;
    }

}

// Refactoring Step 2: Use in processPayment
// This way you have cleaner shorter parameter lists

class PaymentProcessor {
    public void processPayment(String customerName, Card card) {
    }
}
