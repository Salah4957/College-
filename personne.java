public abstract class personne {
	public String nom;
	public String prenom;
	public String adresse;
	public String dateNaissance;
	
	public classe nomClasse;
	
	public personne(){
	}
	
	public personne(String nom, String prenom){
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public personne(String nom, String prenom, String dateNaissance, String adresse, classe nomClasse){
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.dateNaissance=dateNaissance;
		this.nomClasse=nomClasse;
	}
	
	public String toString(){
		return nom+", "+prenom+", "+dateNaissance+", "+adresse;
	}
	
	public void setAd(String a) {
		adresse = a;
	}
}
