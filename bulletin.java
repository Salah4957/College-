import java.util.ArrayList;
import java.util.Arrays;

public class bulletin {
	
	public static void main(String[] args) {
	// création eleve
	gestionnaireEleves g = new gestionnaireEleves();
	eleve e6A1 = new eleve ("Boris","Dubois",1000000);
	eleve e6A2 = new eleve ("Etienne","Moncollin",1000001);
	eleve e6A3 = new eleve ("Cédric","Picard","17 rue des acacias 75017 Paris", "17/02/2000", 1000002, 2);
	eleve e6B1 = new eleve ("Sophie","Michel",1000003);
	eleve e6B2 = new eleve ("Caroline","Michel",1000004);
	eleve e6B3 = new eleve ("Valérie","Farolfi",1000005);
	eleve e6C1 = new eleve ("Myriam","Martin",1000006);
	eleve e6C2 = new eleve ("Zoé","Casenove",1000007);
	eleve e6C3 = new eleve ("Barbara","Thomas",1000008);
	eleve e5A1 = new eleve ("Lisa","Fernbach",1000009);
	eleve e5A2 = new eleve ("Sarah","Bastien",1000010);
	eleve e5B1 = new eleve ("Stéphanie","Lux",1000011);
	eleve e5B2 = new eleve ("Romain","Brax",1000012);
	g.ajouteEleve(e6A1);
	g.ajouteEleve(e6A2);
	g.ajouteEleve(e6A3);
	g.ajouteEleve(e6B1);
	g.ajouteEleve(e6B2);
	g.ajouteEleve(e6B3);
	g.ajouteEleve(e6C1);
	g.ajouteEleve(e6C2);
	g.ajouteEleve(e6C3);
	g.ajouteEleve(e5A1);
	g.ajouteEleve(e5A2);
	g.ajouteEleve(e5B1);
	g.ajouteEleve(e5B2);
	// création matière
	matiere maths = new matiere("maths");
	matiere svt = new matiere("SVT");
	matiere histoire = new matiere("histoire-géographie");
	matiere anglais = new matiere("anglais");
	matiere allemand = new matiere("allemand");
	matiere francais = new matiere("français");
	matiere physique = new matiere("physique-chimie");
	matiere eps = new matiere("EPS");
	matiere espagnol = new matiere("espagnol");
	matiere musique = new matiere("musique");
	matiere artpla = new matiere("arts plastiques");
	matiere technologie = new matiere("technologie");
	
	// création liste matière
	gestionnaireMatieres mat = new gestionnaireMatieres();
	mat.ajouteMatiere(maths);
	mat.ajouteMatiere(svt);
	mat.ajouteMatiere(histoire);
	mat.ajouteMatiere(anglais);
	mat.ajouteMatiere(allemand);
	mat.ajouteMatiere(francais);
	mat.ajouteMatiere(physique);
	mat.ajouteMatiere(eps);
	mat.ajouteMatiere(espagnol);
	mat.ajouteMatiere(musique);
	mat.ajouteMatiere(artpla);
	mat.ajouteMatiere(technologie);
	
	// création note
	note n0 = new note(12, e6A1, maths);
	note n1 = new note(14, e6A1, svt);
	note n2 = new note(16, e6A2, maths);
	note n3 = new note(18, e6A2, svt);
	note n4 = new note(8, e6A3, maths);
	note n5 = new note(11, e6A3, svt);
	note n6 = new note(18, e6C1, maths);
	note n7 = new note(14, e6C2, maths);
	note n8 = new note(11, e6C3, maths);
	note n9 = new note(12, e6A1, svt);
	note n10 = new note(14, e6A1, svt);
	note n11 = new note(16, e6A2, maths);
	note n12 = new note(18, e6A2, anglais);
	note n13 = new note(9, e6A3, maths);
	note n14 = new note(11, e6A3, svt);
	note n15 = new note(18,e6C1, svt);
	note n16 = new note(3, e6C2, svt);
	note n17 = new note(16, e6C3, svt);
	note n18 = new note(11, e5A2, histoire);
	note n19 = new note(15, e6B1, maths);
	note n20 = new note(8, e6B2, svt);
	note n21 = new note(18, e6B3, maths); 
	note n22 = new note(8, e5B1, maths);
	note n23 = new note(12, e5B2, histoire);
	note n24 = new note(11, e5A1, svt);
	note n25 = new note(18, e6C1, maths);
	note n26 = new note(12, e6C1, anglais);
	note n27 = new note(15, e6B1, svt);
	note n28 = new note(8, e6B2, maths);
	note n29 = new note(18, e6B3, svt); 
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
	releve.ajouter(n27);
	releve.ajouter(n28);
	releve.ajouter(n29);
	// création prof
	enseignant p0 = new enseignant("François", "Lembrouille", 100, maths);
	enseignant p1 = new enseignant("Homer", "Simpson", 101, svt);
	gestionnaireEnseignants profs = new gestionnaireEnseignants();
	profs.ajouteEnseignant(p0);
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
	classe6A.ajoutEleve(e6A1);
	classe6A.ajoutEleve(e6A2);
	classe6A.ajoutEleve(e6A3);
	classe6B.ajoutEleve(e6B1);
	classe6B.ajoutEleve(e6B2);
	classe6B.ajoutEleve(e6B3);
	classe6C.ajoutEleve(e6C1);
	classe6C.ajoutEleve(e6C2);
	classe6C.ajoutEleve(e6C3);
	classe5A.ajoutEleve(e5A1);
	classe5A.ajoutEleve(e5A2);
	classe5B.ajoutEleve(e5B1);
	classe5B.ajoutEleve(e5B2);

	System.out.println("Liste des élèves :");
	System.out.println(g.toString());
	//classement 6A
	ArrayList <eleve> classement6A = classe6A.classementClasse();
	System.out.println(classement6A);
	// classement 6A en svt
	ArrayList <eleve> classementMat6A = classe6A.classementClasseMat(svt);
	System.out.println(classementMat6A);
	//classement des 6e
	ArrayList <classe> classement6 = college.classementNiveau(6);
	System.out.println(classement6);
	// classement des 6e en svt
	ArrayList <classe> classementMat6 = college.classementNivMat(svt, 6);
	System.out.println("Classement des 6A en svt :");
	System.out.println(classementMat6);
	
	
	// NOTE
	//System.out.println(n0);
	//System.out.println(n1);
	System.out.println("Moy de " +e6A1+" :"+e6A1.moyenne());
	System.out.println("Moy de " +e6A1+" en "+maths+ " : " + e6A1.moyenneMat(maths)); 
	System.out.println("Moy de" +e6A2+" en "+maths+ " : " +e6A2.moyenneMat(maths)); 
	System.out.println("Moy de" +e6A3+" en "+maths+ " : " +e6A3.moyenneMat(maths)); 
	System.out.println("Moy des 6A en " +maths+ " :" +classe6A.moyenneClasseMat(maths)); 
	System.out.println("Moy de" +e6A1+" en " +svt+ ": " + e6A1.moyenneMat(svt));
	System.out.println("Moy de " +e6A2+" en " +svt+ ": " + e6A2.moyenneMat(svt));
	System.out.println("Moy de " +e6A3+" en "+svt+ ": " + e6A3.moyenneMat(svt));
	System.out.println("Moy de " +e6B1+" en " +svt+ ": " + e6B1.moyenneMat(svt));
	System.out.println("Moy des 6A : " +classe6A.moyenneClasse());
	System.out.println("Moy des 6A en maths: " +classe6A.moyenneClasseMat(maths));
	System.out.println("Moy des 6A en svt: " +classe6A.moyenneClasseMat(svt));
	System.out.println("Moy des 6 : " +college.moyenneNiveau(6));
	System.out.println("Moy des 5 : " +college.moyenneNiveau(5));
	System.out.println("\n");
	
	// MATIERE
	System.out.println("Liste des matières :");
	System.out.println(mat);
	System.out.println("\n");
	
	// PROF
	System.out.println("Profs");
	classe6B.ajoutEnseignant(p0);
	classe6B.ajoutEnseignant(p1);
	System.out.println(classe6B);
	}
}

