// Refactor Step number 1 : Create a seperate class for the Address object
// Cleaning by creating a dedicated object to Hold the dataclump
class Address {
    private String street;
    private String city;
    private String postalCode;

    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

}

// Refactoring Step number 2 : Use this class in Customer, Order ->
// Address address