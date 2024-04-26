/*******************************************\

Classe HistoriqueTestsMedicaux :
Attributs :
tests
Méthodes :
ajouter_test(test)
afficher_historique()

\*******************************************/


public class HistoriqueTestsMedicaux{
	
// Attributs :
	private java.util.List<Test> tests;
	
// Méthodes :
	public HistoriqueTestsMedicaux(){
		this.tests = new java.util.ArrayList<Test>();
	}
	
	public int ajouter_test(Test test){
		this.tests.add(test);
		return 1;
	}
	public int afficher_historique(){
		int id = 0;
		String titre = "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ HISTORIQUE DE TEST ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░";
		// id 5 titre 35 résultat 10 unité 10 date 10
		String entête = String.format("%-5s %-35s %-10s %-10s %-10s", "Id", "Titre", "Résultat", "Unité", "Date");
		
		
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.format("%s\n", titre);
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.format("%s\n", entête);
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		for(Test test: this.tests)
			System.out.format(
				"%-5d %-35s %-10s %-10s %-10s\n"
				, id++
				, test.titre
				, test.résultat
				, test.unité
				, new java.text.SimpleDateFormat().format(test.date)
				
			);
			System.out.println("--------------------------------------------------------------------------------------------------------------------");
		return 1;
	}
// Setters and getters
	/******************************************************************************************/
	public int setTests(java.util.List<Test> tests){
		this.tests = tests;
		return 1;
	}
	public java.util.List<Test> getTests(){
		return this.tests;
	}
	/******************************************************************************************/
	
}