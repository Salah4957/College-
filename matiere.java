public class matiere {
	String nomMatiere =""; 
	
	public matiere(String nomMatiere){
		this.nomMatiere = nomMatiere;
	}
	public String toString(){
		return "Nom matière: " +nomMatiere;
	}
	public String getMatiere(){
		return this.matiere;
	}
}
