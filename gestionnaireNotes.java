
import java.util.ArrayList;

public class gestionnaireNotes {
	static ArrayList <note> notes = null;
	
	// création liste notes si aucune note
	public gestionnaireNotes(){
		if(notes==null)
			notes = new ArrayList<note>();
	}
	
	// récupèrer liste de toutes les notes d'un élève 
	public ArrayList <note> recupNotesEleve(eleve e){
		ArrayList <note> noteEleve = new ArrayList <note>();
		for (note n: notes){
			if (n.eleve ==e){
				noteEleve.add(n);
			}
		}
		return noteEleve;
	}
	
	// récupèrer liste de toutes les notes d'un élève dans une matière
	public ArrayList <note> recupNotesEleveMat(eleve e, matiere m){
		ArrayList <note> noteEleveMat = new ArrayList <note>();
		for (note n: notes){
			if (n.eleve == e  && n.matiere==m){
				noteEleveMat.add(n);
			}
		}
		return noteEleveMat;
	}
	
	// ajouter une note dans la liste des notes
	public void ajouter(note n){
		notes.add(n);
	}
}
