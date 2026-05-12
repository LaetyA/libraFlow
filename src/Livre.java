package LibraFlow.src;

@Auteur(date = "25 avril 2026", nom = "moi")
abstract class Livre {
    final String titre;
    final double prix;

    Livre(String titre, double prix) {
        this.titre = titre;
        this.prix = prix;
    }

    abstract String getDetail();

    @NePasToucher(interdiction = "ne pas toucher en production")
    final String getInfo() {
        return titre + " - " + prix + "€ (" + getDetail() + ")";
    }
}