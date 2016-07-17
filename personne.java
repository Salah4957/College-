
public abstract class personne {
	public String nom;
	public String prenom;
	public String adresse;
	public String dateNaissance;
	
	
	public personne(String nom, String prenom){
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public personne(String nom, String prenom,String adresse, String dateNaissance){
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.dateNaissance=dateNaissance;
	}
	
	public String toString(){
		return nom+", "+prenom+", "+dateNaissance+", "+adresse;
	}
	
	/**modifier personne ****/
	//ajouter des getters et des setters
	//getters pour l'affichage
	public String getNom(){
		return this.nom;
	}
	public String getPrenom(){
		return this.prenom;
	}
	public String getAdresse(){
		return this.adresse;
	
	}
	public String getDateNaissance(){
		return this.dateNaissance;
	}
	//setters pour changer la valeur
	public void setNom(String x){
		nom = x;
		
	}
	public void setPrenom(String x){
		prenom = x;
	}
	
	public void setAdresse(String x){
		adresse = x;
	}
	public void setDateNaissance(String x){
		dateNaissance = x;
	}
}
