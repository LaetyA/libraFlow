## Séance 7 — Wrapper Class
- Fichier : Livre.java
- Appris : Integer vs int, null safety, autoboxing
- Ajouté : champ stock en Integer
## Séance 8 — Héritage
- Fichiers créés : Livre.java, LivreNumerique.java, LivreAudio.java
- Notion apprise : Héritage (extends, super, @Override)
- Ce que ça fait dans LibraFlow : catalogue unifié de tous les types de livres
- Package actuel : com.libraflow.catalogue
## Séance 9 — This & Super
- Fichier modifié : LivreAudio.java
- Notion apprise : this (objet courant) / super (partie parente)
- Ce que ça fait dans LibraFlow : getInfo() délègue à Livre via super.getInfo()
  au lieu de réécrire titre et prix
- Dette technique : aucune
## Séance 10 — Polymorphisme
- Fichier créé : Main.java
- Notion apprise : Polymorphisme
- Ce que ça fait dans LibraFlow : affichage unifié de tous les types de livres via Livre[]