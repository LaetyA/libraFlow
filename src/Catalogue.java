package LibraFlow.src;

import java.util.ArrayList;
import java.util.List;

public class Catalogue<T extends Livre> {
    List<T> items = new ArrayList<>();

    void ajouter(T item) {
        items.add(item);
    }

    T get(int index) {
        return items.get(index);
    }

    void afficherTout() {
        for (T item : items) {
            System.out.println(item.getInfo());
        }
    }
}