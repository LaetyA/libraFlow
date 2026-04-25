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
        LivreAudio[] catalogue = {
                new LivreAudio("Dune", 15.0, 300, 14),
                new LivreAudio("1984", 12.0, 240, 7)
        };

        for (LivreAudio e : catalogue) {
            System.out.println(e.dureeEmprunt());
            System.out.println(e.titre);
        }
        Livre l = new LivreNumerique("Dune", 12.0, "PDF");
        System.out.println(Livre.class.getAnnotation(Auteur.class));
        // for (Livre livre : tableau) {

        // System.out.println(livre.getInfo());
        // }

    }

    static void afficher(Livre l) {
        System.out.println(l.getInfo());
    }
}