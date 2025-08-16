// My initial thought was Strategy Design Pattern.
interface PayingStrategy {
    void pay();
}

// Different Strategies for paying
class creditStrategy implements PayingStrategy {

    @Override
    public void pay() {
        System.out.println("Paying by credit");
    }

}

class paypalStrategy implements PayingStrategy {

    @Override
    public void pay() {
        System.out.println("Paying by paypal");
    }

}

class cryptoStrategy implements PayingStrategy {

    @Override
    public void pay() {
        System.out.println("Paying by crypto");
    }

}

// Main PaymentProcessor class
class PaymentProcessor {
    private PayingStrategy startegy;

    public PaymentProcessor(PayingStrategy startegy) {
        this.startegy = startegy;
    }

    public void pay() {
        startegy.pay();
    }

}

// PaymentProcessor processor = new PaymentProcessor(new paypalStrategy())
// processor.pay()
// This is a much cleaner code.