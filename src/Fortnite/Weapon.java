package Fornite;
class Weapon {
    private String name;
    private int damage;
    private int ammo;

    public Weapon(String name, int damage, int ammo) {
        this.name = name;
        this.damage = damage;
        this.ammo = ammo;
    }

    public int shoot() {
        if (ammo > 0) {
            ammo--;
            return damage;
        } else {
            System.out.println("Keine Munition!");
            return 0;
        }
    }

    public void reload(int amount) {
        ammo += amount;
    }

    public String toString() {
        return "Waffe: " + name + ", Schaden: " + damage + ", Munition: " + ammo;
    }

    public static void main(String[] args) {
        Weapon weapon1 = new Weapon("Scar", 35, 30);
        System.out.println(weapon1);
        int damage = weapon1.shoot();
        System.out.println("Schaden verursacht: " + damage);
        System.out.println(weapon1);
    }
}
