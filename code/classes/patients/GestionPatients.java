import java.util.ArrayList;
import java.util.HashMap;

public class GestionPatients {
    // Attribut
    private ArrayList<Patients> tableau_patients;

    // Constructeur
    public GestionPatients() {
        this.tableau_patients = new ArrayList<>();
    }

    // Méthode pour ajouter un patient
    public void ajouter_patient(Patients patient) {
        tableau_patients.add(patient);
    }

    // Méthode pour modifier un patient par son numéro de dossier
    public void modifier_patient(String num_dossier, Patients patient_modifie) {
        for (Patients patient : tableau_patients) {
            if (patient.get_num_dossier().equals(num_dossier)) {
                // Supprimer l'ancien patient et ajouter le nouveau
                tableau_patients.remove(patient);
                tableau_patients.add(patient_modifie);
                break;
            }
        }
    }

    // Méthode pour supprimer un patient par son numéro de dossier
    public void supprimer_patient(String num_dossier) {
        Patients patientASupprimer = null;
        for (Patients patient : tableau_patients) {
            if (patient.get_num_dossier().equals(num_dossier)) {
                patientASupprimer = patient;
                break;
            }
        }
        if (patientASupprimer != null) {
            tableau_patients.remove(patientASupprimer);
        }
    }

    // Méthode pour afficher la liste des patients
    public void afficher_liste() {
        for (Patients patient : tableau_patients) {
            System.out.println("Nom: " + patient.get_nom() + ", Prénom: " + patient.get_prenom() +
                    ", Numéro de dossier: " + patient.get_num_dossier());
        }
    }

    // Méthode pour obtenir un patient par son numéro de dossier
    public Patients get_patient_par_num_dossier(String num_dossier) {
        for (Patients patient : tableau_patients) {
            if (patient.get_num_dossier().equals(num_dossier)) {
                return patient;
            }
        }
        return null; // Retourne null si le patient n'est pas trouvé
    }
}
