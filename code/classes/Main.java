/*******************************************\

Classe Main :
Attributs :

Méthodes :

\*******************************************/


public class Main{
	
	public static void main(String[] argv){
		Main app = new Main();
		
		Patients ahmed = new Patients("Ahmed", "Ben Ahmed", 25, "A+", "homme", null, null, null, null, null);
		// On doit préciser l'unité de l'âge (jours, mois, ans).
		ahmed.set_age(25); // 25 * 365;
		Medecin khaled = new Medecin("khaled", "Ben Khaled");
		// khaled.spécialité = "rhumatologue";
		
		Facture facture = app.testerLaClasseFacture();
		facture.setPatient(ahmed);
		facture.setMédecin(khaled);
		HistoriqueTraitements historique_traitements = app.testerLaClasseHistoriqueTraitements();
			Traitement traitement = historique_traitements.getTraitements().get(0);
		HistoriqueTestsMedicaux historique_tests = app.testerLaClasseHistoriqueTestsMedicaux();
			Test test = historique_tests.getTests().get(0);
		
		System.out.format(
			"\nMédecin: %s %s (%s)\n"
			+ "_____________________\n"
			+ "Patient:     %s %s (%d)\n"
			+ "Traitement:  %s %s (%d %s)\n"
			+ "Test:        %s (%s %s)\n"
			+ "Facture:     %.2f TTC DZD\n"
			// On doit ajouter la spécialité
			, facture.getMédecin().getnom(), facture.getMédecin().getprenom(), "incconnu"
			// On doit préciser l'unité de l'âge (jours, mois, ans).
			, facture.getPatient().get_nom(), facture.getPatient().get_prenom(), facture.getPatient().get_age() // (facture.getPatient().age / 365) 
			, traitement.médicament.nom_commercial, traitement.posologie, traitement.durée, traitement.unité_de_durée
			, test.titre, test.résultat, test.unité
			, facture.getMontant()
			
		);
		
	}
	public Main(){}
	
	Facture testerLaClasseFacture(){
		// Classe
		Facture facture = new Facture();
		// Attributs
		facture.setMontant(1200.00f);
		
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
		traitement.date = new java.util.Date();
		
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
		crp.date = new java.util.Date();
		
		historique.ajouter_test(crp);
		historique.afficher_historique();
		
		return historique;
	}
	
	
}