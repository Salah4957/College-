import java.util.ArrayList;

public class gestionnaireEnseignants {
	ArrayList <enseignant> ens = null;
	
	// création liste enseignants si aucun enseignant
	public gestionnaireEnseignants(){
		if(ens==null)
			ens = new ArrayList<enseignant>();
	}
	
	// ajouter un enseignant
	public void ajouteEnseignant(enseignant p){
		ens.add(p);
	}
	
	// afficher les enseignants
	public String toString(){
		String s= ""; 
		for(enseignant p : ens){
			s+=p.toString();
		}
	    return s;     
	}
	
	// recherche enseignant
	public enseignant rechEnseignant(int num){
		int j=0;
		enseignant res = null;
		while (j<ens.size() && res == null){
			if(ens.get(j).numen==num)
				res = ens.get(j);
			j++;
		}
		return res;
	}
}
