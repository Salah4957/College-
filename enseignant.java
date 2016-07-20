public class enseignant extends personne{
	int numen;
	matiere matiere; 

	public enseignant(String nom, String prenom, int numen, matiere matiere){
		super(nom, prenom);
		this.numen=numen;
		this.matiere=matiere; 
		}
	
	public enseignant(String nomP, String prenomP, String dateP, String adresseP, int numen, matiere mat) {
		super(nom,prenom);
		this.dateNaissance=dateP;
		this.adresse=adresseP;
		this.numen=numen;
		this.matiere=mat;
				
	}
	
	//getter
	public int getNumen(){
		return this.numen;
	}
	
	public String toString(){
		return super.nom+" "+super.prenom+", NUMEN: "+numen+", professeur de "+matiere;
	}
	//Modifier matiere
	//getters
	public matiere getMatiere(){
		return this.matiere;
	}
	//setters
	public void setMatiere(matiere x){ 
				
		matiere = x;     
									
	}
}

