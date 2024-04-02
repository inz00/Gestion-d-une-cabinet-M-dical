import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Medecin{
    private String nom;
    private String prenom;
    private String mot_de_passe;
    private String specialite;
    private String[][] horaires_travail;
    private Agendamedecin agenda;   //classe agendamedecin a ajouter

    //constructeur
    public Medecin(String nom,String prenom,String mot_de_passe,String specialite,String[][] horaires_travail){
        this.nom = nom;
        this.prenom = prenom;
        this.mot_de_passe = mot_de_passe;
        this.specialite = specialite;
        this.horaires_travail = horaires_travail;
        this.agendaMedecin = new AgendaMedecin(); // Initialisation de l'agenda du médecin
    }



   //geters
   public String getnom(){
    return nom;
   }

   public String getprenom(){
    return prenom;
   }
   public String getmotdepasse(){
    return mot_de_passe;
   }
   public String getspécialite() {
    return specialite;
}

public String[][] gethorairestravail() {
    return horaires_travail;
}
public List<String> getagenda(){
    return agenda;
}

//setters

public void setnom(String nom) {
    this.nom = nom;
}

public void setprenom(String prenom) {
    this.prenom = prenom;
}

public void setmotdepasse(String mot_de_passe) {
    this.mot_de_passe = mot_de_passe;
}

public void setspécialite(String specialite) {
    this.specialite = specialite;
}

public void sethorairestravail(String[][] horaires_travail) {
    this.horaires_travail = horaires_travail;
}

public void setagenda(Agendamedecin agenda) {
    this.agenda = agenda;
}

//methode qui ajoute un rendez vous a l'agenda
public ajoutRDV(LocalDate date,LocalTime heure,String patient){
    agenda.ajouterRDV(date,heure,patient);    //methode de la classe agenda medecin
}
public suppressionRDV(LocalDate date,LocalTime heure,String patient){
    agenda.suprimerRDV(date,heure,patient);    //methode de la classe agenda medecin
}

//affichage
public void affichagemedecin(){
    System.out.println(nom);
    System.out.println(prenom);
    System.out.println(mot_de_passe);
    System.out.println(horaires_travail);
    agenda.affichage();    //methode de la classe agenda medecin

}




}
