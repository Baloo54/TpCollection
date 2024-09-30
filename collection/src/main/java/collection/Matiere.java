package collection;
/**
 * classe matière.
 */
public class Matiere {
    /**
     * attribut nom.
     */
    private String nom;
    /**
     * constructeur.
     */
    public Matiere(String nom) {
        this.nom = nom;
    }
    /**
     * getter nom.
     */
    public String getNom() {
        return nom;
    }   
    /**
     * equals.
     */
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Matiere) {
            Matiere mat = (Matiere) obj;
            result = this.nom.equals(mat.getNom());
        }
        return result;
    }
    /**
     * hashcode.
     */
    public int hashCode() {
        return nom.hashCode();
    }    
}
