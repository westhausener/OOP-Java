public class FortniteGame {

    public static void main(String[] args) {
        AssaultRifle af1 = new AssaultRifle();
        Weapon weapon2 = new Weapon("AR-15", 15, 190);

        AssaultRifle af2 = (AssaultRifle) weapon2;

        System.out.println(af2.name); // Ausgabe: 0.0, weil SniperRifle keine speedOfFire hat

        Weapon w1 = af1;



        w1.name = "AK-47";
        System.out.println(w1.damage);

        af1.use(); // Ausgabe: Assault Rifle feuert schnell und verursacht 30 Schaden.
        weapon2.use(); // Ausgabe: Sniper Rifle feuert präzise und verursacht 90 Schaden.

        af1.reload(10); // Ausgabe: Assault Rifle wurde nachgeladen. Munition: 40
        weapon2.reload(3);  // Ausgabe: Sniper Rifle wurde nachgeladen. Munition: 8

        System.out.println(w1 instanceof Weapon);
        System.out.println(w1 instanceof AssaultRifle);


    }

}
