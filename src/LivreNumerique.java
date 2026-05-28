package LibraFlow.src;

import java.util.Objects;

public final class LivreNumerique extends Livre implements Achetable {
    final String format;
    double prixAchat;
    static final double TVA = 5.5;

    LivreNumerique(String titre, double prix, String format, TypeLivre type) {
        super(titre, prix, type);
        this.format = format;
    }

    LivreNumerique(String titre, double prix, String format, double prixAchat, TypeLivre type) {
        super(titre, prix, type);
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;


        LivreNumerique object = (LivreNumerique) obj;
        if (object.titre.equals(this.titre) && (object.prix == this.prix) && (object.format.equals(this.format))) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString(){
    

        return this.titre+" en format "+this.format+" à :"+this.prix;
    }
    @Override
    public int hashCode(){
        return Objects.hash(titre, prix, format);
    }
}