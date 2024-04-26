/*******************************************\

Classe GestionHistoriqueTraitements :
Attributs :
historiques_traitements
Méthodes :
ajouter_historique(traitement)
rechercher_historique_par_patient(patient)

\*******************************************/


public class GestionHistoriqueTraitements{
	
// Attributs :
	private java.util.List<Traitement> historiques_traitements;
	
// Méthodes :
	public GestionHistoriqueTraitements(){
		this.historiques_traitements = new java.util.ArrayList<Traitement>();
	}
	
	public int ajouter_historique(Traitement traitement){
		this.historiques_traitements.add(traitement);
		return 1;
	}
	public java.util.List<Traitement> rechercher_historique_par_patient(Patients patient){
		java.util.List<Traitement> historiques = new java.util.ArrayList<Traitement>();
		for(Traitement traitement: historiques_traitements)
			if(traitement.getPatient().get_nom() == patient.get_nom())
				if(traitement.getPatient().get_prenom() == patient.get_prenom())
					historiques.add(traitement);
		return historiques;
	}
// Setters and getters
	/******************************************************************************************/
	public int set_historiques_traitements(java.util.List<Traitement> historiques_traitements){
		this.historiques_traitements = historiques_traitements;
		return 1;
	}
	public java.util.List<Traitement> get_historiques_traitements(){
		return this.historiques_traitements;
	}
	/******************************************************************************************/
	
}