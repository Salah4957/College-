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
	public eleve(String nom, String prenom,String adresse, String dateNaissance, int ine, float absence){
		super(nom, prenom, adresse, dateNaissance);
		this.ine=ine;
		this.absence=absence;
	}
	
	// Afficher
	public String toString(){
		String s= super.nom+", "+super.prenom+", "+super.dateNaissance+", "+super.adresse+", "+ine; 
		if (absence==0){
			s += ", aucune absence \n";
			}
		else {
			s += ", " +absence+ " journées d'absence \n";
				}
		return s;
	}
	
	//Calculer la moyenne des notes (moy g)
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
		
	//Calculer la moyenne des notes dans chaque matière
		public Double moyenneMat(matiere m){
			gestionnaireNotes g = new gestionnaireNotes();
			g.recupNotesEleveMat(this, m); 
			ArrayList <note> notes = g.recupNotesEleveMat(this, m);
			Double cumul = 0.0;
			for (int i=0; i<notes.size(); i++){
				cumul+=notes.get(i).valeurNote; // récupérer la valeur de la note à l'indice i de la liste notes
			}
				return cumul/notes.size();
		}
	

}
