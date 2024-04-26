/*******************************************\

Classe HistoriqueTraitements :
Attributs :       
traitements.
Méthodes :
ajouter_traitement(traitement)
afficher_historique().

\*******************************************/


public class HistoriqueTraitements{
	
// Attributs :       
	private java.util.List<Traitement> traitements;
	
// Méthodes :	
	public HistoriqueTraitements(){
		this.traitements = new java.util.ArrayList<Traitement>();
	}
	
	public int ajouter_traitement(Traitement traitement){
		this.traitements.add(traitement);
		return 1;
	}
	public int afficher_historique(){
		int id = 0;
		String titre = "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░ HISTORIQUE DE TRAITEMENTS ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░";
		// id 5 titre 30 médicament 15 posologie 10 durée 8 date 10
		String entête = String.format("%-5s %-30s %-15s %-10s %-8s %-10s", "Id", "Titre", "Médicament", "Posologie", "Durée", "Date");
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.format("%s\n", titre);
		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.format("%s\n", entête);
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		for(Traitement traitement: this.traitements)
			System.out.format(
				"%-5d %-30s %-15s %-10s %-8d %-10s\n"
				, id++
				, traitement.titre
				, traitement.médicament.nom_commercial
				, traitement.posologie
				, traitement.durée
				, new java.text.SimpleDateFormat().format(traitement.date)
				
			);
			System.out.println("--------------------------------------------------------------------------------------------------------------------");
		return 1;
	}
	
	// Setters and getters
	/******************************************************************************************/
	public int setTraitements(java.util.List<Traitement> traitements){
		this.traitements = traitements;
		return 1;
	}
	public java.util.List<Traitement> getTraitements(){
		return this.traitements;
	}
	/******************************************************************************************/
	
}