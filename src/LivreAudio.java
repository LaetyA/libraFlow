package LibraFlow.src;

class LivreAudio extends Livre implements Empruntable {
    int dureeMinutes;
    int dureeEmprunt;

    LivreAudio(String titre, double prix, int dureeMinutes, int dureeEmprunt) {
        super(titre, prix);
        this.dureeMinutes = dureeMinutes;
        this.dureeEmprunt = dureeEmprunt;
    }

    @Override
    String getDetail() {
        return dureeMinutes + "min - durée emprunt : " + dureeEmprunt;
    }

    @Override
    public int dureeEmprunt() {
        return dureeEmprunt;
    }
}