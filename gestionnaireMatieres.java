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
