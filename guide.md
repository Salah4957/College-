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
*	Choix 5 : Saisir des données
*	Choix 0 : Quitter

# Affichage de données (choix 1)
1. Le système demande à l'utilisateur quel type de données il souhaite voir afficher.
2. L’utilisateur effectue son choix.

* Choix 1 : Afficher les élèves
* Choix 2 : Afficher les enseignants
* Choix 3 : Afficher les matières
* Choix 4 : Afficher les classe

## Afficher les élèves
1. Le système demande à l'utilisateur ce qu'il souhaite faire concernant les élèves.
2. L'utilisateur saisit son choix.

* Choix 1 : Afficher un élève
* Choix 2 : Afficher les élèves d'une classe
* Choix 3 : Afficher les élèves d'un niveau
* Choix 4 : Modifier les données d'un élève

### Afficher un élève
1. Le système demande de saisir l'élève à afficher.
2. L’utilisateur saisit l'ine.
3. Le système affiche les données de l'élève.

### Afficher les élèves d'une classe
1. Le système demande de saisir la classe dont les élèves sont à afficher.
2. L’utilisateur saisit le nom de la classe.
3. Le système affiche la liste des élèves de la classe.

### Afficher les élèves d'un niveau
1. Le système demande de saisir le niveau dont les élèves sont à afficher.
2. L’utilisateur saisit le niveau.
3. Le système affiche la liste des élèves du niveau.

### Modifier les données d'un élève
1. Le système demande de saisir l'ine de l'élève dont les données sont à modifier.
2. L’utilisateur saisit l'ine.
3. Le système demande de saisir la nouvelle adresse.
4. L’utilisateur saisit la nouvelle adresse.
5. 3. Le système demande de saisir le nombre d'absences.
6. L’utilisateur saisit le nombre d'absences
7. Les modifications sont enregistrées.

## Afficher les enseignants
1. Le système demande à l'utilisateur  ce qu'il souhaite faire concernant les enseignants.
2. L'utilisateur saisit son choix.

* Choix 1 : Afficher un enseignant
* Choix 2 : Afficher la liste des enseignants
* Choix 3 : Modifier les données d'un enseignant
 
### Afficher un enseignant
1. Le système demande de saisir l'enseignant à afficher.
2. L’utilisateur saisit le numen.
3. Le système affiche les données de l'enseignant.

### Afficher la liste des enseignants
1. Le système affiche la liste des enseignants.

### Modifier les données d'un enseignant
1. Le système demande de saisir le numen de l'enseignant dont les données sont à modifier.
2. L’utilisateur saisit le numen.
3. Le système demande de saisir la nouvelle adresse.
4. L’utilisateur saisit la nouvelle adresse.
5. 3. Le système demande de saisir la nouvelle matière.
6. L’utilisateur saisit la nouvelle matière.
7. Les modifications sont enregistrées.

## Afficher les matières
1. Le système demande à l'utilisateur  ce qu'il souhaite faire concernant les matières.
2. L'utilisateur saisit son choix.

* Choix 1 : Afficher les matières.
* Choix 2 : Modifier une matière.

### Afficher les matières
1. Le système affiche la classe.

### Modifier une matière
1. Le système demande de saisir la matière à modifier.
2. L’utilisateur saisit la matière.
3. Le système demande de saisir le nouveau nom de la matière.
4. L’utilisateur saisit le nouveau nom de la matière.
5. Les données sont enregistrées.

## Afficher les classes
1. Le système demande à l'utilisateur  ce qu'il souhaite faire concernant les classes.
2. L'utilisateur saisit son choix.

* Choix 1 : Afficher une classe.
* Choix 2 : Modifier une classe.

### Afficher une classe
1. Le système demande de saisir la classe à afficher.
2. L’utilisateur saisit la classe.
3. Le système affiche la classe.

### Modifier une classe
1. Le système demande de saisir la classe à modifier.
2. L’utilisateur saisit la classe.
3. Le système demande de saisir le nouveau nom de la classe.
4. L’utilisateur saisit le nouveau nom de la classe.
5. Le système demande de saisir le nouveau niveau de la classe.
6. L’utilisateur saisit le nouveau niveau de la classe.
7. Le système demande de saisir le nouveau professeur principal de la classe.
8. L’utilisateur saisit le nouveau professeur principal de la classe.
9. Les données sont enregistrées.

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

* Choix 1 : Moyenne d’une classe dans une matière
* Choix 2 : Moyenne d’une classe dans un niveau et dans une matière

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

* Choix 1 : Classement d’une classe
* Choix 2 : Classement d’une classe dans un niveau
* Choix 3 : Classement dans une matière

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

* Choix 1 : Classement d’une classe dans une matière
* Choix 2 : Classement d’une classe dans un niveau et dans une matière

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

#Saisie de données (choix 5)
1. Le système demande quelles données l'utilisateur souhaite ajouter.
2. L'utilisateur saisit son choix.

* Choix 1 : Ajout élève
* Choix 2 : Ajout enseignant
* Choix 3 : Ajout classe
* Choix 4 : Ajout matière
* Choix 5 : Ajout note

##Ajout élève
1. Le système demande de saisir le nom de l'élève
2. L'utilsiateur saisit le nom de l'élève
3. Le système demande de saisir le prénom de l'élève
4. L'utilisateur saisit le prénom de l'élève
5. Le système demande de saisir la date de naissance de l'élève
6. L'utilisateur saisit la date de naissance de l'élève
7. 3. Le système demande de saisir l'adresse de l'élève
8. L'utilisateur saisit l'adresse de l'élève
9. Le système demande de saisir le numen de l'élève
10. L'utilisateur saisit le numen de l'élève
11. 5. Le système demande de saisir la matière de l'élève
12. L'utilisateur saisit la matière de l'élève
13. L'élève est ajouté.

##Ajout enseignant
1. Le système demande de saisir le nom de l'enseignant.
2. L'utilisateur saisit le nom de l'enseignant.
3. Le système demande de saisir le prénom de l'enseignant.
4. L'utilisateur saisit le prénom de l'enseignant.
5. Le système demande de saisir la date de naissance de l'enseignant.
6. L'utilisateur saisit la date de naissance de l'enseignant.
7. 3. Le système demande de saisir l'adresse de l'enseignant.
8. L'utilisateur saisit l'adresse de l'enseignant.
9. Le système demande de saisir le numen de l'enseignant.
10. L'utilisateur saisit le numen de l'enseignant.
11. 5. Le système demande de saisir la matière de l'enseignant.
12. L'utilisateur saisit la matière de l'enseignant.
13. L'enseignant est ajouté.

##Ajout classe
1. Le système demande de saisir le prof principal.
2. L'utilsiateur saisit le prof principal.
3. Le système demande de saisir le niveau de la classe.
4. L'utilisateur saisit le niveau de la classe. 
5. Le système demande de saisir le nom de la classe.
6. L'utilisateur saisit le nom de la classe. 
7. La classe est ajoutée.

##Ajout matière
1. Le système demande de saisir le nom de la matière.
2. L'utilisateur saisit le nom de la matière.
3. La matière est ajoutée.

##Ajout note
1. Le système demande de saisir la note.
2. L'utilisateur saisit la valeur de la note.
3. Le système demande de saisir l'élève.
4. L'utilisateur saisit l'ine.
5. Le système demande de saisir la matière.
6. L'utilisateur saisit la matière.
7. La note est ajoutée. 

#Quitter le programme 
1.	Choix 0 dans le menu principal
