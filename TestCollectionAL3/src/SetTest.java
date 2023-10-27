import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest implements GestionEnseignant {
    Set<Enseignant> hs ;
    SetTest(int choix){
        if (choix==1)
        {
            hs=new TreeSet<>() ;
        }
        else
            hs=new HashSet<>() ;




    }



    @Override
    public void ajouterEnseignant(Enseignant e) {
        hs.add(e) ;

    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        if(hs.contains(e))
            return true ;
        return false;
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for(Enseignant o :hs){
            if (o.getM_id()==id)
                return  true  ;
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        if(rechercherEnseignant(e))
            hs.remove(e) ;
        else
            System.out.println("Aucun enseignant");

    }

    @Override
    public void displayEnseignants() {
        for(Enseignant dis:hs){
            System.out.println(dis);
        }
    }
}
