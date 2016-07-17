import java.util.ArrayList;


public class classe {
	private ArrayList<eleve> eleves = new ArrayList<eleve>();
	private ArrayList <enseignant> ens = new ArrayList<enseignant>();
	String profPrincipal;
	int niveau;
	String nomClasse;
	
	// constructeur 1
	public classe (){
	}
	
	// constructeur 2
	public classe (ArrayList eleve, ArrayList enseignant, String profPrincipal, int niveau, String nomClasse){
		if(eleve != null)
			this.eleves = eleve; 
		if(enseignant != null)
			this.ens = enseignant; 
		this.profPrincipal=profPrincipal;
		this.niveau=niveau; 
		this.nomClasse= nomClasse;
	}
	
	// ajout élève --> UTILE?
	public void ajoutEleve(eleve a){
		eleves.add(a);
	}
	
	// ajout Prof --> UTILE?
	public void ajoutEnseignant(enseignant e){
		ens.add(e);
	}
	
	// affichage 
	public String toString(){
		return nomClasse;
	}
	
	//Calculer la moyenne d'une classe : moyenne des moyennes de chaque élève
	public Double moyenneClasse(){
		Double somme = 0.0;
		for (int i=0; i<eleves.size(); i++){
			somme+=eleves.get(i).moyenne();
		}
		return somme/eleves.size();
	}
	
	//Calculer la moyenne d'une classe dans une matière : moyenne des moyennes de chaque élève
	public Double moyenneClasseMat(matiere m){
		Double somme = 0.0;
		for (int i=0; i<eleves.size(); i++){
			somme+=eleves.get(i).moyenneMat(m);
		}
		return somme/eleves.size();
	}
	
    
	// Classement moyennes de la classe
	public ArrayList <eleve> classementClasse(){
		ArrayList <eleve> Eleves = new ArrayList <eleve>();
		ArrayList <Double> Notes = new ArrayList <Double>();
		for (eleve el : eleves){
			Double var = el.moyenne();
			int i = 0;
			while (i<Notes.size() && var<Notes.get(i))
				i++;
			Notes.add(i, var);
			Eleves.add(i, el);
		}
		return Eleves; 
	}
	
	// Classement moyennes de la classe dans une matiere
	public ArrayList <eleve> classementClasseMat(matiere m){
		ArrayList <eleve> Eleves = new ArrayList <eleve>();
		ArrayList <Double> Notes = new ArrayList <Double>();
		for (eleve el : eleves){
			Double var = el.moyenneMat(m);
			int i = 0;
			while (i<Notes.size() && var<Notes.get(i))
				i++;
			Notes.add(i, var);
			Eleves.add(i, el);
		}
		return Eleves; 
	}

	
}
