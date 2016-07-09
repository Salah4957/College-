	import java.util.ArrayList;

	public class gestionnaireEleve {
		static ArrayList <eleve> eleves = new ArrayList<eleve>();
		
		public void ajouteEleve(eleve el){
			eleves.add(el);
		}
		
		public String toString(){
			String s= " "; 
			for(eleve el : eleves)
				s+=eleves;
		        return s;
	}
}
