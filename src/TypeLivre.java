package LibraFlow.src;
public enum TypeLivre {
    ROMAN("Littérature Roman"),
    SCIENCE("Littérature Science"),
    HISTOIRE("Littérature Histoire"),
    JEUNESSE("Littérature Jeunesse");

    private final String label;

    TypeLivre(String label) {
        this.label = label;
    }

    String getLabel() {
        return this.label;
    }
}