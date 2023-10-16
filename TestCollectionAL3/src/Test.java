import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {


    public static void main(String[] args) {

        ArrayList list=new ArrayList();

        list.add(5);
        list.add(6);
        list.add("test");
        list.add(5);
        list.add(6.2);
        list.add("test");

        System.out.println(list);
        System.out.println(list.contains("test"));
        System.out.println(list.contains(5));
        System.out.println(list.remove(5));
        Integer a=5;
        System.out.println(list.remove(new Integer(5)));
        System.out.println(list.remove("test"));

        Personne p1=new Personne(1,15,"ben","ons");
        Personne p2=new Personne(2,17,"ben fa","sana");
        Personne p3=new Personne(3,19,"ben ss","sinda");
        Personne p4=new Personne(1,15,"ben","ons");

 list.add(p1);
 list.add(p2);
 list.add(p3);
 list.add(p4);
 list.add(p1);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(5));
        Object v1=list.get(0);
        // parcours de toute la liste avec deux méthodes
       for (int i=0;i<list.size();i++)
           System.out.println(list.get(i));

       for(Object var:list)
           System.out.println(var);
        //parcourir et Afficher que les noms des personnes avec deux méthodes
       for (int i=0;i<list.size();i++)
       {
           Object ob=list.get(i);
           if(ob instanceof Personne) {
               Personne p = (Personne) ob;
               System.out.println("nom :"+p.getNom());
              // System.out.println(((Personne)list.get(i)).getNom());
           }
       }
       for (Object obj:list)
       {
           if(obj instanceof Personne)
               System.out.println(((Personne)obj).getNom());
       }
       ArrayList<Personne> listper=new ArrayList();
       listper.add(p1);
       listper.add(p2);
       listper.add(p3);

       listper.add(p1);
        System.out.println(listper.contains(p1));
        System.out.println(listper.contains(p4));
        System.out.println(listper.contains(new Personne(2,17,"ben fa","sana")));
        System.out.println(listper.remove(new Personne(2,17,"ben fa","sana")));
        System.out.println(listper.get(1));
         Personne pers=listper.get(0);
         ////////liste d'integer
        /////Tri croissante
         List<Integer> I_list = new ArrayList<Integer>();
         I_list.add(5) ;
        I_list.add(8) ;
        I_list.add(0) ;
        I_list.add(2) ;
        Collections.sort(I_list);
        for( Object o:I_list) {
            System.out.println(o);
        }
        //tri décroissante
        Collections.sort(I_list,Collections.reverseOrder());
        System.out.println(I_list);
         //créer une liste de interger et faite le tri crois et decr
        //créer une liste de String et faite le tri crois et decr
        //trier la liste de personne
        ArrayList<String> lists=new ArrayList<>();
        lists.add("Mohamed") ;
        lists.add("Aziz") ;
        lists.add("Naffeti") ;
        Collections.sort(lists);
        System.out.println("string list en ordre croissant"+lists);
        Collections.sort(lists,Collections.reverseOrder());
        System.out.println("string list en ordre décroissant"+lists);
        /////////tri de la liste personne méthode comparable
        System.out.println("liste per avant tri selon l'id avec compareto"+listper);
        Collections.sort(listper);
        System.out.println("liste per aprés tri selon l'id avec compareto"+listper);
        //////////////////////////////////////////////////////////
        ////// tri de la liste personne using comparator
        listper.add(new Personne(0,12,"Aziz","Naffeti")) ;
        Collections.sort(listper,Personne.AgeComparator);
        System.out.println("liste per aprés tri selon age comparator"+listper);
        Collections.sort(listper,Personne.IdComparator);
        System.out.println("listeper apres tri selone id compartor"+listper);


    }
}
