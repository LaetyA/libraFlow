package LibraFlow.src;

public final class LivreNumerique extends Livre implements Achetable {
    final String format;
    double prixAchat;
    static final double TVA = 5.5;

    LivreNumerique(String titre, double prix, String format,TypeLivre type) {
        super(titre, prix,type);
        this.format = format;
    }

    LivreNumerique(String titre, double prix, String format, double prixAchat,TypeLivre type) {
        super(titre, prix,type);
        this.format = format;
        this.prixAchat = prixAchat;
    }

    @Override
    String getDetail() {
        double ttc = prix * (1 + TVA / 100);
        return "format: " + format + " - TTC: " + ttc + "€";
    }

    @Override
    public double prixAchat() {
        return prixAchat;
    }
}