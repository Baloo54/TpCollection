package collection;
import java.util.Map;
import java.util.Set;
/**
 * classe formation.
 */
public class Formation {
    /**
     * attribut de la formation.
     */
    private String identifiant;
    private Map<Matiere,Double> matieres;
    /**
     * constructeur.
     */
    public Formation(String identifiant, Map<Matiere, Double> matieres) {
        this.identifiant = identifiant;
        this.matieres = matieres;
    }
    /**
     * getter identifiant.
     */
    public String getIdentifiant() {
        return identifiant;
    }
    /**
     * getter matieres.
     */
    public Double GetCoefficient(Matiere matiere) {
        if (!matieres.containsKey(matiere)) {
            return 0.0;
        } else {
        return matieres.get(matiere);
        }
    }
    /**
     * ajouterMatiere
     * @param matiere
     * @param coefficient double
     * si matiere existe déjà dans la map, renvoie une exception
     * si coefficient est en dehors de l'intervalle [0, 1], renvoie une exception
     */
    public void AddMatiere(Matiere matiere, Double coefficient) {
        matieres.put(matiere, coefficient);
    }
    /**
     * supprimerMatiere
     * @param matiere
     * si matiere n'existe pas dans la map, renvoie une exception
     */
    public void RemoveMatiere(Matiere matiere) {
        matieres.remove(matiere);
    }
    /**
     * listerMatieres
     * @return la liste des matières de la formation
     */
    public Set<Matiere> ListMatieres() {
        return matieres.keySet();
    }

}
