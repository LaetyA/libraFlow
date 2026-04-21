package LibraFlow.src;

class Livre {
    String titre;
    double prix;

    Livre(String titre, double prix) {
        this.titre = titre;
        this.prix = prix;
    }

    String getInfo() {
        return titre + " - " + prix + "€";
    }
}