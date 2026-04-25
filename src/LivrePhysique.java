package LibraFlow.src;

class LivrePhysique extends Livre implements Empruntable, Achetable {
    int dureeEmprunt;
    double prixAchat;

    LivrePhysique(String titre, double prix, int dureeEmprunt, double prixAchat) {
        super(titre, prix);
        this.dureeEmprunt = dureeEmprunt;
        this.prixAchat = prixAchat;
    }

    @Override
    String getDetail() {
        return titre + " - " + prixAchat + "€ - emprunt : " + dureeEmprunt + "j";
    }

    @Override
    public int dureeEmprunt() {
        return dureeEmprunt;
    }

    @Override
    public double prixAchat() {
        return prixAchat;
    }
}