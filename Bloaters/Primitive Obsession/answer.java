// Refactor step 1: Extract address

class Address {
    private String street;
    private String city;
    private String zip;

    public Address(String street, String city, String zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
    }
}

// Refactor step 2: extract Customer

class Customer {
    private String name;
    private Address address;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

// Refactor Step 3: Use in Order

class Order {
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }
}