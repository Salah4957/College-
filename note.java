public class note {
	float valeurNote;
	eleve eleve; 
	matiere matiere;
	
	// constructeur
		public note(float valeurNote, eleve eleve, matiere matiere){
			this.valeurNote=valeurNote;
			this.eleve=eleve;
			this.matiere = matiere;
		}
		
	public String toString(){
			return "Note: " +valeurNote;
		}
}
