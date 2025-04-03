class SniperRifle extends Weapon {
    public SniperRifle() {
        super("Sniper Rifle", 90, 5);
    }

    @Override
    public void use() {
        if (ammo > 0) {
            System.out.println(name + " feuert präzise und verursacht " + damage + " Schaden.");
            ammo--;
        } else {
            System.out.println(name + " hat keine Munition mehr!");
        }
    }
}