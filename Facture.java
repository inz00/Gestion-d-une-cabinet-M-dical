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
	
	public Patient patient;
	public Médecin médecin;
	public float montant; // HT, TVA, ...
	public java.util.Date date_emission;
	
	public Facture(){}
	
	public float calculer_montant(){
		
		return this.montant;
	}
	public Facture émettre_facture(){
		
		return this;
	}
	
}