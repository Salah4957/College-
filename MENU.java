import java.util.Scanner;

public class Menu {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int i;
		i =48;
		while (i!=0){
			System.out.println("|--------------MENU------------------|\n");
			System.out.println("| 1 - Afficher les listes pour gérer |\n");
			System.out.println("| 2 - Afficher le bulletin par élève |\n");
			System.out.println("| 3 - Afficher les classements       |\n");
			System.out.println("| 4 - Afficher les moyennes          |\n");
			System.out.println("| 5 - Acces rapide                   |\n");
			System.out.println("| 0 - Quitter                        |\n");
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
				System.out.println ("Aurevoir \n");
				break;
			default: 
				System.out.println("Choisi erreur\n");
			}
		
		}

	}

	private static void accesRapide() {
		int r;
		System.out.println("|-----Acces Rapide-------|\n");
		System.out.println("| 1 - Signaler un absence|\n");
		System.out.println("| 0 - Quitter            |\n");
		System.out.println("Choix :");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		r = scan.nextInt();
		switch (r){
		case 1:
			break;
		case 0:
			System.out.println ("Aurevoir \n");
			break;
		default: 
			System.out.println("Choisi erreur\n");
		}
		
	}

	private static void moyenne() {
		int m;
		System.out.println("|-----Moyenne----------------------|\n");
		System.out.println("| 1 - Moyenne generale d'une classe|\n");
		System.out.println("| 2 - Moyenne generale d'un niveau |\n");
		System.out.println("| 3 - Moyenne generale d'un matière|\n");
		System.out.println("| 0 - Quitter                      |\n");
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
			System.out.println ("Aurevoir \n");
			break;
		default: 
			System.out.println("Choisi erreur\n");
		}
		
	}

	

	private static void moyMat() {
		int n;
		System.out.println("|-----Moyenne d'une matiere------------|\n");
		System.out.println("| 1 - Moyenne d'une matiere par classe |\n");
		System.out.println("| 2 - Moyenne d'une matiere par niveau |\n");
		System.out.println("| 0 - Quitter                          |\n");
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
			System.out.println ("Aurevoir \n");
			break;
		default: 
			System.out.println("Choisi erreur\n");
		}
		
	}

	private static void classement() {
		int b;
		System.out.println("|-----Afficher les classements-----------|\n");
		System.out.println("| 1 - Afficher le classement d'une classe|\n");
		System.out.println("| 2 - Afficher le classement d'un niveau |\n");
		System.out.println("| 3 - Afficher le classement par matière |\n");
		System.out.println("| 0 - Quitter                        	 |\n");
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
			System.out.println("Choisi erreur\n");
		}
		
	}

	private static void claMatiere() {
		int c;
		System.out.println("|-----Classement du matière--------------------------|\n");
		System.out.println("| 1 - Afficher le classement par matière d'une classe|\n");
		System.out.println("| 2 - Afficher le classement par matière d'un niveau |\n");
		System.out.println("| 0 - Quitter                        	             |\n");
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
			System.out.println ("Aurevoir \n");
			break;
		default: 
			System.out.println("Choisi erreur\n");
		}
	}

	private static void bulletin() {
		
		
	}

	private static void lister() {
		int a;
		System.out.println("|--- Afficher les listes------|\n");
		System.out.println("|1 - Afficher les élèves      |\n");
		System.out.println("|2 - Afficher les enseignants |\n");
		System.out.println("|3 - Afficher les matières    |\n");
		System.out.println("|0 - Quitter                  |\n");
		System.out.println("Choix :");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		switch (a){
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 0:
			System.out.println ("Aurevoir \n");
			break;
		default:
			System.out.println("Erreur choisi");
		}	
	}
}
