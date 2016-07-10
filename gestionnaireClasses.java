import java.util.ArrayList;

public class gestionnaireClasses {
	static ArrayList <classe> classes = null;
	
	public gestionnaireClasses(){
		if(classes==null)
			classes = new ArrayList<classe>();
	}
	
	public void ajouteClasse(classe c){
		classes.add(c);
	}
	
	public String toString(){
		String s= ""; 
		for(classe c : classes){
			s+=c.toString();
		}
	    return s;
	     
}
	//Calculer la moyenne d'un niveau : moyenne des moyennes de chaque classe d'un même niveau
	public Double moyenneNiveau(int niv){
		Double somme = 0.0;
		for (int i=0; i<classes.size(); i++){
			if (classes.get(i).niveau==niv){
				somme+=classes.get(i).moyenneClasse();
			}
		}
		return somme/classes.size();
	}
	
	//Calculer la moyenne d'un niveau dans une matière : moyenne des moyennes de chaque classe d'un même niveau dans une matière
	public Double moyenneNiveauMat(int niv, matiere m){
		Double somme = 0.0;
		for (int i=0; i<classes.size(); i++){
			if (classes.get(i).niveau==niv){
				somme+=classes.get(i).moyenneClasseMat(m);
			}
		}
		return somme/classes.size();
	}
	
	// classement des classes dans un niveau
	public ArrayList <classe> classementNiveau(){
		ArrayList <classe> Classes = new ArrayList <classe>();
		ArrayList <Double> Notes = new ArrayList <Double>();
		for (classe c : classes){
			Double var = c.moyenneClasse();
			int i = 0;
			while (i<Notes.size() && var<Notes.get(i))
				i++;
			Notes.add(i, var);
			Classes.add(i, c);
		}
		return Classes; 
	}
	
	// classement des classes dans un niveau par rapport à une matière
	public ArrayList <classe> classementNivMat(matiere m){
		ArrayList <classe> Classes = new ArrayList <classe>();
		ArrayList <Double> Notes = new ArrayList <Double>();
		for (classe c : classes){
			Double var = c.moyenneClasseMat(m);
			int i = 0;
			while (i<Notes.size() && var<Notes.get(i))
				i++;
			Notes.add(i, var);
			Classes.add(i, c);
		}
		return Classes; 
	}
}
