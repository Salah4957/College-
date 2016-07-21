
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
}
