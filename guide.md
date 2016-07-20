Avant de pouvoir faire appel aux fonctionnalités de l’application, l’utilisateur doit absolument saisir des données (choix 6). Ces données sont ensuite enregistrées en base de données dans les tables : 
* eleve
* enseignant
* classe
* note 

A chaque ouverture du programme (menu.java), les données sont chargées en base de données vers les différents gestionnaires : 
* gestionnaireEleves
*	gestionnaireEnseignants
*	gestionnaireNotes
*	gestionnaireClasses
*	gestionnaireMatieres

#Lancement du programme
1.	Les données de la base de données sont chargées dans les différents gestionnaires.
2.	Le système demande à l’utilisateur d’effectuer un choix dans le menu.
3.	L’utilisateur effectue un choix.
*	Choix 1 : Afficher des données (puis modifier et supprimer)
*	Choix 2 : Afficher le bulletin d’un élève
*	Choix 3 : Calculer des moyennes
* Choix 4 : Effectuer des classements
*	Choix 5 : Signaler des absences
*	Choix 6 : Saisir des données
*	Choix 0 : Quitter

# Affichage de données (choix 1)

# Bulletin (choix 2)
1.	Le système demande à l’utilisateur de saisir le nom de l’élève pour lequel il faut afficher le bulletin.
2.	L’utilisateur saisit l’INE d’un élève.
3.	Le système affiche le bulletin de l’élève.

# Moyenne (choix 3)
1.	Le système demande quelle moyenne l’utilisateur souhaite calculer.
2.	L’utilisateur effectue son choix.
*	Choix 1 : Moyenne d’une classe
*	Choix 2 Moyenne d’une classe dans un niveau
*	Choix 3 Moyenne dans une matière

## Moyenne d’une classe
1.	Le système demande de saisir le nom de la classe dont la moyenne doit être calculée.
2.	L’utilisateur saisit le nom de la classe.
3.	Le système affiche la moyenne de la classe saisie.

## Moyenne d’une classe dans un niveau
1.	Le système demande de saisir le niveau dont la moyenne doit être calculée.
2.	L’utilisateur saisit le niveau.
3.	Le système affiche la moyenne du niveau saisi.

##Moyenne dans une matière
1.	Le système demande quelle moyenne l’utilisateur souhaite calculer.
2.	L’utilisateur effectue son choix.
*Choix 1 : Moyenne d’une classe dans une matière
*Choix 2 : Moyenne d’une classe dans un niveau et dans une matière

###Moyenne d’une classe dans une matière
1.	Le système demande de saisir le nom de la classe dont la moyenne doit être calculée.
2.	L’utilisateur saisit le nom de la classe.
3.	Le système demande de saisir la matière.
4.	L’utilisateur saisit la matière.
5.	Le système affiche la moyenne de la classe dans la matière saisie.

###Moyenne d’une classe dans un niveau et dans une matière
1.	Le système demande de saisir le niveau dont la moyenne doit être calculée.
2.	L’utilisateur saisit le niveau.
3.	Le système demande de saisir la matière.
4.	L’utilisateur saisit la matière.
5.	Le système affiche la moyenne du niveau dans la matière saisie.

#Classement (choix 4)
1.	Le système demande quel classement l’utilisateur souhaite effectuer.
2.	L’utilisateur effectue son choix.
*Choix 1 : Classement d’une classe
*Choix 2 : Classement d’une classe dans un niveau
*Choix 3 : Classement dans une matière

##Classement des élèves dans une classe
1.	Le système demande de saisir le nom de la classe dont le classement doit être effectué.
2.	L’utilisateur saisit le nom de la classe.
3.	Le système affiche le classement des élèves de la classe saisie.

##Classement des classes dans un niveau
1.	Le système demande de saisir le niveau dont le classement doit être effectué.
2.	L’utilisateur saisit le niveau.
3.	Le système affiche le classement des classes dans le niveau saisi.

##Classement dans une matière
1.	Le système demande quel classement l’utilisateur souhaite effectuer.
2.	L’utilisateur effectue son choix.
*Choix 1 : Classement d’une classe dans une matière
*Choix 2 : Classement d’une classe dans un niveau et dans une matière

###Classement des élèves d’une classe dans une matière
1.	Le système demande de saisir le nom de la classe dont le classement doit être effectué.
2.	L’utilisateur saisit le nom de la classe.
3.	Le système demande de saisir la matière.
4.	L’utilisateur saisit la matière.
5.	Le système affiche le classement des élèves de la classe dans la matière saisie.

###Classement des classes dans un niveau et dans une matière
1.	Le système demande de saisir le niveau des classes dont le classement doit être effectué.
2.	L’utilisateur saisit le niveau.
3.	Le système demande de saisir la matière.
4.	L’utilisateur saisit la matière.
5.	Le système affiche le classement des classes dans le niveau et dans la matière saisis.

#Signalement d’absence (choix 5)

#Saisie de données (choix 6)

#Quitter le programme 
1.	Choix 0 dans le menu principal

Note : il faudrait pouvoir revenir au menu précédent (pas au menu principal)
nts here
