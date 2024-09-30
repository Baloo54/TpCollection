package collection;
/**
 * classe étudiant.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Etudiant {
    /**
     * attribut de l'étudiant.
     */
    private Identite identite;
    private Map<Matiere, ArrayList<Double>> notes;
    private Formation formation;
    /**
     * constructeur.
     */
    public Etudiant(String nom, String prenom, int NIP, Formation formation) {
        this.identite = new Identite(nom, prenom, NIP);
        notes = new HashMap<Matiere, ArrayList<Double>>();
        this.formation = formation;
        for (Matiere matiere : formation.ListMatieres()) {
            notes.put(matiere, new ArrayList<Double>());
        }
    }
    /**
     * getter identite.
     */
    public Identite getIdentite() {
        return identite;
    }
    /**
     * getter notes.
     */
    public ArrayList<Double> getNotes(Matiere matiere) {
        return notes.get(matiere);
    }
    /**
     * ajouterNote
     * @param matiere
     * @param note double
     * si matiere n'existe pas dans la map, renvoie une exception
     * si note est en dehors de l'intervalle [0, 20], renvoie une exception
     */
    public void ajouterNote (Matiere matiere, double note) throws IllegalArgumentException {
        if (!notes.containsKey(matiere)) {
            throw new IllegalArgumentException("La matière n'existe pas dans la map");
        }
        if (note < 0 || note > 20) {
            throw new IllegalArgumentException("La note doit être comprise entre 0 et 20");
        }
        notes.get(matiere).add(note);
    }
    /**
     * calculerMoyenneMatiere : double
     * @param matiere
     * @return la moyenne de l'étudiant pour la matière
     * si matiere n'existe pas dans la map, renvoie une exception
     */
    public double calculerMoyenneMatiere(Matiere matiere) throws IllegalArgumentException {
        if (!notes.containsKey(matiere)) {
            throw new IllegalArgumentException("La matière n'existe pas dans la map");
        }
        double somme = 0;
        for (double note : notes.get(matiere)) {
            somme += note;
        }
        return somme / notes.get(matiere).size();
    }
    /**
     * calculerMoyenneGenerale : double
     * @return la moyenne générale de l'étudiant
     */
    public double calculerMoyenneGenerale() {
        double somme = 0;
        int nbNotes = formation.ListMatieres().size();
        for (Matiere matiere : formation.ListMatieres()) {
            double coeff = formation.GetCoefficient(matiere);
            somme += coeff * calculerMoyenneMatiere(matiere);
        }
        return somme / nbNotes;
    }
}
