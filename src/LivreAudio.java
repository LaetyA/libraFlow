package LibraFlow.src;

class LivreAudio extends Livre implements Empruntable {
    int dureeMinutes;
    int dureeEmprunt;

    LivreAudio(String titre, double prix, int dureeMinutes, int dureeEmprunt, TypeLivre type) {
        super(titre, prix, type);
        this.dureeMinutes = dureeMinutes;
        this.dureeEmprunt = dureeEmprunt;
    }

    @Override
    String getDetail() {
        return "Type de livre : " + type + " ; " + dureeMinutes + "min - durée emprunt : " + dureeEmprunt;
    }

    @Override
    public int dureeEmprunt() {
        return dureeEmprunt;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof LivreAudio))
            return false;
        LivreAudio livre = (LivreAudio) obj;
        return livre.titre.equals(this.titre);
    }

    @Override
    public String toString() {
        return "Type de livre : " + this.titre;
    }

    @Override
    public int hashCode() {
        return this.titre.hashCode();
    }

    static void afficher(Livre l) {
        if (l instanceof LivreNumerique) {
            LivreNumerique livre = (LivreNumerique) l;
            System.out.println(livre.getInfo() + "format:" + livre.format);
        } else if (!(l instanceof LivreAudio)) {
            System.out.println(l.getInfo());
        }

        else {
            LivreAudio livre = (LivreAudio) l;
            System.out.println(livre.getInfo() + livre.dureeMinutes + "min");
        }
    }
}