package LibraFlow.src;

@Auteur(date = "25 avril 2026", nom = "moi")
abstract class Livre {
    String titre;
    double prix;

    Livre(String titre, double prix) {
        this.titre = titre;
        this.prix = prix;
    }

    abstract String getDetail();

    @NePasToucher(interdiction = "ne pas toucher en production")
    String getInfo() {
        return titre + " - " + prix + "€ (" + getDetail() + ")";
    }
}