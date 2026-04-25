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
## Séance 11 — Abstract Class
- Fichiers modifiés : Livre.java, LivreAudio.java, LivreNumerique.java
- Notion apprise : Abstract Class
- Ce que ça fait dans LibraFlow : Livre ne peut plus être instanciée directement — chaque type de livre est forcé de définir son propre getDetail()
## Séance 12 — Interfaces vs Classes abstraites
- Fichiers créés : Empruntable.java, Achetable.java, LivrePhysique.java
- Fichiers modifiés : LivreAudio.java, LivreNumerique.java
- Notion apprise : Interfaces — contrats ciblés par classe
- Ce que ça fait dans LibraFlow : chaque type de livre signe uniquement le contrat qui le concerne
## Séance 13 — Annotations
- Fichiers créés : Auteur.java, NePasToucher.java
- Fichier modifié : Livre.java
- Notion apprise : Annotations (@interface, @Retention, méta-annotations)
- Ce que ça fait dans LibraFlow : traçabilité des auteurs de classes + marquage des méthodes sensibles