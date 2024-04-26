/*******************************************\

Classe GestionHistoriqueTestsMedicaux :
Attributs :
historiques_tests
Méthodes :
ajouter_historique(test)
rechercher_historique_par_patient(patient)
rechercher_historique_par_médecin(médecin)

\*******************************************/


public class GestionHistoriqueTestsMedicaux{
	
// Attributs :
	private java.util.List<Test> historiques_tests;
	
// Méthodes :
	public GestionHistoriqueTestsMedicaux(){
		this.historiques_tests = new java.util.ArrayList<Test>();
	}
	
	public int ajouter_historique(Test test){
		this.historiques_tests.add(test);
		return 1;
	}
	public java.util.List<Test> rechercher_historique_par_patient(Patients patient){
		
		java.util.List<Test> historiques = new java.util.ArrayList<Test>();
		for(Test test: historiques_tests)
			if(test.getPatient().get_nom() == patient.get_nom())
				if(test.getPatient().get_prenom() == patient.get_prenom())
					historiques.add(test);
		return historiques;
	}
	public java.util.List<Test> rechercher_historique_par_Médecin(Medecin médecin){
		
		java.util.List<Test> historiques = new java.util.ArrayList<Test>();
		for(Test test: historiques_tests)
			if(test.getMédecin().getnom() == médecin.getnom())
				if(test.getMédecin().getprenom() == médecin.getprenom())
					historiques.add(test);
		return historiques;
	}	
// Setters and getters
	/******************************************************************************************/
	public int set_historiques_tests(java.util.List<Test> historiques_tests){
		this.historiques_tests = historiques_tests;
		return 1;
	}
	public java.util.List<Test> get_historiques_tests(){
		return this.historiques_tests;
	}
	/******************************************************************************************/
	
}