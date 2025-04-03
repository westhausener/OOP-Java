public class FortniteGameWithPlayer {
    public static void main(String[] args) {
        Player player = new Player("FortnitePro");
        Weapon weapon = new SniperRifle();

        player.setWeapon(weapon);
        player.attack(); 
        player.reloadWeapon(5); 
    }
}