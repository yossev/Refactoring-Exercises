class Hero {
    private int stamina;
    private int health;
    private Armor armor; // Using Extract Class method

    public void defense() {
        // ...
    }

    public void attack() {
        // ...
    }
}

class Armor {
    int health;
    int status;
    String rarity;

    void getHealth() {
        // ...
    }
}