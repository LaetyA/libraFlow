package LibraFlow.src;

abstract class Livre {
    String titre;
    double prix;

    Livre(String titre, double prix) {
        this.titre = titre;
        this.prix = prix;
    }

    abstract String getDetail();

    String getInfo() {
        return titre + " - " + prix + "€ (" + getDetail() + ")";
    }
}