public class enseignant extends personne{
	int numen;

	public enseignant(String nom, String prenom, int numen){
		super(nom, prenom);
		this.numen=numen;
		}
	
	public String toString(){
		return super.nom+", "+super.prenom+", "+numen;
	}
	

}
