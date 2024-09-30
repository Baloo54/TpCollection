package collection;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class FormationTest {
    @Test
    void testAddMatiere() {
        Formation formation = new Formation("1");
        formation.AddMatiere(new Matiere("1"), 0.5);
        formation.AddMatiere(new Matiere("2"), 0.3);
        formation.AddMatiere(new Matiere("3"), 0.2);
    }
    void testAddMatiereCoefficientException() {
        Formation formation = new Formation("1");
        assertThrows(IllegalArgumentException.class, () -> {
            formation.AddMatiere(new Matiere("1"), -1.00);
        });
    }
    void testAddMatiereMatiereExistException() {
        Formation formation = new Formation("1");
        formation.AddMatiere(new Matiere("1"), 0.5);
        assertThrows(IllegalArgumentException.class, () -> {
            formation.AddMatiere(new Matiere("2"), 0.5);
        });
    }
    @Test
    void testRemoveMatiere() {
        Formation formation = new Formation("1");
        formation.AddMatiere(new Matiere("1"), 0.5);
        formation.AddMatiere(new Matiere("2"), 0.3);
        formation.AddMatiere(new Matiere("3"), 0.2);
        formation.RemoveMatiere(new Matiere("1"));
        formation.RemoveMatiere(new Matiere("2"));
    }
    void testRemoveMatiereMatiereNotExistException() {
        Formation formation = new Formation("1");
        assertThrows(IllegalArgumentException.class, () -> {
            formation.RemoveMatiere(new Matiere("1"));
        });
    }
}
