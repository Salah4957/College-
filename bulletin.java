import java.util.ArrayList;
import java.util.Arrays;

public class bulletin {
	
	public static void main(String[] args) {
	// création eleve
	gestionnaireEleves g = new gestionnaireEleves();
	eleve e0 = new eleve ("Baba","auRhum",5564658);
	eleve e1 = new eleve ("Ali","Baba",5564659);
	eleve e2 = new eleve ("Jon","Snow","17 rue des acacias 75017 Paris", "17/02/2000", 5564657, 2);
	eleve e3 = new eleve ("A","Baba",5564678);
	eleve e4 = new eleve ("Al","Baba",556890);
	eleve e5 = new eleve ("V","Baba",5564659);
	eleve e6 = new eleve ("M","Baba",5564659);
	eleve e7 = new eleve ("ZZ","Baba",5564659);
	eleve e8 = new eleve ("B","Baba",5564689);
	eleve e9 = new eleve ("L","Baba",5564650);
	eleve e10 = new eleve ("SS","Baba",5564645);
	eleve e11 = new eleve ("S","Baba",5564678);
	eleve e12 = new eleve ("Z","Baba",5564699);
	g.ajouteEleve(e0);
	g.ajouteEleve(e1);
	g.ajouteEleve(e2);
	g.ajouteEleve(e3);
	g.ajouteEleve(e4);
	g.ajouteEleve(e5);
	g.ajouteEleve(e6);
	g.ajouteEleve(e7);
	g.ajouteEleve(e8);
	g.ajouteEleve(e9);
	g.ajouteEleve(e10);
	g.ajouteEleve(e11);
	g.ajouteEleve(e12);
	// création matière
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
	
	// création note
	note n0 = new note(12, e0, m);
	note n20 = new note(8, e6, m3);
	note n1 = new note(14, e0, m1);
	note n2 = new note(16, e1, m);
	note n3 = new note(18, e1, m1);
	note n4 = new note(8, e2, m);
	note n5 = new note(11, e2, m1);
	note n6 = new note(18, e3, m);
	note n7 = new note(14, e3, m);
	note n8 = new note(11, e3, m1);
	note n9 = new note(12, e0, m1);
	note n10 = new note(14, e0, m1);
	note n11 = new note(16, e1, m);
	note n12 = new note(18, e1, m3);
	note n13 = new note(9, e2, m);
	note n14 = new note(11, e2, m1);
	note n15 = new note(18, e3, m);
	note n16 = new note(3, e3, m);
	note n17 = new note(16, e3, m1);
	note n18 = new note(11, e4, m2);
	note n19 = new note(15, e5, m);
	
	note n21 = new note(18, e7, m); 
	note n22 = new note(8, e8, m);
	note n23 = new note(12, e9, m2);
	note n24 = new note(11, e10, m1);
	note n25 = new note(18, e11, m);
	note n26 = new note(12, e12, m3);
	// ajout note
	gestionnaireNotes releve = new gestionnaireNotes();
	releve.ajouter(n0);
	releve.ajouter(n20);
	releve.ajouter(n2);
	releve.ajouter(n3);
	releve.ajouter(n4);
	releve.ajouter(n5);
	releve.ajouter(n6);
	releve.ajouter(n7);
	releve.ajouter(n8);
	releve.ajouter(n9);
	releve.ajouter(n10);
	releve.ajouter(n11);
	releve.ajouter(n12);
	releve.ajouter(n13);
	releve.ajouter(n14);
	releve.ajouter(n15);
	releve.ajouter(n16);
	releve.ajouter(n17);
	releve.ajouter(n18);
	releve.ajouter(n19);
	releve.ajouter(n1);
	releve.ajouter(n21);
	releve.ajouter(n22);
	releve.ajouter(n23);
	releve.ajouter(n24);
	releve.ajouter(n25);
	releve.ajouter(n26);
	// création prof
	enseignant p = new enseignant("François", "Lembrouille", 123, m);
	enseignant p1 = new enseignant("Homer", "Simpson", 124, m1);
	gestionnaireEnseignants profs = new gestionnaireEnseignants();
	profs.ajouteEnseignant(p);
	profs.ajouteEnseignant(p1);

	// création classe
	classe classe6A = new classe(null, null, "Blala", 6, "6A");
	classe classe6B = new classe(null, null, "Martin", 6, "6B");
	classe classe6C = new classe(null, null, "Durand", 6, "6C");
	classe classe5A = new classe(null, null, "Dupont", 5, "5A");
	classe classe5B = new classe(null, null, "Roca", 5, "5B");
	gestionnaireClasses college = new gestionnaireClasses();
	college.ajouteClasse(classe6A);
	college.ajouteClasse(classe6B);
	college.ajouteClasse(classe6C);
	college.ajouteClasse(classe5A);
	college.ajouteClasse(classe5B);
	
	
	// ELEVE
	System.out.println("Eleve :");
	System.out.println(e0);
	classe6A.ajoutEleve(e0);
	classe6A.ajoutEleve(e1);
	classe6A.ajoutEleve(e2);
	classe6A.ajoutEleve(e3);
	classe6B.ajoutEleve(e4);
	classe6C.ajoutEleve(e5);
	classe5A.ajoutEleve(e6);
	classe5B.ajoutEleve(e7);
	classe6B.ajoutEleve(e8);
	classe6B.ajoutEleve(e9);
	classe6B.ajoutEleve(e10);
	classe6B.ajoutEleve(e11);
	classe6B.ajoutEleve(e12);
	System.out.println("Liste des élèves :");
	System.out.println(g.toString());
	//classement 6A
	ArrayList <eleve> classement6A = classe6A.classementClasse();
	System.out.println(classement6A);
	// classement 6A en svt
	ArrayList <eleve> classementMat6A = classe6A.classementClasseMat(m1);
	System.out.println(classementMat6A);
	//classement des 6e
	ArrayList <classe> classement6 = college.classementNiveau(6);
	System.out.println(classement6);
	// classement des 6e en svt
	ArrayList <classe> classementMat6 = college.classementNivMat(m1, 6);
	System.out.println("Classement des 6A en svt :");
	System.out.println(classementMat6);
	
	
	// NOTE
	//System.out.println(n0);
	//System.out.println(n1);
	System.out.println("Moy de E0 :"+e0.moyenne());
	System.out.println("Moy de E0 en " +m+ ":"); 
	System.out.println(e0.moyenneMat(m));
	System.out.println("Moy de E1 en " +m+ ":"); 
	System.out.println(e1.moyenneMat(m));
	System.out.println("Moy de E2 en " +m+ ":"); 
	System.out.println(e2.moyenneMat(m));
	System.out.println("Moy de E3 en " +m+ ":"); 
	System.out.println(e3.moyenneMat(m));
	//System.out.println(n2);
	//System.out.println(n3);
	System.out.println("Moy de E0 en " +m1+ ":");
	System.out.println(e0.moyenneMat(m1));
	System.out.println("Moy de E1 en " +m1+ ":");
	System.out.println(e1.moyenneMat(m1));
	System.out.println("Moy de E2 en " +m1+ ":");
	System.out.println(e2.moyenneMat(m1));
	System.out.println("Moy de E3 en " +m1+ ":");
	System.out.println(e3.moyenneMat(m1));
	System.out.println("Moy des 6A : " +classe6A.moyenneClasse());
	System.out.println("Moy des 6A en maths: " +classe6A.moyenneClasseMat(m));
	System.out.println("Moy des 6A en svt: " +classe6A.moyenneClasseMat(m1));
	System.out.println("Moy des 6 : " +college.moyenneNiveau(6));
	System.out.println("Moy des 5 : " +college.moyenneNiveau(5));
	System.out.println("\n");
	
	// MATIERE
	System.out.println("Liste des matières :");
	System.out.println(mat);
	System.out.println("\n");
	
	// PROF
	System.out.println("Profs");
	classe6B.ajoutEnseignant(p);
	classe6B.ajoutEnseignant(p1);
	System.out.println(classe6B);
	}
}
