import java.util.ArrayList;

public class gestionnaireMatieres {
	static ArrayList <matiere> mat = new ArrayList<matiere>();
	
	// ajotuer une matière
	public void ajouteMatiere(matiere m){
		mat.add(m);
	}
	
	// afficher les matières
	public String toString(){
		String s= " "; 
		for(matiere m : mat)
			s+=m;
	        return s;
	}
	
	// rechercher une matière
	public matiere rechMat(String m){
		int i=0;
		matiere res = null;
		while (i<mat.size() && res == null){
			if(mat.get(i).nomMatiere==m)
				res = mat.get(i);
			i++;
		}
		return res;
	}
}
