public class enseignant extends personne{
	int numen;
	matiere matiere; 

	// constructeur 2
	public enseignant(String nom, String prenom, int numen, matiere matiere){
		super(nom, prenom);
		this.numen=numen;
		this.matiere=matiere; 
		}
	
	// constructeur 3
	public enseignant(String nom, String prenom, String dateNaissance, String adresse, classe nomClasse, int numen, matiere matiere){
		super(nom, prenom, dateNaissance, adresse, nomClasse);
		this.numen=numen;
		this.matiere=matiere;
	
	// récupérer le numen
	public int getNumen(){
		return this.numen;
	}
	
	// récupérer un enseignant
	public String toString(){
		return super.nom+" "+super.prenom+", NUMEN: "+numen+", professeur de "+matiere;
	}
	
	// récupérer une matiere
	public matiere getMatiere(){
		return this.matiere;
	}
	
	// modifier la matière
	public void setMatiere(matiere x){ 	
		matiere = x;     							
	}
}
