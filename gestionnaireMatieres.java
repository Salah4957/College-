import java.util.ArrayList;

public class gestionnaireMatieres {
	static ArrayList <matiere> mat = new ArrayList<matiere>();
	
	public void ajouteMatiere(matiere m){
		mat.add(m);
	}
	
	public String toString(){
		String s= " "; 
		for(matiere m : mat)
			s+=m;
	        return s;
	}
	
	/**Recherche Matière**/
	public String rechMat(String m){
	String s = "";
	for (matiere mati : mat){
		if( mati.nomMatiere == m ){
			s += m;
		}
	}
	if (s != null)
		return s;
	else
		return "Aucun résultat trouvé";
	}
}
