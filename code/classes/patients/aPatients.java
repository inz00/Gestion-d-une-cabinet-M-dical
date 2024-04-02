import java.util.ArrayList;
import java.util.HashMap;

public class Patients {
    // Attributs
    private String nom;
    private String prenom;
    private int age;
    private String groupe_sanguin;
    private String sexe;
    private String num_tel;
    private String adresse;
    private ArrayList<String> antecedents_medicaux;
    private String num_dossier;
    private String num_assurance;
    private HashMap<String, String> historique_RDV;

    // Constructeur
    public Patients(String nom, String prenom, int age, String groupe_sanguin, String sexe, String num_tel, String adresse, ArrayList<String> antecedents_medicaux, String num_dossier, String num_assurance) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.groupe_sanguin = groupe_sanguin;
        this.sexe = sexe;
        this.num_tel = num_tel;
        this.adresse = adresse;
        this.antecedents_medicaux = antecedents_medicaux;
        this.num_dossier = num_dossier;
        this.num_assurance = num_assurance;
        this.historique_RDV = new HashMap<>();
    }

    // Méthodes getters
    public String get_nom() {
        return nom;
    }

    public String get_prenom() {
        return prenom;
    }

    public int get_age() {
        return age;
    }

    public String get_groupe_sanguin() {
        return groupe_sanguin;
    }

    public String get_sexe() {
        return sexe;
    }

    public String get_num_tel() {
        return num_tel;
    }

    public String get_adresse() {
        return adresse;
    }

    public ArrayList<String> get_antecedents_medicaux() {
        return antecedents_medicaux;
    }

    public String get_num_dossier() {
        return num_dossier;
    }

    public String get_num_assurance() {
        return num_assurance;
    }

    // Méthodes setters
    public void set_nom(String nom) {
        this.nom = nom;
    }

    public void set_prenom(String prenom) {
        this.prenom = prenom;
    }

    public void set_age(int age) {
        this.age = age;
    }

    public void set_groupe_sanguin(String groupe_sanguin) {
        this.groupe_sanguin = groupe_sanguin;
    }

    public void set_sexe(String sexe) {
        this.sexe = sexe;
    }

    public void set_num_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public void set_adresse(String adresse) {
        this.adresse = adresse;
    }

    public void set_antecedents_medicaux(ArrayList<String> antecedents_medicaux) {
        this.antecedents_medicaux = antecedents_medicaux;
    }

    public void set_num_dossier(String num_dossier) {
        this.num_dossier = num_dossier;
    }

    public void set_num_assurance(String num_assurance) {
        this.num_assurance = num_assurance;
    }

    // Méthode pour ajouter un rendez-vous
    public void ajouter_RDV(String date, String heure, String medecin) {
        String info_RDV = "Date: " + date + ", Heure: " + heure + ", Médecin: " + medecin;
        historique_RDV.put(date, info_RDV);
    }

    // Méthode pour obtenir l'historique des rendez-vous
    public HashMap<String, String> obtenir_historique() {
        return historique_RDV;
    }
    
    //methode pour afficher les coordonnées du patient
    public void affichage_patient(){
        System.out.println("nom:"+nom);
        System.out.println("prenom:"+prenom);
        System.out.println("age:"+age);
        System.out.println("groupe sanguin:"+groupe_sanguin);
        System.out.println("sexe:"+sexe);
        System.out.println("numero du telephone:"+num_tel);
        System.out.println("adresse:"+adresse);
        System.out.println("Antécédents médicaux:");
           for (String antecedent : antecedents_medicaux) {
              System.out.println("- " + antecedent);
            }
        System.out.println("numero du dossier:"+num_dossier);
        System.out.println("numero d'assurance"+num_assurance);
    }
}
