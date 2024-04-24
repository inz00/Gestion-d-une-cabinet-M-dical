/*******************************************\

Classe HistoriqueTraitements :
Attributs :       
traitements.
Méthodes :
ajouter_traitement(traitement)
afficher_historique().

\*******************************************/


public class HistoriqueTraitements{
	
	public java.util.List<Traitement> traitements;
		
	public HistoriqueTraitements(){
		this.traitements = new java.util.ArrayList<Traitement>();
	}
	
	public int ajouter_traitement(Traitement traitement){
		this.traitements.add(traitement);
		return 1;
	}
	public int afficher_historique(){
		
		return 1;
	}
}