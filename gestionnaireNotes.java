import java.util.ArrayList;

public class gestionnaireNotes {
	static ArrayList <note> notes = new ArrayList <note>();
	
	
	public void ajouteNote(note n){
		notes.add(n);
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder();
		for(note n: notes){
			s.append(n.toString()).append("\n");
		}
		return s.toString();
	}
}
