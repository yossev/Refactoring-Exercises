// Refactor the OOP Logic to make it make more sense

class Animal {
    public void eat() {
    }

    public void sleep() {
    }

}

/*
 * We delegated the flying animal from the normal animal for a cleaner code
 * without refused bequest
 */

class FlyingAnimal extends Animal {
    public void Fly() {
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

class Bird extends FlyingAnimal {
    public void eat() {
        System.out.println("Bird is eating");
    }

    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}