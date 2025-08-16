class Animal {
    public void eat() {
    }

    public void sleep() {
    }

    public void fly() {
    }
}

class Dog extends Animal {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Dogs can't fly!");
    }
}

// How would you refactor Dog to avoid Refused Bequest