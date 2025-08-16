class PaymentProcessor {
    public void pay(String method) {
        switch (method) {
            case "credit":
                System.out.println("Paying with credit card");
                break;
            case "paypal":
                System.out.println("Paying with PayPal");
                break;
            case "crypto":
                System.out.println("Paying with crypto");
                break;
        }
    }
}

// Exercise: How would you refactor pay()?