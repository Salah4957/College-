import java.util.Scanner;

public class Menu {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int i;
		i =48;
		while (i!=0){
			System.out.println("+----------------MENU------------------+");
			System.out.println("| 1 - Affichage et gestion des données |");
			System.out.println("| 2 - Afficher le bulletin d'un élève  |");
			System.out.println("| 3 - Effectuer un classement          |");
			System.out.println("| 4 - Calculer une moyenne             |");
			System.out.println("| 5 - Acces rapide                     |");
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
			case 0:
				System.out.println ("Au revoir");
				break;
			default: 
				System.out.println("Erreur");
			}
		
		}

	}

	private static void accesRapide() {
		int r;
		System.out.println("|-----Acces Rapide--------|");
		System.out.println("| 1 - Signaler un absence |");
		System.out.println("| 0 - Quitter             |");
		System.out.println("|-------------------------|");
		System.out.println("Choix :");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();
		switch (r){
		case 1:
			break;
		case 0:
			System.out.println ("Au revoir \n");
			break;
		default: 
			System.out.println("Erreur\n");
		}
		
	}

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
			System.out.println ("Au revoir \n");
			break;
		default: 
			System.out.println("Erreur\n");
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
			System.out.println ("Au revoir \n");
			break;
		default: 
			System.out.println("Erreur\n");
		}
		
	}

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
			System.out.println ("Aurevoir \n");
			break;
		default: 
			System.out.println("Erreur\n");
		}
		
	}

	private static void claMatiere() {
		int c;
		System.out.println("|--------------------Classement du matière---------------------------|");
		System.out.println("| 1 - Afficher le classement par matière dans une classe             |");
		System.out.println("| 2 - Afficher le classement par matière d'une classe dans un niveau |");
		System.out.println("| 0 - Quitter                        	                             |");
		System.out.println("|--------------------------------------------------------------------|");
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
			System.out.println ("Au revoir \n");
			break;
		default: 
			System.out.println("Choisi erreur\n");
		}
	}

	private static void bulletin() {
		
		
	}
// pour afficher les listes
	private static void lister() {
		int a;
		System.out.println("|----Affichage et gestion des données----|");
		System.out.println("|1 - Accès aux élèves                    |");
		System.out.println("|2 - Accès aux enseignants               |");
		System.out.println("|3 - Accès aux matières                  |");
		System.out.println("|0 - Quitter                             |");
		System.out.println("|----------------------------------------|");
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
		case 0:
			System.out.println ("Au revoir \n");
			break;
		default:
			System.out.println("Erreur");
		}	
	}



private static void accesMat() {
	gestionnaireMat();
	System.out.println("Choisir une matière");
	int k;
	System.out.println("|---------Liste des matières----------|");
	System.out.println("|1 - Modifier                         |");
	System.out.println("|2 - Afficher les élèves d'une classe |");
	System.out.println("|3 - Afficher les élèves d'un niveau  |");
	System.out.println("|0 - Quitter                          |");
	System.out.println("|-------------------------------------|");
	System.out.println("Choix :");
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	k = scan.nextInt();
	switch (k){
	case 1:
		recherEleve();
		break;
	case 2:
		recherClasse();
		break;
	case 3:recherNiveau();
		break;
	case 0:
		System.out.println ("Au revoir \n");
		break;
	default:
		System.out.println("Erreur choisi");
	}	
		
	}

private static void gestionnaireMat() {
	// TODO Auto-generated method stub
	
}

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
		System.out.println ("Au revoir \n");
		break;
	default:
		System.out.println("Erreur choisi");
	}	
	
}

private static void recherNiveau() {
	System.out.println("Saisir le niveau");
	
}

private static void recherClasse() {
	System.out.println("Saisir la classe");
	
}

private static void recherEleve() {
	System.out.println("Saisir l'INE d'un élève");
	
}

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
		System.out.println ("Au revoir \n");
		break;
	default:
		System.out.println("Erreur choisi");
	}	
	
}


private static void afficherListeEns() {
	
	
}

private static void recherEns() {
	System.out.println("Saisir le numéro d'un enseignant");
	
}
}
