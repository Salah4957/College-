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
	
	/**Recherche prof - Enseignant **/
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
