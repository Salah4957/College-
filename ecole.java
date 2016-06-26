import java.util.ArrayList;

public class ecole{
	private ArrayList<enseignat> profs = new ArrayList<enseignat>();
	String nomEcole;

	public void ajoutEnseignat(enseignat a){
		profs.add(a);
	}
	public String toString(){
		StringBuilder s = new StringBuilder();
		for(enseignat a: enseignat){
			s.append(a.toString()).append("\n");
		}
		return s.toString();
	}
}
