class Customer {
    private String street;
    private String city;
    private String postalCode;

    public void printAddress() {
        System.out.println(street + ", " + city + ", " + postalCode);
    }
}

class Order {
    private String street;
    private String city;
    private String postalCode;
}

// Question: How would you refactor these classes to avoid data clumps?