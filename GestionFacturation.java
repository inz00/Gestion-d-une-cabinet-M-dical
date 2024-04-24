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
	
	public java.util.List<Facture> liste_factures;
	
	public GestionFacturation(){}
	
	public Facture générer_facture(Patient patient, Médecin médecin, float montant){
		
		return new Facture();
	}
	public Facture rechercher_facture_par_patient(Patient patient){
		
		return new Facture();
	}
	public Facture rechercher_facture_par_médecin(Médecin médecin){
		
		return new Facture();
	}
	
}