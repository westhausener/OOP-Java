package Fornite;
class Player {
    private String name;
    private int health;
    private int shield;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.shield = 50;
    }

    public void takeDamage(int amount) {
        if (shield > 0) {
            int damageToShield = Math.min(shield, amount);
            shield -= damageToShield;
            amount -= damageToShield;
        }
        health = Math.max(health - amount, 0);
    }

    public void heal(int amount) {
        health = Math.min(health + amount, 100);
    }

    public String toString() {
        return "Spieler " + name + ": " + health + " HP, " + shield + " Schild";
    }

    public static void main(String[] args) {
        Player player1 = new Player("Ninja");
        System.out.println(player1);
        player1.takeDamage(30);
        System.out.println(player1);
    }
}
