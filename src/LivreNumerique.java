package LibraFlow.src;

public class LivreNumerique extends Livre {
    String format;

    LivreNumerique(String titre, double prix, String format) {
        super(titre, prix);
        this.format = format;
    }

    @Override
    String getDetail() {
        return format;
    }
}