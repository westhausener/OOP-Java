class Weapon {
    String name;
    int damage;
    int ammo;

    public Weapon(String name, int damage, int ammo) {
        this.name = name;
        this.damage = damage;
        this.ammo = ammo;
    }

    public void use() {
        if (ammo > 0) {
            System.out.println(name + " verursacht " + damage + " Schaden.");
            ammo--;
        } else {
            System.out.println(name + " hat keine Munition mehr!");
        }
    }

    public void reload(int ammo) {
        this.ammo += ammo;
        System.out.println(name + " wurde nachgeladen. Munition: " + this.ammo);
    }
}
