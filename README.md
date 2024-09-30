# Projet de Gestion des Sites avec Java et MySQL

## Aperçu

le premier projet est une application simple de gestion de sites, développée en Java et connectée à une base de données MySQL. L'application permet d'ajouter des sites dans une base de données, de récupérer et d'afficher les sites enregistrés, tout en utilisant les concepts de JDBC pour gérer les connexions à la base de données.

## Technologies Utilisées

- *Java* : Langage de programmation principal pour l'application.
- *JDBC* : API utilisée pour la connexion et l'interaction avec la base de données MySQL.
- *MySQL* : Système de gestion de base de données relationnelle pour le stockage des données des sites.
- *IDE Java* : Outils comme IntelliJ IDEA ou Eclipse pour le développement du projet.

## Fonctionnalités Clés

1. *Ajout de Sites* : Insertion de nouveaux sites dans la base de données avec un nom unique pour chaque site.
2. *Affichage des Sites* : Récupération et affichage de tous les sites enregistrés dans la base de données avec leurs ID.
3. *Gestion des Connexions* : Utilisation de JDBC pour gérer les connexions, exécuter des requêtes SQL, et traiter les résultats.
4. *Gestion des Erreurs* : Gestion des exceptions et libération des ressources après les opérations sur la base de données pour assurer une bonne performance.

## Structure du Code

- *beans.Site* : Classe représentant un site avec un identifiant (ID) et un nom.
- *test.Test* : Classe responsable de la gestion des opérations de base de données, incluant l'insertion de nouveaux sites (save) et la récupération de tous les sites (load).
- *demo.Demo* : Classe contenant la méthode main qui teste les opérations en ajoutant des sites et en affichant la liste complète.
## Vidéo démonstration 
- *voiçi la vidéo démonstration du projet
  

https://github.com/user-attachments/assets/9ae2e5d5-65e3-495e-b226-a18737d9f2a6


# Projet de Gestion des Développeurs avec Java et MySQL

## Aperçu

Ce projet est une application de gestion des développeurs, développée en Java et connectée à une base de données MySQL. L'application permet d'ajouter des développeurs, d'enregistrer leurs activités de scripting et de récupérer les informations sur ces développeurs à partir de la base de données, tout en utilisant JDBC pour gérer les connexions à la base de données.

## Technologies Utilisées

- *Java* : Langage de programmation principal pour l'application.
- *JDBC* : API utilisée pour la connexion et l'interaction avec la base de données MySQL.
- *MySQL* : Système de gestion de base de données relationnelle pour le stockage des données des développeurs.
- *IDE Java* : Outils comme IntelliJ IDEA ou Eclipse pour le développement du projet.

## Fonctionnalités Clés  

1. *Ajout de Développeurs* : Insertion de nouveaux développeurs dans la base de données avec des détails tels que le nom, le jour et le nombre de scripts exécutés.
2. *Affichage des Développeurs* : Récupération et affichage de tous les développeurs enregistrés, avec les informations associées à leurs activités.
3. *Gestion des Scripts* : Suivi et gestion des scripts développés par chaque développeur, avec la possibilité de consulter le nombre de scripts réalisés par jour.
4. *Gestion des Connexions* : Utilisation de JDBC pour gérer les connexions, exécuter des requêtes SQL et traiter les résultats.
5. *Gestion des Erreurs* : Traitement des exceptions et libération des ressources après les opérations sur la base de données pour assurer la robustesse de l'application.

## Structure du Code  

- *developpeurs.DevData* : Classe représentant un développeur avec des attributs pour le nom, le jour et le nombre de scripts.
- *test.Test* : Classe responsable de la gestion des opérations de base de données, incluant la création de la table des développeurs et l'insertion de nouveaux enregistrements.
- *scriptsdev.ScriptsDev* : Classe contenant la méthode main qui teste les opérations en ajoutant des développeurs et en affichant la liste complète des développeurs et leurs activités.

## Instructions d'Utilisation

1. **Configuration de la Base de Données** : Assurez-vous d'avoir MySQL installé et créez une base de données nommée `scriptsdev`.
2. **Configuration du Projet** : Importez le projet dans un IDE Java comme IntelliJ IDEA ou Eclipse.
3. **Exécution de l'Application** : Lancez la méthode `main` dans la classe `scriptsdev.ScriptsDev` pour créer la table et ajouter des développeurs.
4. **Vérification des Données** : Consultez la base de données pour vérifier que les données ont été insérées correctement.

## Conclusion

Ce projet illustre les principes fondamentaux de la gestion des données à l'aide de Java et MySQL, tout en mettant l'accent sur la gestion des connexions et des exceptions. L'application peut être étendue pour inclure davantage de fonctionnalités selon les besoins futurs.

## Vidéo démonstration 

- *voiçi la  démonstration du projet:
https://github.com/user-attachments/assets/fb462aad-d1c0-4a43-b8bd-c84c7f569eb7





