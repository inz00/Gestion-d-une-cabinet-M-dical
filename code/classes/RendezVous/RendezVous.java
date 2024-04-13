import java.time.LocalDate;
import java.time.LocalTime;

public class RendezVous {
    private LocalDate date;
    private LocalTime heure;
    private Patient patient;
    private String etat;
    
    public RendezVous(LocalDate date, LocalTime heure, Patient patient, String etat) {
        this.date = date;
        this.heure = heure;
        this.patient = patient;
        this.etat = etat;
    } 
    public LocalDate getDate() {
        return this.date;
    }
    public LocalTime getHeure() {
        return this.heure;
    }
    public Patient getPatient() {
        return this.patient;
    }
    public String getEtat() {
        return this.etat;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public void setEtat(String etat) {
        this.etat = etat;
    }
}




