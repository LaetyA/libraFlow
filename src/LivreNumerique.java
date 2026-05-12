package LibraFlow.src;

final public class LivreNumerique extends Livre implements Achetable {
   final String format;
    double prixAchat;
    static final double tva = 5.5; 

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
        double ttc = prix*(1+tva/100);

        return "format: "+format+ " ttc = "+ttc;
    }

    @Override
    public double prixAchat() {
        return prixAchat;
    }
}