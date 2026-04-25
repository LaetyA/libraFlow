package LibraFlow.src;

public class LivreNumerique extends Livre implements Achetable {
    String format;
    double prixAchat;

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
        return format;
    }

    @Override
    public double prixAchat() {
        return prixAchat;
    }
}