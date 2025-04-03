public class FortniteGame {

    public static void main(String[] args) {
        Weapon weapon1 = new AssaultRifle();
        Weapon weapon2 = new SniperRifle();

        weapon1.use(); // Ausgabe: Assault Rifle feuert schnell und verursacht 30 Schaden.
        weapon2.use(); // Ausgabe: Sniper Rifle feuert präzise und verursacht 90 Schaden.

        weapon1.reload(10); // Ausgabe: Assault Rifle wurde nachgeladen. Munition: 40
        weapon2.reload(3);  // Ausgabe: Sniper Rifle wurde nachgeladen. Munition: 8
    }

}
