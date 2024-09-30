import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Classe de test de la classe Etudiant.
 */
public class TestEtu {
    /**
     * Test du constructeur.
     */
    @Test
    public void testConstructeur() {
        Formation formation = new Formation("formation", new HashMap<Matiere, Double>());
        Etudiant etudiant = new Etudiant("nom", "prenom", 123, formation);
        assertEquals("nom", etudiant.getIdentite().getNom());
        assertEquals("prenom", etudiant.getIdentite().getPrenom());
        assertEquals(123, etudiant.getIdentite().getNIP());
        assertEquals(formation, etudiant.getFormation());
    }

    /**
     * Test de la méthode ajouterNote.
     */
    @Test
    public void testAjouterNote() {
        Formation formation = new Formation("formation", new HashMap<Matiere, Double>());
        Etudiant etudiant = new Etudiant("nom", "prenom", 123, formation);
        Matiere matiere = new Matiere("matiere");
        etudiant.ajouterNote(matiere, 10.0);
        assertEquals(1, etudiant.getNotes(matiere).size());
        assertEquals(10.0, etudiant.getNotes(matiere).get(0), 0.0);
    }

    /**
     * Test de la méthode calculerMoyenneMatiere.
     */
    @Test
    public void testCalculerMoyenneMatiere() {
        Formation formation = new Formation("formation", new HashMap<Matiere, Double>());
        Etudiant etudiant = new Etudiant("nom", "prenom", 123, formation);
        Matiere matiere = new Matiere("matiere");
        etudiant.ajouterNote(matiere, 10.0);
        etudiant.ajouterNote(matiere, 15.0);
        assertEquals(12.5, etudiant.calculerMoyenneMatiere(matiere), 0.0);
    }

    /**
     * Test de la méthode calculerMoyenneFormation.
     */
    @Test
    public void testCalculerMoyenneGeneral() {
        Formation formation = new Formation("formation", new HashMap<Matiere, Double>());
        Etudiant etudiant = new Etudiant("nom", "prenom", 123, formation);
        Matiere matiere1 = new Matiere("matiere1");
        Matiere matiere2 = new Matiere("matiere2");
        etudiant.ajouterNote(matiere1, 10.0);
        etudiant.ajouterNote(matiere1, 15.0);
        etudiant.ajouterNote(matiere2, 12.0);
        etudiant.ajouterNote(matiere2, 18.0);
        assertEquals(14.25, etudiant.calculerMoyenneGenerale(), 0.0);
    }
}