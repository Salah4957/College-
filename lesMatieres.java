import java.util.ArrayList;

public class lesMatieres {
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
}
