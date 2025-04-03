class Player {
    private Weapon weapon;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.use();
    }

    public void reloadWeapon(int ammo) {
        weapon.reload(ammo);
    }
}