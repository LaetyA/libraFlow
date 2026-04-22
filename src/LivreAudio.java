package LibraFlow.src;

class LivreAudio extends Livre {
    int dureeMinutes;

    LivreAudio(String titre, double prix, int dureeMinutes) {
        super(titre, prix);
        this.dureeMinutes = dureeMinutes;
    }

    @Override
    String getInfo() {
        return super.getInfo() + " (" + dureeMinutes + " min)";
    }
}