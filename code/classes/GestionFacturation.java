/*******************************************\

Classe GestionFacturation :
Attributs :
liste_factures
Méthodes :
générer_facture(patient, médecin, montant)
rechercher_facture_par_patient(patient)
rechercher_facture_par_médecin(médecin)

\*******************************************/


public class GestionFacturation{
	
// Attributs :
	private java.util.List<Facture> liste_factures;
	
// Méthodes :
	public GestionFacturation(){}
	
	public Facture générer_facture(Patients patient, Medecin médecin, float montant){
		
		return new Facture();
	}
	public java.util.List<Facture> rechercher_facture_par_patient(Patients patient){
		java.util.List<Facture> factures = new java.util.ArrayList<Facture>();
		for(Facture facture: liste_factures)
			if(facture.getPatient().get_nom() == patient.get_nom())
				if(facture.getPatient().get_prenom() == patient.get_prenom()) factures.add(facture);
		return factures;
	}
	public java.util.List<Facture> rechercher_facture_par_médecin(Medecin médecin){
		
		java.util.List<Facture> factures = new java.util.ArrayList<Facture>();
		for(Facture facture: liste_factures)
			if(facture.getMédecin().getnom() == médecin.getnom())
				if(facture.getMédecin().getprenom() == médecin.getprenom())
					factures.add(facture);
		return factures;
	}
	
// Setters and getters
	/******************************************************************************************/
	public int set_liste_factures(java.util.List<Facture> liste_factures){
		this.liste_factures = liste_factures;
		return 1;
	}
	public java.util.List<Facture> get_liste_factures(){
		return this.liste_factures;
	}
	/******************************************************************************************/
	
}