	import java.util.ArrayList;

	public class gestionnaireEleves {
		static ArrayList <eleve> eleves = null;
		
		public gestionnaireEleves(){
			if(eleves==null)
				eleves = new ArrayList<eleve>();
		}
		
		/*public ArrayList<eleve> getGestionnaire(){			
			return eleves;
		}*/
		
		public void ajouteEleve(eleve el){
			eleves.add(el);
		}
		
		public String toString(){
			String s= ""; 
			for(eleve el : eleves){
				s+=el.toString();
			}
		    return s;
		     
	}
}
