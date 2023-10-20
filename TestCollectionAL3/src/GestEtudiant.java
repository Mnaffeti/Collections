import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GestEtudiant implements Uni {
    ArrayList<Etudiant> liste=new ArrayList();
    @Override
    public void ajouterEtudiant(Etudiant e) {
        liste.add(e) ;
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return liste.contains(e);

    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant obj:liste)
        {
            if(obj.getM_sNom()==nom){
                return  true ;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        liste.remove(e) ;

    }

    @Override
    public void displayEtudiants() {
        for (Etudiant obj:liste)
        {
            obj.toString() ;
        }

    }

    @Override
    public void trierEtudiantsParId() {

        Collections.sort(liste);
    }

    @Override
    public void trierEtudiantsParNom() {
            Collections.sort(liste,Etudiant.NomC);
        };

    }

