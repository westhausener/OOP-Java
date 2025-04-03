class AssaultRifle extends Weapon {
    public AssaultRifle() {
        super("Assault Rifle", 30, 30);
    }

    @Override
    public void use() {
        if (ammo > 0) {
            System.out.println(name + " feuert schnell und verursacht " + damage + " Schaden.");
            ammo--;
        } else {
            System.out.println(name + " hat keine Munition mehr!");
        }
    }
}