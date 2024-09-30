package collection;
/**
 * classe identité d'un étudiant.
 */
public class Identite {
/**
 * attribut de la classe.
 */
    private String nom;
    private String prenom;
    private int NIP;
    /**
     * constructeur.
     */
    public Identite(String nom, String prenom, int NIP) {
        this.nom = nom;
        this.prenom = prenom;
        this.NIP = NIP;
    }
    /**
     * getter nom.
     */
    public String getNom() {
        return nom;
    }
    /**
     * getter prenom.
     */
    public String getPrenom() {
        return prenom;
    }
    /**
     * getter NIP.
     */
    public int getNIP() {
        return NIP;
    }
}
