import java.util.ArrayList;
import java.util.Scanner;

public class menu {
	static 	Scanner scan = new Scanner(System.in);
	
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
		scan.close();

	}
	
	//====================================================================================================================================================================================
	//=============================================================================AJOUT DONNEES==========================================================================================
	//====================================================================================================================================================================================
	// permet d'ajouter des élèves, enseignants, classes, matières et notes
	
	private static void ajout() {
		int j;
		j=10;
		while (j!=0){
		System.out.println("|-----Ajouter des données--------|");
		System.out.println("| 1 - Données élèves 			 |");
		System.out.println("| 2 - Données enseignants        |");
		System.out.println("| 3 - Données classes            |");
		System.out.println("| 4 - Données matières           |");
		System.out.println("| 5 - Données notes              |");
		System.out.println("| 0 - Quitter                    |");
		System.out.println("|--------------------------------|");
		System.out.println("Choix :");		
		j = scan.nextInt();
		scan.nextLine();
		scan.nextLine(); // à mettre après chqque nexInt à cause du buffer
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
		
	}
	
	// ajout note
	private static void ajoutNote() {
		
		System.out.println("Ajout d'une note");
		System.out.println("Saisir la note: ");
		int valeurNote = scan.nextInt();
		System.out.println("Saisir l'élève (INE): ");
		int ine = scan.nextInt();
		System.out.println("Saisir la matière: ");
		String nomMat = scan.nextLine();
	}
	
	// ajout matière
	private static void ajoutMatiere() {
		
		System.out.println("Ajout d'une matière");
		System.out.println("Saisir le nom de la matière: ");
		String nomMat = scan.nextLine();
		gestionnaireMatieres m = new gestionnaireMatieres();
		matiere mat = new matiere(nomMat);
		m.ajouteMatiere(mat);
		
	}
	// ajout enseignant
	private static void ajoutEnseignant() {
		
		System.out.println("Ajout d'un enseignant");
		System.out.println("Saisir les données suivantes: ");
		System.out.println("Nom: ");
		String nomP = scan.nextLine();
		System.out.println("Prenom: ");
		String prenomP = scan.nextLine();
		System.out.println("Date de naissance: ");
		String dateP = scan.nextLine();
		System.out.println("Adresse: ");
		String adresseP = scan.nextLine();
		System.out.println("NUMEN : ");
		int numen = scan.nextInt();
		System.out.println("Matière: ");
		String matiere = scan.nextLine();
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
		
		System.out.println("Ajout d'une classe");
		System.out.println("Saisir les données suivantes: ");
		System.out.println("Professeur principal de la classe: ");
		String profP = scan.nextLine();
		System.out.println("Niveau de la classe: ");
		int niv = scan.nextInt();
		System.out.println("Nom de la classe: ");
		String nomClasse = scan.nextLine();
		gestionnaireClasses college = new gestionnaireClasses();
		classe classe6A = new classe(profP, niv, nomClasse);
		college.ajouteClasse(classe6A);
		
	}

	// ajout élève
	private static void ajoutEleve() {
		
		System.out.println("Ajout d'un élève");
		System.out.println("Saisir les données suivantes: ");
		System.out.println("Nom: ");
		String nom = scan.nextLine();
		System.out.println("Prenom: ");
		String prenom = scan.nextLine();
		System.out.println("Date de naissance: ");
		String date = scan.nextLine();
		System.out.println("Adresse: ");
		String adresse = scan.nextLine();
		System.out.println("INE : ");
		int ine = scan.nextInt();
		System.out.println("Nombre de demie journées d'absence: ");
		Float abs = scan.nextFloat();
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
	// pour accéder rapidement à des fonctions : signaler une absence (voir si on en ajoute d'autres)
	
	private static void accesRapide() {
		int r;
		r=19;
		while (r!=0){
		System.out.println("|=====ACCES RAPIDE=================|");
		System.out.println("| 1 - Signaler une absence         |");
		System.out.println("| 2 - Ajouter une nouvelle élève   |");
		System.out.println("| 3 - Ajouter un nouveau enseignant|");
		System.out.println("| 0 - Quitter                      |");
		System.out.println("+----------------------------------+");
		System.out.println("Choix :");
		
		r = scan.nextInt();
		scan.nextLine();
		switch (r){
		case 1:
			break;
		case 2:
			break;
		case 3:ajoutEnseignant();
			break;
		case 0:AuRevoir();
			break;
		default: 
			erreur();
		}
		}
		
	}
	
	//====================================================================================================================================================================================
	//================================================================================MOYENNE=============================================================================================
	//====================================================================================================================================================================================
	// calculer la moyenne des élèves d'une classe, d'une classe d'un niveau, des élèves d'une classe dans une matière, d'une classe dans une matière dans un niveau
	private static void moyenne() {
		int m;
		m = 19;
		while (m!0){
		System.out.println("|-----------MOYENNE------------|");
		System.out.println("| 1 - Moyenne d'une classe     |");
		System.out.println("| 2 - Moyenne d'un niveau      |");
		System.out.println("| 3 - Moyenne dans une matière |");
		System.out.println("| 0 - Quitter                  |");
		System.out.println("|------------------------------|");
		System.out.println("Choix :");
		m = scan.nextInt();
		scan.nextLine();
		switch (m){
		case 1:
			moyClasse();
			break;
		case 2:
			moyNiv();
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
	}

	
	private static void moyNiv() {
			System.out.println("Moyenne d'un niveau");
			System.out.println("Niveau : ");
			int niveau = scan.nextInt();
			scan.nextLine();
			gestionnaireClasses c = new gestionnaireClasses();
			ArrayList <classe> cla = c.rechNiveau(niveau);
			if (cla.size()==0)
				System.out.println("Le niveau n'existe pas");
			else
				System.out.println(c.moyenneNiveau(niveau));
		}
	

	private static void moyClasse() {
		System.out.println("Moyenne d'une classe");
		System.out.println("Classe : ");
		String classe = scan.nextLine();
		gestionnaireClasses c = new gestionnaireClasses();
		classe cla = c.rechClasse(classe);
		if (cla==null)
			System.out.println("La classe n'existe pas");
		else
			System.out.println(cla.moyenneClasse());	
	}	

	private static void moyMat() {
		int n;
		n = 5783762;
		while (n!=0){
		System.out.println("|---------Moyenne dans une matière----------|");
		System.out.println("| 1 - Moyenne d'une classe dans une matière |");
		System.out.println("| 2 - Moyenne d'un niveau dans une matière  |");
		System.out.println("| 0 - Quitter                               |");
		System.out.println("|-------------------------------------------|");
		System.out.println("Choix :");
		n = scan.nextInt();
		scan.nextLine();
		switch (n){
		case 1:
			moyClasseMat();
			break;
		case 2:
			moyNivMat();
			break;
		case 0:
			AuRevoir();
			break;
		default: 
			erreur();
		}
		}
	}

	
private static void moyNivMat() {
		System.out.println("Moyenne d'une classe");
		System.out.println("Niveau : ");
		int niveau = scan.nextInt();
		scan.nextLine();
		System.out.println("Matière : ");
		String matiere = scan.nextLine();
		gestionnaireClasses c = new gestionnaireClasses();
		ArrayList <classe> cla = c.rechNiveau(niveau);
		gestionnaireMatieres m = new gestionnaireMatieres();
		matiere mat = m.rechMat(matiere);
		if (cla==null)
			System.out.println("Le niveau n'existe pas");
		else {
			if (cla.size()==0)
				System.out.println("La matière n'existe pas");
			else
				System.out.println(c.moyenneNiveauMat(niveau, mat));
		}
		
	}

	private static void moyClasseMat() {
		System.out.println("Moyenne d'une classe");
		System.out.println("Classe : ");
		String classe = scan.nextLine();
		System.out.println("Matière : ");
		String matiere = scan.nextLine();
		gestionnaireClasses c = new gestionnaireClasses();
		classe cla = c.rechClasse(classe);
		gestionnaireMatieres m = new gestionnaireMatieres();
		matiere mat = m.rechMat(matiere);
		if (cla==null)
			System.out.println("La classe n'existe pas");
		else {
			if (mat==null)
				System.out.println("La matière n'existe pas");
			else
				System.out.println(cla.moyenneClasseMat(mat));
		}
	}
		

	//====================================================================================================================================================================================
	//==============================================================================CLASSEMENT============================================================================================
	//====================================================================================================================================================================================
	// classement des élèves d'une classe, d'une classe dans un niveau, des élèves d'une classe dans une matière, d'une classe dans un niveau et dans une matière
	private static void classement() {
		int b;
		b=1728;
		while (b!=0){
		System.out.println("|---------------Afficher les classements-----------------|");
		System.out.println("| 1 - Afficher le classement dans une classe             |");
		System.out.println("| 2 - Afficher le classement d'une classe dans un niveau |");
		System.out.println("| 3 - Afficher le classement par matière                 |");
		System.out.println("| 0 - Quitter                        	                 |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println("Choix :");		
		b = scan.nextInt();
		scan.nextLine();
		switch (b){
		case 1:
			claClasse();
			break;
		case 2:
			claClasseNiv();
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
	}

private static void claClasseNiv() {
		System.out.println("Classement des classes dans un niveau" );
		System.out.println("Niveau : " );
		int niveau = scan.nextInt();
		scan.nextLine();
		gestionnaireClasses c = new gestionnaireClasses();
		ArrayList<classe> cla = c.rechNiveau(niveau);
		if (cla.size()==0)
			System.out.println("La matière n'existe pas");
		else
			System.out.println(c.classementNiveau(niveau));
	}

	private static void claClasse() {
		System.out.println("Classement des élèves dans une classe" );
		System.out.println("Classe : " );
		String classe = scan.nextLine();
		gestionnaireClasses c = new gestionnaireClasses();
		classe cla = c.rechClasse(classe);
		if (cla==null)
			System.out.println("La classe n'existe pas");
		else
			System.out.println(cla.classementClasse());
	}

	private static void claMatiere() {
		int c;
		c= 168902;
		while (c!=0){
		System.out.println("|--------------------Classement du matière--------------------------|");
		System.out.println("| 1 - Afficher le classement par matière dans une classe            |");
		System.out.println("| 2 - Afficher le classement par matière d'une classe dans un niveau|");
		System.out.println("| 0 - Quitter                        	                            |");
		System.out.println("|-------------------------------------------------------------------|");
		System.out.println("Choix :");
		c = scan.nextInt();
		scan.nextLine();
		switch (c){
		case 1:
			classementMatClasse();
			break;
		case 2:
			classementMatClasseNiv();
			break;
		case 0:
			AuRevoir();
			break;
		default: 
			erreur();
		}
		}
	}

	
	private static void classementMatClasseNiv() {
		System.out.println("Classement des classes par matière dans un niveau " );
		System.out.println("Niveau : " );
		int niv = scan.nextInt();
		scan.nextLine();
		System.out.println("Matière : " );
		String mat = scan.nextLine();
		gestionnaireClasses c = new gestionnaireClasses();
		ArrayList <classe> cla = c.rechNiveau(niv);
		gestionnaireMatieres m = new gestionnaireMatieres();
		matiere ma = m.rechMat(mat);
		if (cla.size()==0)
			System.out.println("Le niveau n'existe pas");
		else{
			if (mat==null)
				System.out.println("La matière n'existe pas");
			else
				System.out.println(c.classementNivMat(ma, niv));
		}
	}

	private static void classementMatClasse() {
		
		System.out.println("Classement des élèves d'une classe dans une matière " );
		System.out.println("Classe : " );
		String classe = scan.nextLine();
		System.out.println("Matière : " );
		String mat = scan.nextLine();
		gestionnaireClasses c = new gestionnaireClasses();
		classe cla = c.rechClasse(classe);
		gestionnaireMatieres m = new gestionnaireMatieres();
		matiere ma = m.rechMat(mat);
		if (cla==null)
			System.out.println("La classe n'existe pas");
		else{
			if (mat==null)
				System.out.println("La matière n'existe pas");
			else
				System.out.println(cla.classementClasseMat(ma));
		}

	//====================================================================================================================================================================================
	//==================================================================================BULLETIN==========================================================================================
	//====================================================================================================================================================================================
	// afficher le bulletin d'un élève
	private static void bulletin() {
		System.out.println("Saisir l'INE l'élève : " );
		int ine = scan.nextInt();
		scan.nextLine();
		gestionnaireEleves g = new gestionnaireEleves();
		eleve e = g.rechEleve(ine);
		gestionnaireClasses c = new gestionnaireClasses();
		classe cla = c.rechClasseEleve(ine);
		gestionnaireMatieres m = new gestionnaireMatieres();
		// comment récupérer les matières : passer par l'arraylist enseignant dans classe?
		if (e==null)
			System.out.println("L'élève n'existe pas");
		else
			System.out.println("Bulletin \n" );
			System.out.println(e.getNomEleve());
			System.out.println(e.getPrenomEleve());
			System.out.println(e.getDateNaissanceEleve());
			System.out.println(e.getAdEleve());
			if (cla==null)
				System.out.println("Pas de classe");
			else
			System.out.println("Classe : " +cla.getNomClasse() );
			System.out.println("Prof principal: " + cla.getProfPrincipal());
			System.out.println("Nombre d'absence: "+e.getAbs()+ "demie(s)journée(s)" );
			for (enseignant p : cla.getEns()){
				System.out.println( p.matiere+ " : " +e.moyenneMat(p.matiere));
			}
			System.out.println("Moyenne générale : " + e.moyenne() );
	}

	//====================================================================================================================================================================================
	//=================================================================================LISTER=============================================================================================
	//====================================================================================================================================================================================
	// pour afficher les listes d'élèves, d'enseignants, des matières, des classes pour éventuellement les modifier ou supprimer des éléments de la liste
	
	private static void lister() {
		int a;
		a = 890;
		while (a!=0){
		System.out.println("|-Affichage et gestion des données-|");
		System.out.println("|1 - Accès aux élèves              |");
		System.out.println("|2 - Accès aux enseignants         |");
		System.out.println("|3 - Accès aux matières            |");
		System.out.println("|4 - Accès aux classes             |");
		System.out.println("|0 - Quitter                       |");
		System.out.println("|----------------------------------|");
		System.out.println("Choix :");		
		a = scan.nextInt();
		scan.nextLine();
		switch (a){
		case 1:
			accesEleve();
			break;
		case 2:
			accesEnseignant();
			break;
		case 3:
			accesMat();
			break;
		case 4: 
			accesClasse();
			break;
		case 0:
			AuRevoir();
			break;
		default:
			erreur();
		}
		}
	}



private static void accesClasse() {
	int y;
	y =2783;
	while (y!=0){
	System.out.println("|---Accès aux classes----|");
	System.out.println("|1 - Afficher une classe |");
	System.out.println("|2 - Modifier une classe |");
	System.out.println("|0 - Quitter             |");
	System.out.println("|------------------------|");
	System.out.println("Choix :");
	
	y = scan.nextInt();
	switch (y){
	case 1:
		afficheClasse();
		break;
	case 2:
		modifClasse();
		break;
	case 0:
		AuRevoir();
		break;
	default:
		erreur();
	}	
	}
	}

private static void modifClasse() {
	// TODO Auto-generated method stub
	
}

private static void afficheClasse() {
	// TODO Auto-generated method stub
	
}

public static void accesMat() {
	System.out.println("Liste des matières :");
	System.out.println("Saisir une matière");
	String m = scan.nextLine();
	gestionnaireMatieres mat = new gestionnaireMatieres();
	matiere ma = mat.rechMat(m);
	if (m==null)
		System.out.println("La matière n'existe pas");
	else
		System.out.println(ma.toString());
	
	
	int k;
	k = 41191;
	while (k!=0){
	System.out.println("|----Liste des matières-----|");
	System.out.println("| 1 - Modifier              |");
	System.out.println("| 0 - Quitter               |");
	System.out.println("|---------------------------|");
	System.out.println("Choix :");
	Scanner scan1 = new Scanner(System.in);
	k = scan1.nextInt();
	scan.nextLine();
	switch (k){
	case 1:
		
		break;
	case 0:AuRevoir();
		break;
	default:
		erreur();
	}	
	scan1.close();
	}
}

	//====================================================================================================================================================================================
	//=====================================================================AFFICHAGE ET GESTION DES DONNÉES===============================================================================
	//====================================================================================================================================================================================
	//gestion des eleves

private static void accesEleve() {
	int m;
	m = 18;
	while (m!=0){
	System.out.println("|----------Accès aux élèves-----------|");
	System.out.println("|1 - Afficher un élève                |");
	System.out.println("|2 - Afficher les élèves d'une classe |");
	System.out.println("|3 - Afficher les élèves d'un niveau  |");
	System.out.println("|0 - Quitter                          |");
	System.out.println("|-------------------------------------|");
	System.out.println("Choix :");
	m = scan.nextInt();
	scan.nextLine();
	switch (m){
	case 1:
		affEleve();
		break;
	case 2:
		affElevesClasse();
		break;
	case 3:
		affElevesNiveau();
		break;
	case 0:
		AuRevoir();
		break;
	default:
		erreur();
	}	
	}
}

private static void affElevesNiveau() {
	
	System.out.println("Saisir le niveau");
	int niv = scan.nextInt();
	scan.nextLine();
	gestionnaireClasses college = new gestionnaireClasses();
	ArrayList<classe> n = college.rechNiveau(niv);
	if (n==null)
		System.out.println("Le niveau n'existe pas");
	else
		System.out.println(college.toString());
	
}

private static void affElevesClasse() {
	
	System.out.println("Saisir la classe");
	String nomClasse = scan.nextLine();
	gestionnaireClasses college = new gestionnaireClasses();
	classe c = college.rechClasse(nomClasse);
	if (c==null)
		System.out.println("La classe n'existe pas");
	else
		System.out.println(college.toString());
	
}

private static void affEleve() {
	
	System.out.println("Saisir l'INE d'un élève");
	int ine = scan.nextInt();
	scan.nextLine();
	gestionnaireEleves g = new gestionnaireEleves();
	eleve e = g.rechEleve(ine);
	if (e==null)
		System.out.println("L'élève n'existe pas");
	else
		System.out.println(g.toString());
	
}

//gestion des enseignants

private static void accesEnseignant() {
	int n;
	n = 819;
	while (n!=0){
	System.out.println("|-------Accès aux enseignants----------|");
	System.out.println("|1 - Afficher un enseignant            |");
	System.out.println("|2 - Afficher la liste des enseignants |");
	System.out.println("|0 - Quitter                           |");
	System.out.println("|--------------------------------------|");
	System.out.println("Choix :");
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
}

private static void afficherListeEns() {
	classe.AfficheEnseignant();
}

private static void recherEns() {
	System.out.println("Saisir le numéro d'un enseignant");
	int numen = scan.nextInt();
	scan.nextLine();
	gestionnaireEnseignants p = new gestionnaireEnseignants();
	enseignant ens = p.rechEnseignant(numen);
	if (ens==null)
		System.out.println("L'enseignant n'existe pas");
	else
		System.out.println(p.toString());
	
}
}
