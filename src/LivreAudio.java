package LibraFlow.src;

class LivreAudio extends Livre implements Empruntable {
    int dureeMinutes;
    int dureeEmprunt;

    LivreAudio(String titre, double prix, int dureeMinutes, int dureeEmprunt,TypeLivre type) {
        super(titre, prix,type);
        this.dureeMinutes = dureeMinutes;
        this.dureeEmprunt = dureeEmprunt;
    }

    @Override
    String getDetail() {
        return "Type de livre :"+ type + " ;"+dureeMinutes + "min - durée emprunt : " + dureeEmprunt ;
    }

    @Override
    public int dureeEmprunt() {
        return dureeEmprunt;
    }
}