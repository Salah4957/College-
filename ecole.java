import java.util.ArrayList;

public class ecole{
	private ArrayList<enseignant> profs = new ArrayList<enseignant>();
	String nomEcole;

	public void ajoutEnseignat(enseignant a){
		profs.add(a);
	}
	public String toString(){
		StringBuilder s = new StringBuilder();
		for(enseignant a: profs){
			s.append(a.toString()).append("\n");
		}
		return s.toString();
	}
}
