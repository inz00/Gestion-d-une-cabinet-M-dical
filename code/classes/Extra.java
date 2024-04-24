/*******************************************\

Classe Personne :
Attributs :

Méthodes :

\*******************************************/


class Personne{
	int id, age; // age en jours
	java.util.Date date_de_naissance;
	String nom, prénom, sexe;
	
	public Personne(int id, String nom, String prénom){
		this.id = id;
		this.nom = nom;
		this.prénom = prénom;
	}
}
class Patient extends Personne{
	float poids;
	public Patient(int id, String nom, String prénom){
		super(id, nom, prénom);
	}
	
}
class Médecin extends Personne{
	String spécialité;
	public Médecin(int id, String nom, String prénom){
		super(id, nom, prénom);
	}
	
}


class Traitement{
	String titre;
	Médicament médicament;
	int durée; // en jours
	String unité_de_durée; // Heures, jours, semaines, mois ...
	String posologie;
	java.util.Date date_de_début;
	java.util.List<Médicament> médicaments_supplémentaires;
	java.util.List<String> procédures;
	
	public Traitement(){}
}
class Médicament{
	String dci, nom_commercial, unité, classification, forme;
	float dose;
	public Médicament(){}
}

class Test{
	
	String titre, unité, résultat;
	java.util.Date date;

	public Test(){}
}