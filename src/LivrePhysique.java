package LibraFlow.src;

class LivrePhysique extends Livre implements Empruntable, Achetable {
    int dureeEmprunt;
    double prixAchat;

    LivrePhysique(String titre, double prix, int dureeEmprunt, double prixAchat,TypeLivre type) {
        super(titre, prix,type);
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

    @Override
    public boolean equals(Object obj){
        if(obj ==null)return false;
        if(!(obj instanceof LivrePhysique)) return false;
        LivrePhysique livre  = (LivrePhysique)obj;
        return livre.titre.equals( this.titre) && livre.prix==this.prix;
    }

    @Override
    public String toString(){
        return getDetail();
    }
    @Override
    public int hashCode(){
        return this.titre.hashCode();
    }
}