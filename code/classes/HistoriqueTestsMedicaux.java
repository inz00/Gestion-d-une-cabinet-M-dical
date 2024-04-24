/*******************************************\

Classe HistoriqueTestsMedicaux :
Attributs :
tests
Méthodes :
ajouter_test(test)
afficher_historique()

\*******************************************/


public class HistoriqueTestsMedicaux{
	
	public java.util.List<Test> tests;
	
	public HistoriqueTestsMedicaux(){
		this.tests = new java.util.ArrayList<Test>();
	}
	
	public int ajouter_test(Test test){
		this.tests.add(test);
		return 1;
	}
	public int afficher_historique(){
		
		return 1;
	}
}