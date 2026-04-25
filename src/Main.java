package LibraFlow.src;

public class Main {
    public static void main(String args[]) {
        Livre l1 = new Livre("Dune", 12.0);
        LivreNumerique l2 = new LivreNumerique("Dune", 8.0, "PDF");
        LivreAudio l3 = new LivreAudio("Dune", 10.0, 480);

        afficher(l1);
        afficher(l2);
        afficher(l3);
        Livre[] tableau = new Livre[3];
        tableau[0] = l1;
        tableau[1] = l2;
        tableau[2] = l3;

        // for (Livre livre : tableau) {

        // System.out.println(livre.getInfo());
        // }

    }

    static void afficher(Livre l) {
        System.out.println(l.getInfo());
    }
}