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
	
	// constructeur 3
		public classe (String profPrincipal, int niveau, String nomClasse){
			this.profPrincipal=profPrincipal;
			this.niveau=niveau; 
			this.nomClasse= nomClasse;
		}
	
	public ArrayList<enseignant> getEns() {
			return ens;
		}

	// ajout élève 
	public void ajoutEleve(eleve a){
		eleves.add(a);
	}
	
	// ajout Prof 
	public void ajoutEnseignant(enseignant e){
		ens.add(e);
	}
	
	// affichage classe
	public String toString(){
		return nomClasse;
	}
	
	// calculer la moyenne d'une classe : moyenne des moyennes de chaque élève
	public Double moyenneClasse(){
		Double somme = 0.0;
		for (int i=0; i<eleves.size(); i++){
			somme+=eleves.get(i).moyenne();
		}
		return somme/eleves.size();
	}
	
	// calculer la moyenne d'une classe dans une matière : moyenne des moyennes de chaque élève
	public Double moyenneClasseMat(matiere m){
		Double somme = 0.0;
		for (int i=0; i<eleves.size(); i++){
			somme+=eleves.get(i).moyenneMat(m);
		}
		return somme/eleves.size();
	}
	
    
	// classement moyennes de la classe
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
	
	// classement moyennes de la classe dans une matiere
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
	
	// récupérer le nom de la classe
	public String getNomClasse(){
		return this.nomClasse;
	}
	
	// récupérer le niveau de la classe
	public int getNiveau(){
		return this.niveau;
	}
	
	// récupérer le prof principal
	public String getProfPrincipal(){
		return this.profPrincipal;
	}
	
	// modifier le nom de la classe
	public void setNomClasse(String x){
		nomClasse = x;
	}
	
	// modifier le niveau de la classe
	public void setNiveau(int x){
		niveau = x;
	}
	
	// modifier le prof principal
	public void setProfPrincipal(String x){
		profPrincipal = x;	
	}

	// afficher tous les élèves d'une classe 
	public String AffichEleve(){
		String s = new String();
		for(eleve el : eleves ){
				s= el+"\n";
		}
		return s;
	}
	
	// afficher tous les enseignants d'une classe 
	public String AfficheEnseignant(){
		String s = new String();
		for(enseignant prof : ens ){
				s= prof+"\n";
		}
		return s;
	}
	
	//supprimer élève
	public void supEleve(eleve a){
		eleves.remove(a);
	}
	
	// recherche élève
	public boolean rechEleve(int i){
		int j=0;
		while (j<eleves.size()){
			if(eleves.get(j).ine==i)
				return true;
			j++;
		}
		return false;
	}
}
