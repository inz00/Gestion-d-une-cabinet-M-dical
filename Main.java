/*******************************************\

Classe Main :
Attributs :

Méthodes :

\*******************************************/


public class Main{
	
	public static void main(String[] argv){
		Main app = new Main();
		
		Patient ahmed = new Patient(0x00001FFF, "Ahmed", "Ben Ahmed");
		ahmed.age = 25 * 365;
		Médecin khaled = new Médecin(0x0000001F, "khaled", "Ben Khaled");
		khaled.spécialité = "rhumatologue";
		
		Facture facture = app.testerLaClasseFacture();
		facture.patient = ahmed;
		facture.médecin = khaled;
		HistoriqueTraitements historique_traitements = app.testerLaClasseHistoriqueTraitements();
			Traitement traitement = historique_traitements.traitements.get(0);
		HistoriqueTestsMedicaux historique_tests = app.testerLaClasseHistoriqueTestsMedicaux();
			Test test = historique_tests.tests.get(0);
		
		System.out.format(
			"\nMédecin: %s %s (%s)\n"
			+ "_____________________\n"
			+ "Patient:     %s %s (%d)\n"
			+ "Traitement:  %s %s (%d %s)\n"
			+ "Test:        %s (%s %s)\n"
			+ "Facture:     %.2f TTC DZD\n"
			, facture.médecin.nom, facture.médecin.prénom, facture.médecin.spécialité
			, facture.patient.nom, facture.patient.prénom, (facture.patient.age / 365)
			, traitement.médicament.nom_commercial, traitement.posologie, traitement.durée, traitement.unité_de_durée
			, test.titre, test.résultat, test.unité
			, facture.montant
			
		);
		
	}
	public Main(){}
	
	Facture testerLaClasseFacture(){
		// Classe
		Facture facture = new Facture();
		// Attributs
		facture.montant = 1200.00f;
		
		// Méthodes
		float montant = facture.calculer_montant();
		Facture f = facture.émettre_facture();
		
		return facture;
	}
	
	HistoriqueTraitements testerLaClasseHistoriqueTraitements(){
		// Classe
		HistoriqueTraitements historique = new HistoriqueTraitements();
		
		Médicament dolyc = new Médicament();
		dolyc.nom_commercial = "Dolyc 1g";
		dolyc.dci = "paracetamol"; // Acetaminophen
		dolyc.classification = "antalgiques";
		dolyc.dose = 1000;
		dolyc.unité = "mg";
		dolyc.forme = "comprimé";
		
		
		
		// Attributs
		Traitement traitement = new Traitement();
		traitement.titre = "Traitement par antalgiques";
		traitement.médicament = dolyc;
		traitement.durée = 7;
		traitement.unité_de_durée = "jour";
		traitement.posologie = "1g/jour";
		
		historique.ajouter_traitement(traitement);
		historique.afficher_historique();
		
		return historique;
	}
	
	HistoriqueTestsMedicaux testerLaClasseHistoriqueTestsMedicaux(){
		HistoriqueTestsMedicaux historique = new HistoriqueTestsMedicaux();
		
		Test crp = new Test();
		crp.titre = "CRP: Protéine C réactive normale";
		crp.résultat = "43";
		crp.unité = "mg/L";
		
		historique.ajouter_test(crp);
		historique.afficher_historique();
		
		return historique;
	}
	
	
}