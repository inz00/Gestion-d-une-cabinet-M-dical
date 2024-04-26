/*******************************************\
Classe Facture :
Attributs :
patient
médecin
montant
date_emission
Méthodes :
calculer_montant()
émettre_facture()
\*******************************************/


public class Facture{
	
// Attributs :
	private Patients patient;
	private Medecin médecin;
	private float montant; // HT, TVA, ...
	private java.util.Date date_emission;
	
// Méthodes :
	public Facture(){}
	
	public float calculer_montant(){
		
		return this.montant;
	}
	public Facture émettre_facture(){
		
		return this;
	}
	
	// Setters and getters
	/******************************************************************************************/
	public int setPatient(Patients patient){
		this.patient = patient;
		return 1;
	}
	public int setMédecin(Medecin médecin){
		this.médecin = médecin;
		return 1;
	}
	public float setMontant(float montant){
		this.montant = montant;
		return montant;
	}
	public int setDateEmission(java.util.Date date_emission){
		this.date_emission = date_emission;
		return 1;
	}
	
	public Patients getPatient(){ return this.patient;}
	public Medecin getMédecin(){ return this.médecin;}
	public float getMontant(){ return this.montant;}
	public java.util.Date getDateEmission(){ return this.date_emission;}
	/******************************************************************************************/
	
	
}