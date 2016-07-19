import java.util.ArrayList;

public class gestionnaireClasses {
	static ArrayList <classe> classes = null;
	
	public gestionnaireClasses(){
		if(classes==null)
			classes = new ArrayList<classe>();
	}
	
	//Ajouter une classe
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
	public Double moyenneNiveau(int niveau){
		Double somme = 0.0;
		int cptClassesNiv =0;
		for (int i=0; i<classes.size(); i++){
			if (classes.get(i).niveau==niveau){
				cptClassesNiv++;
				somme+=classes.get(i).moyenneClasse();
			}
		}
		return somme/cptClassesNiv;
	}
	
	//Calculer la moyenne d'un niveau dans une matière : moyenne des moyennes de chaque classe d'un même niveau dans une matière
	public Double moyenneNiveauMat(int niveau, matiere m){
		Double somme = 0.0;
		int cptClassesNiv =0;
		for (int i=0; i<classes.size(); i++){
			if (classes.get(i).niveau==niveau){
				cptClassesNiv++;
				somme+=classes.get(i).moyenneClasseMat(m);
			}
		}
		return somme/cptClassesNiv;
	}
	
	// classement des classes dans un niveau
	public ArrayList <classe> classementNiveau(int niveau){
		ArrayList <classe> Classes = new ArrayList <classe>();
		ArrayList <Double> Notes = new ArrayList <Double>();
		for (classe c : classes){
			if (c.niveau==niveau){
			Double var = c.moyenneClasse();
			int i = 0;
			while (i<Notes.size() && var<Notes.get(i))
				i++;
			Notes.add(i, var);
			Classes.add(i, c);
			}
		}
		return Classes; 
	}
	
	// classement des classes dans un niveau par rapport à une matière
	public ArrayList <classe> classementNivMat(matiere m, int niveau){
		ArrayList <classe> Classes = new ArrayList <classe>();
		ArrayList <Double> Notes = new ArrayList <Double>();
		for (classe c : classes ){
			if (c.niveau==niveau){
				Double var = c.moyenneClasseMat(m);
				int i = 0;
				while (i<Notes.size() && var<Notes.get(i))
					i++;
				Notes.add(i, var);
				Classes.add(i, c);
			}
		}
		return Classes; 
	}
	
	// recherche Classe
		public classe rechClasse(String c){
			int i=0;
			classe res = null;
			while (i<classes.size() && res == null){
				if(classes.get(i).nomClasse==c)
					res = classes.get(i);
				i++;
			}
			return res;
		}
		
	// recherche Niveau
			public ArrayList <classe> rechNiveau(int n){
				int i=0;
				ArrayList <classe> res = null;
				while (i<classes.size() && res == null){
					if(classes.get(i).niveau==n)
						res.add(classes.get(i));
					i++;
				}
				return res;
			}
}
