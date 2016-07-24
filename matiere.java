public class matiere {
	String nomMatiere =""; 
	
	// constructeur
	public matiere(String nomMatiere){
		this.nomMatiere = nomMatiere;
	}
	
	// afficher le nom de la matière
	public String toString(){
		return nomMatiere + " ";
	}
 
	// récupérer le nom de la matière
	public String getNomMat(){
		return this.nomMatiere;
	}
	
	// modifier le nom de la matière
	public void setNomMatiere(String nomMatiere) {
		this.nomMatiere = nomMatiere;
	}
}
