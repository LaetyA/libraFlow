package LibraFlow.src;

public final class LivreNumerique extends Livre implements Achetable {
    final String format;
    double prixAchat;
    static final double TVA = 5.5;

    LivreNumerique(String titre, double prix, String format) {
        super(titre, prix);
        this.format = format;
    }

    LivreNumerique(String titre, double prix, String format, double prixAchat) {
        super(titre, prix);
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