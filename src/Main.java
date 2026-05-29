package LibraFlow.src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
  public static void main(String args[]) {
    // Livre l1 = new LivreAudio("Dune", 12.0, 40);
    // LivreNumerique l2 = new LivreNumerique("Dune", 8.0, "PDF");
    // LivreAudio l3 = new LivreAudio("Dune", 10.0, 480);

    // afficher(l1);
    // afficher(l2);
    // afficher(l3);
    // Livre[] tableau = new Livre[3];
    // tableau[0] = l1;
    // tableau[1] = l2;
    // tableau[2] = l3;
    // LivreAudio[] catalogue = {
    // new LivreAudio("Dune", 15.0, 300, 14),
    // new LivreAudio("1984", 12.0, 240, 7)
    // };

    // for (LivreAudio e : catalogue) {
    // System.out.println(e.dureeEmprunt());
    // System.out.println(e.titre);
    // }
    // Livre l = new LivreNumerique("Dune", 12.0, "PDF");
    // System.out.println(Livre.class.getAnnotation(Auteur.class));
    // for (Livre livre : tableau) {

    // System.out.println(livre.getInfo());
    // }

    // Crée un Catalogue<Livre> dans un main, ajoute un Livre, un LivreNumerique, un
    // LivreAudio, puis affiche-les tous avec getAll() et une boucle.
    Catalogue<Livre> catalogue = new Catalogue<>();
    catalogue.ajouter(new LivreAudio("Dune", 15.0, 300, 14, TypeLivre.ROMAN));
    catalogue.ajouter(new LivreNumerique("1984", 8.0, "PDF", TypeLivre.HISTOIRE));
    Livre premier = catalogue.get(0);
    System.out.println(premier.getInfo());
    catalogue.afficherTout();
    LivreNumerique l = new LivreNumerique("Dune", 12.99, "PDF", TypeLivre.JEUNESSE);
    LivreAudio l1 = new LivreAudio("Casa", 20000, 300, 120, TypeLivre.JEUNESSE);
    System.out.println(l.getInfo());
    System.out.println(l1.getInfo());
    System.out.println(l1.type);
    LivreAudio[] tabLivreAudios = new LivreAudio[4];
    tabLivreAudios[0] = new LivreAudio("aud0", 0, 0, 0, TypeLivre.HISTOIRE);
    tabLivreAudios[1] = new LivreAudio("aud1", 0, 0, 0, TypeLivre.JEUNESSE);
    tabLivreAudios[2] = new LivreAudio("aud2", 0, 0, 0, TypeLivre.JEUNESSE);
    tabLivreAudios[3] = new LivreAudio("aud3", 0, 0, 0, TypeLivre.ROMAN);
    List<LivreAudio> tabLivreAudioJeunesse = new ArrayList<>();
    for (LivreAudio livreAudio : tabLivreAudios) {

      if (livreAudio.type == TypeLivre.JEUNESSE) {
        tabLivreAudioJeunesse.add(livreAudio);
      }

    }
    for (LivreAudio livreAudio : tabLivreAudioJeunesse) {
      System.out.println(livreAudio.getInfo());
    }
    System.out.println(TypeLivre.JEUNESSE.getLabel());

    Catalogue<Livre> catalogueLivre = new Catalogue<>();
    catalogueLivre.ajouter(new LivreAudio("Dune", 15.0, 300, 14, TypeLivre.ROMAN));
    catalogueLivre.ajouter(new LivreNumerique("1984", 8.0, "PDF", TypeLivre.JEUNESSE));

    List<Livre> catalogueLivres = new ArrayList<>();
    catalogueLivres.add(new LivreAudio("Casa", 20000, 0, 0, TypeLivre.JEUNESSE));
    catalogueLivres.add(new LivreNumerique("Dune", 10000, null, TypeLivre.ROMAN));
    catalogueLivres.add(new LivrePhysique("Dasa", 3000, 0, 0, TypeLivre.SCIENCE));
    System.out.println("=== CATALOGUE LIBRAFLOW ===");
    for (Livre livre : catalogueLivres) {
      System.out.println(livre.getInfo() + "->" + livre.type.getLabel());

    }
    LivreNumerique livreA = new LivreNumerique("Dune", 10000, "PDF", TypeLivre.ROMAN);
    LivreNumerique livreB = new LivreNumerique("Dune", 10000, "PDF", TypeLivre.ROMAN);
    LivreNumerique livreC = new LivreNumerique("Dune3", 10000, "PDF", TypeLivre.ROMAN);
    // System.out.println(livreA.equals(livreB));
    // System.out.println(livreA.equals(livreC));
    // System.out.println(livreA);
    LivreAudio lA1 = new LivreAudio("test", 200, 30, 0, TypeLivre.JEUNESSE);
    LivreAudio lA2 = new LivreAudio("test", 200, 30, 0, TypeLivre.JEUNESSE);
    System.out.println(lA1.equals(lA2));
    System.out.println(lA1);

    // HashSet<LivreNumerique> set = new HashSet<>();
    // set.add(new LivreNumerique("Dune", 12.0, "PDF", TypeLivre.ROMAN));
    // set.add(new LivreNumerique("Dune", 12.0, "PDF", TypeLivre.ROMAN));
    // System.out.println(set.size());

 
filtre(catalogueLivres,new Filtre() {
    public boolean filtre(Livre livre) {
        return livre.prix < 20;
    }
});
  }

  public String rapport(Livre l) {
    if (l instanceof LivrePhysique) {
      LivrePhysique livre = (LivrePhysique) l;
      return "livre:" + livre.titre + "prix :" + livre.prixAchat + "durée d'emprunt :" + livre.dureeEmprunt;
    } else if (l instanceof LivreAudio) {
      LivreAudio livre = (LivreAudio) l;
      return "livre:" + livre.titre + "durée minute :" + livre.dureeMinutes;

    } else {
      return l.getInfo();
    }

  }
public List<Livre> filtre(List<Livre> catalogue, Filtre critere){
  List<Livre>livreFilter = new ArrayList<>();
  for (Livre livre : catalogue) {
    if(critere.filtre(livre)){
     livreFilter.add(livre);
    }

  }
  return livreFilter;

 }

  static void afficher(Livre l) {
    System.out.println(l.getInfo());
  }

}