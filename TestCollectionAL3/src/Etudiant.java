import java.util.Comparator;
import java.util.Objects;

public class Etudiant implements  Comparable<Etudiant> {
    int  m_iId ;
    String m_sNom ;
    String m_sPrenom ;

    public Etudiant() {
    }

    public Etudiant(int  i_iId, String i_sNom, String i_sPrenom) {
        this.m_iId = i_iId;
        this.m_sNom = m_sNom;
        this.m_sPrenom = m_sPrenom;
    }

    public int getM_iId() {
        return m_iId;
    }

    public void setM_iId(int m_iId) {
        this.m_iId = m_iId;
    }

    public String getM_sNom() {
        return m_sNom;
    }

    public void setM_sNom(String m_sNom) {
        this.m_sNom = m_sNom;
    }

    public String getM_sPrenom() {
        return m_sPrenom;
    }

    public void setM_sPrenom(String m_sPrenom) {
        this.m_sPrenom = m_sPrenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return m_iId == etudiant.m_iId;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "m_iId=" + m_iId +
                ", m_sNom='" + m_sNom + '\'' +
                ", m_sPrenom='" + m_sPrenom + '\'' +
                '}';
    }
    public int compareTo(Etudiant o) {
        return (this.m_iId-o.m_iId);
    }
    public static Comparator<Etudiant> NomC = new Comparator<Etudiant>() {
        @Override
        public int compare(Etudiant o1, Etudiant o2) {
            return o1.getM_sNom().compareTo(o2.getM_sNom());
        }
    };
}
