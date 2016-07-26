import java.util.ArrayList;

public class eleve extends personne{
	int ine;
	float absence=0;
	
	// constructeur 1
	public eleve(String nom, String prenom, int ine){
		super(nom, prenom);
		this.ine=ine;
	}
	
	// constructeur 2
	public eleve(String nom, String prenom, String dateNaissance, String adresse, classe nomClasse, int ine, float absence){
		super(nom, prenom, dateNaissance, adresse, nomClasse);
		this.ine=ine;
		this.absence=absence;
	}
	
	// afficher un élève
	public String toString(){
		String s= super.nom+", "+super.prenom+", "+super.dateNaissance+", "+super.adresse+", "+ine; 
		if (absence==0){
			s += ", aucune absence.";
			}
		else {
			s += ", " +absence+ " journées d'absence.";
				}
		return s;
	}
	
	// calculer la moyenne des notes (moyenne générale)
	public Double moyenne(){
		gestionnaireNotes g = new gestionnaireNotes();
		g.recupNotesEleve(this); // je veux cet élève 
		ArrayList <note> notes = g.recupNotesEleve(this);
		Double cumul = 0.0;
		for (int i=0; i<notes.size(); i++){
			cumul+=notes.get(i).valeurNote; // récupérer la valeur de la note à l'indice i de la liste notes
		}
		return cumul/notes.size();
	}
		
	// calculer la moyenne des notes dans chaque matière
	public Double moyenneMat(matiere m){
		gestionnaireNotes g = new gestionnaireNotes();
		ArrayList <note> notes = g.recupNotesEleveMat(this, m);
		Double cumul = 0.0;
		for (int i=0; i<notes.size(); i++){
			cumul+=notes.get(i).valeurNote; // récupérer la valeur de la note à l'indice i de la liste notes
		}
		return cumul/notes.size();
	}
	
	// récupérer le nom d'un élève
	public String getNomEleve(){
		return this.nom;
	}
	
	// récupérer le nom d'un élève
	public String getPrenomEleve(){
		return this.nom;
	}
	
	// récupérer l'adresse d'un élève
	public String getAdEleve(){
		return this.adresse;
	}
	
	// récupérer la date de naissance d'un élève
	public String getDateNaissanceEleve(){
		return this.dateNaissance;
	}
	
	// récupérer le nombre d'asbence d'un élève
	public float getAbs(){
		return this.absence;
	}
	
	// modifier le nombre d'asbence d'un élève
	public void setAbs(float x) {
		absence = x;
	}
}
