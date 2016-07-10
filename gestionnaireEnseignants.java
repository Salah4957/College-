import java.util.ArrayList;

public class gestionnaireEnseignants {
	static ArrayList <enseignant> ens = null;
	
	public gestionnaireEnseignants(){
		if(ens==null)
			ens = new ArrayList<enseignant>();
	}
	
	public void ajouteEnseignant(enseignant p){
		ens.add(p);
	}
	
	public String toString(){
		String s= ""; 
		for(enseignant p : ens){
			s+=p.toString();
		}
	    return s;
	     
}
	
}
