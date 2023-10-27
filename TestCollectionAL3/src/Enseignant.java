import java.util.Objects;

public class Enseignant implements  Comparable<Enseignant> {
    private int m_id ;
    private String m_sNom ;
    private String m_sPrenom ;

    public Enseignant() {
    }

    public Enseignant(int m_id, String m_sNom, String m_sPrenom) {
        this.m_id = m_id;
        this.m_sNom = m_sNom;
        this.m_sPrenom = m_sPrenom;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
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
    public String toString() {
        return "Enseignant :" +
                "id :=" + m_id +
                ", dans le nom est : '" + m_sNom + '\'' +
                ", et prenom : '" + m_sPrenom + '\'' ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Enseignant that)) return false;
        return m_id == that.m_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(m_id, m_sNom, m_sPrenom);
    }

    @Override
    public int compareTo(Enseignant o) {
        return -(o.getM_id()-this.m_id) ;
    }
}
