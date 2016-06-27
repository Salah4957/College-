public class enseignant extends personne{
	int numen;
	matiere matiere; 

	public enseignant(String nom, String prenom, int numen, matiere matiere){
		super(nom, prenom);
		this.numen=numen;
		this.matiere=matiere; 
		}
	
	public String toString(){
		return super.nom+", "+super.prenom+", "+numen+", "+matiere;
	}

}
