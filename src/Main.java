package LibraFlow.src;

public class Main {
    public static void main(String args[]) {
        // Livre l1 = new LivreAudio("Dune", 12.0, 40);
        // LivreNumerique l2 = new LivreNumerique("Dune", 8.0, "PDF");
        // LivreAudio l3 = new LivreAudio("Dune", 10.0, 480);

        // afficher(l1);
        // afficher(l2);
        // afficher(l3);
        // Livre[] tableau = new Livre[3];
        // tableau[0] = l1;
        // tableau[1] = l2;
        // tableau[2] = l3;
        Livre l1 = new LivreAudio("Dune", 12.0, 480);
        Livre l2 = new LivreNumerique("Dune", 12.0, "PDF");
        System.out.println(l1.getInfo());
        System.out.println(l2.getInfo());
        // for (Livre livre : tableau) {

        // System.out.println(livre.getInfo());
        // }

    }

    static void afficher(Livre l) {
        System.out.println(l.getInfo());
    }
}