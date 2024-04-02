import java.util.ArrayList;
public class GestionDossiersMedicaux{
    private ArrayList<DossierMedical> tableau_dossiers_medicaux;


    //constructeur
    public GestionDossiersMedicaux(){
        tableau_dossiers_medicaux = new ArrayList<DossierMedical>();
    }

    //methode pour ajouter un dossier medical
    public void ajouter_dossier_medical(DossierMedical dossier_medical){
      tableau_dossiers_medicaux.add(dossier_medical);
    }

    //methode pour modifier un dossier medical
    public void modifier_dossier_medical(int num_dossier,DossierMedical dossier_modifie){
       for(DossierMedical i : tableau_dossiers_medicaux){
        if (i.get_num_dossier() == num_dossier){
            tableau_dossiers_medicaux.remove(i);
            tableau_dossiers_medicaux.add(dossier_modifie);
            break;
        }
       }
    }

    //methode pour supprimer un dossier medical
    public void supprimer_dossier_medical(int num_dossier){
        for(DossierMedical i : tableau_dossiers_medicaux){
            if (i.get_num_dossier() == num_dossier){
                tableau_dossiers_medicaux.remove(i);
                break;
            }
           }

    }

    //methode pour afficher la liste des dossiers medicaux
    public void affichage_dossiers_medicaux(){
        for(DossierMedical i : tableau_dossiers_medicaux){
            i.afficher_dossier_medical();
           }

    }

}
