package LibraFlow.src;

@Auteur(date = "25 avril 2026", nom = "moi")
abstract class Livre {
    final String titre;
    final double prix;
    TypeLivre type;

    Livre(String titre, double prix,TypeLivre type) {
        this.titre = titre;
        this.prix = prix;
        this.type=type;
    }

    abstract String getDetail();

    @NePasToucher(interdiction = "ne pas toucher en production")
    final String getInfo() {
        return titre + " - " + prix + "€ (" + getDetail() + ")";
    }
        
    
}