import java.util.ArrayList;

	public class gestionnaireEleves {
		static ArrayList <eleve> eleves = null;
	
	// création liste eleves si aucun eleve
	public gestionnaireEleves(){
	if(eleves==null)
		eleves = new ArrayList<eleve>();
	}
		
	// ajouter un élève
	public void ajouteEleve(eleve el){
		eleves.add(el);
	}
	
	// afficher les élèves
	public String toString(){
		String s= ""; 
		for(eleve el : eleves){
			s+=el.toString();
		}
	    return s;   
	}
		
	// recherche eleve
	public eleve rechEleve(int i){
		int j=0;
		eleve res = null;
		while (j<eleves.size() && res == null){
			if(eleves.get(j).ine==i)
				res = eleves.get(j);
			j++;
		}
		return res;
	}
}
