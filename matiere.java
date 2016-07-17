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
	/**Recherche Matière**/
	public String rechMat(matiere m){
	String s = "";
	for (matiere mati : mat){
		if( mati == m ){
			s += m;
		}
	}
	if (s != NULL)
		return s;
	else
		return "Aucun résultat trouvé";
	}
}
