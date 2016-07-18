

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// recharger données de la BDD au début
		// faire autant d'ajouts qu'il y a de lignes dans bdd vers chaque gestionnaire : 5 boucles
		// pour la BDD on ne peut pas faire d'arraylist
		// ex : table élève, classe = clé étrangère
		int i;
		i =48;
		while (i!=0){
			System.out.println("+----------------MENU------------------+");
			System.out.println("| 1 - Affichage et gestion des données |");
			System.out.println("| 2 - Afficher le bulletin d'un élève  |");
			System.out.println("| 3 - Effectuer un classement          |");
			System.out.println("| 4 - Calculer une moyenne             |");
			System.out.println("| 5 - Acces rapide                     |");
			System.out.println("| 6 - Ajouter des données              |");
			System.out.println("| 0 - Quitter                          |");
			System.out.println("+--------------------------------------+");
			System.out.println("Choix :");
			Scanner scan = new Scanner(System.in);
			i = scan.nextInt();
			switch (i){
			case 1:
				lister();
				break;
			case 2:
				bulletin();
				break;
			case 3:
				classement();
				break;
			case 4:moyenne();
				break;
			case 5 : accesRapide();
				break;
			case 6 : ajout();
				break;
			case 0:
				AuRevoir();
				break;
			default:
				erreur();
				
			}
		
		}

	}
	
	//====================================================================================================================================================================================
	//=============================================================================AJOUT DONNEES==========================================================================================
	//====================================================================================================================================================================================
	private static void ajout() {
		int j;
		System.out.println("|-----Ajouter des données--------|");
		System.out.println("| 1 - Données élèves 			 |");
		System.out.println("| 2 - Données enseignants        |");
		System.out.println("| 3 - Données classes            |");
		System.out.println("| 4 - Données matières           |");
		System.out.println("| 5 - Données notes              |");
		System.out.println("| 0 - Quitter                    |");
		System.out.println("|--------------------------------|");
		System.out.println("Choix :");
		Scanner scan = new Scanner(System.in);
		j = scan.nextInt();
		switch (j){
		case 1:
			ajoutEleve();
			break;
		case 2:
			ajoutEnseignant();
			break;
		case 3:
			ajoutClasse();
			break;
		case 4:
			ajoutMatiere();
			break;
		case 5:
			ajoutNote();
			break;
		case 0:
			AuRevoir();
			break;
		default: 
			erreur();
		}
	}
	
	// ajout note
	private static void ajoutNote() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ajout d'une note");
		System.out.println("Saisir la note: ");
		int valeurNote = sc.nextInt();
		System.out.println("Saisir l'élève (INE): ");
		int ine = sc.nextInt();
		System.out.println("Saisir la matière: ");
		String nomMat = sc.nextLine();
	}
	
	// ajout matière
	private static void ajoutMatiere() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ajout d'une matière");
		System.out.println("Saisir le nom de la matière: ");
		String nomMat = sc.nextLine();
		gestionnaireMatieres m = new gestionnaireMatieres();
		matiere mat = new matiere(nomMat);
		m.ajouteMatiere(mat);
	}

	// ajout enseignant
	private static void ajoutEnseignant() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ajout d'un enseignant");
		System.out.println("Saisir les données suivantes: ");
		System.out.println("Nom: ");
		String nomP = sc.nextLine();
		System.out.println("Prenom: ");
		String prenomP = sc.nextLine();
		System.out.println("Date de naissance: ");
		String dateP = sc.nextLine();
		System.out.println("Adresse: ");
		String adresseP = sc.nextLine();
		System.out.println("NUMEN : ");
		int numen = sc.nextInt();
		System.out.println("Matière: ");
		String matiere = sc.nextLine();
		gestionnaireMatieres m = new gestionnaireMatieres();
		matiere mat = m.rechMat(matiere);
		if (mat == null){
			mat = new matiere(matiere);
			m.ajouteMatiere(mat);		
		}
		gestionnaireEnseignants p = new gestionnaireEnseignants();
		enseignant prof = new enseignant (nomP, prenomP, dateP, adresseP, numen, mat);
		p.ajouteEnseignant(prof);
	}
	
	// ajout classe
	private static void ajoutClasse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ajout d'une classe");
		System.out.println("Saisir les données suivantes: ");
		System.out.println("Professeur principal de la classe: ");
		String profP = sc.nextLine();
		System.out.println("Niveau de la classe: ");
		int niv = sc.nextInt();
		System.out.println("Nom de la classe: ");
		String nomClasse = sc.nextLine();
		gestionnaireClasses college = new gestionnaireClasses();
		classe classe6A = new classe(profP, niv, nomClasse);
		college.ajouteClasse(classe6A);
		
	}

	// ajout élève
	private static void ajoutEleve() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ajout d'un élève");
		System.out.println("Saisir les données suivantes: ");
		System.out.println("Nom: ");
		String nom = sc.nextLine();
		System.out.println("Prenom: ");
		String prenom = sc.nextLine();
		System.out.println("Date de naissance: ");
		String date = sc.nextLine();
		System.out.println("Adresse: ");
		String adresse = sc.nextLine();
		System.out.println("INE : ");
		int ine = sc.nextInt();
		System.out.println("Nombre de demie journées d'absence: ");
		Float abs = sc.nextFloat();
		gestionnaireEleves g = new gestionnaireEleves();
		eleve e6A1 = new eleve (nom, prenom, date, adresse, ine, abs);
		g.ajouteEleve(e6A1);
		
	}

	private static void erreur() {
		System.out.println("Erreur");
	}

	private static void AuRevoir() {
		System.out.println ("Au revoir");	
	}

	//====================================================================================================================================================================================
	//============================================================================ACCES RAPIDE============================================================================================
	//====================================================================================================================================================================================
	private static void accesRapide() {
		int r;
		System.out.println("|-----Acces Rapide--------|");
		System.out.println("| 1 - Signaler un absence |");
		System.out.println("| 0 - Quitter             |");
		System.out.println("|-------------------------|");
		System.out.println("Choix :");
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();
		switch (r){
		case 1:
			break;
		case 0:
			AuRevoir();
			break;
		default: 
			erreur();
		}
		
	}
	
	//====================================================================================================================================================================================
	//================================================================================MOYENNE=============================================================================================
	//====================================================================================================================================================================================
	private static void moyenne() {
		int m;
		System.out.println("|-----------MOYENNE------------|");
		System.out.println("| 1 - Moyenne d'une classe     |");
		System.out.println("| 2 - Moyenne d'un niveau      |");
		System.out.println("| 3 - Moyenne dans une matière |");
		System.out.println("| 0 - Quitter                  |");
		System.out.println("|------------------------------|");
		System.out.println("Choix :");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		switch (m){
		case 1:
			break;
		case 2:
			break;
		case 3:
			moyMat();
			break;
		case 0:
			AuRevoir();
			break;
		default: 
			erreur();
		}
		
	}

	

	private static void moyMat() {
		int n;
		System.out.println("|---------Moyenne dans une matière----------|");
		System.out.println("| 1 - Moyenne d'une classe dans une matière |");
		System.out.println("| 2 - Moyenne d'un niveau dans une matière  |");
		System.out.println("| 0 - Quitter                               |");
		System.out.println("|-------------------------------------------|");
		System.out.println("Choix :");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		switch (n){
		case 1:
			break;
		case 2:
			break;
		case 0:
			AuRevoir();
			break;
		default: 
			erreur();
		}
		
	}

	
	//====================================================================================================================================================================================
	//==============================================================================CLASSEMENT============================================================================================
	//====================================================================================================================================================================================
	private static void classement() {
		int b;
		System.out.println("|---------------Afficher les classements-----------------|");
		System.out.println("| 1 - Afficher le classement dans une classe             |");
		System.out.println("| 2 - Afficher le classement d'une classe dans un niveau |");
		System.out.println("| 3 - Afficher le classement par matière                 |");
		System.out.println("| 0 - Quitter                        	                 |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("Choix :");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		b = scan.nextInt();
		switch (b){
		case 1:
			break;
		case 2:
			break;
		case 3:
			claMatiere();
			break;
		case 0:
			AuRevoir();
			break;
		default: 
			erreur();
		}
		
	}

	private static void claMatiere() {
		int c;
		System.out.println("|--------------------Classement du matière--------------------------|");
		System.out.println("| 1 - Afficher le classement par matière dans une classe            |");
		System.out.println("| 2 - Afficher le classement par matière d'une classe dans un niveau|");
		System.out.println("| 0 - Quitter                        	                            |");
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("Choix :");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		c = scan.nextInt();
		switch (c){
		case 1:
			break;
		case 2:
			break;
		case 0:
			AuRevoir();
			break;
		default: 
			erreur();
		}
	}

	
	//====================================================================================================================================================================================
	//==================================================================================BULLETIN==========================================================================================
	//====================================================================================================================================================================================
	private static void bulletin() {
		
		
	}
// pour afficher les listes
	private static void lister() {
		int a;
		System.out.println("|-Affichage et gestion des données-|");
		System.out.println("|1 - Accès aux élèves              |");
		System.out.println("|2 - Accès aux enseignants         |");
		System.out.println("|3 - Accès aux matières            |");
		System.out.println("|4 - Accès aux classes             |");
		System.out.println("|0 - Quitter                       |");
		System.out.println("|----------------------------------|");
		System.out.println("Choix :");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		switch (a){
		case 1:
			accesEleve();
			break;
		case 2:accesEnseignant();
			break;
		case 3:
			accesMat();
			break;
		case 4: accesClasse();
			break;
		case 0:
			AuRevoir();
			break;
		default:
			erreur();
		}	
	}



private static void accesClasse() {
	int y;
	System.out.println("|---Accès aux classes----|");
	System.out.println("|1 - Afficher une classe |");
	System.out.println("|2 - Modifier une classe |");
	System.out.println("|0 - Quitter             |");
	System.out.println("|------------------------|");
	System.out.println("Choix :");
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	y = scan.nextInt();
	switch (y){
	case 1:
		break;
	case 2:
		break;
	case 0:
		AuRevoir();
		break;
	default:
		erreur();
	}	
		
	}

public static void accesMat() {
	System.out.println("Liste des matières :");
	matiere m = new matiere("maths");
	matiere m1 = new matiere("SVT");
	matiere m2 = new matiere("histoire");
	matiere m3 = new matiere("anglais");
	// création liste matière
	gestionnaireMatieres mat = new gestionnaireMatieres();
	mat.ajouteMatiere(m);
	mat.ajouteMatiere(m1);
	mat.ajouteMatiere(m2);
	mat.ajouteMatiere(m3);
	System.out.println(mat);

	System.out.println("Choisir une matière");
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	mat.rechMat(s);
	
	
	int k;
	System.out.println("|----Liste des matières-----|");
	System.out.println("| 1 - Modifier              |");
	System.out.println("| 0 - Quitter               |");
	System.out.println("|---------------------------|");
	System.out.println("Choix :");
	Scanner scan1 = new Scanner(System.in);
	k = scan1.nextInt();
	switch (k){
	case 1:
		
		break;
	case 0:AuRevoir();
		break;
	default:
		erreur();
	}	
		
	}

	//====================================================================================================================================================================================
	//=====================================================================AFFICHAGE ET GESTION DES DONNÉES===============================================================================
	//====================================================================================================================================================================================
//gestion des eleves

private static void accesEleve() {
	int m;
	System.out.println("|----------Accès aux élèves-----------|");
	System.out.println("|1 - Afficher un élève                |");
	System.out.println("|2 - Afficher les élèves d'une classe |");
	System.out.println("|3 - Afficher les élèves d'un niveau  |");
	System.out.println("|0 - Quitter                          |");
	System.out.println("|-------------------------------------|");
	System.out.println("Choix :");
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	m = scan.nextInt();
	switch (m){
	case 1:
		recherEleve();
		break;
	case 2:
		recherClasse();
		break;
	case 3:recherNiveau();
		break;
	case 0:
		AuRevoir();
		break;
	default:
		erreur();
	}	
	
}

private static void recherNiveau() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Saisir le niveau");
	
}

private static void recherClasse() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Saisir la classe");
	
}

private static void recherEleve() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Saisir l'INE d'un élève");
	int ine = sc.nextInt();
	gestionnaireEleves g = new gestionnaireEleves();
	g.rechEleve(ine);
}

//gestion des enseignants

private static void accesEnseignant() {
	int n;
	System.out.println("|-------Accès aux enseignants----------|");
	System.out.println("|1 - Afficher un enseignant            |");
	System.out.println("|2 - Afficher la liste des enseignants |");
	System.out.println("|0 - Quitter                           |");
	System.out.println("|--------------------------------------|");
	System.out.println("Choix :");
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();
	switch (n){
	case 1:
		recherEns();
		break;
	case 2:
		afficherListeEns();
		break;
	case 0:
		AuRevoir();
		break;
	default:
		erreur();
	}	
	
}


private static void afficherListeEns() {
	classe.AfficheEnseignant();
}

private static void recherEns() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Saisir le numéro d'un enseignant");
	int numen = sc.nextInt();
	gestionnaireEnseignants p = new gestionnaireEnseignants();
	p.rechEnseignant(numen);
	
}
}
