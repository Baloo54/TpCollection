package collection;

import java.util.Map;

public class Formation {
    private String identifiant;
    private Map<Matiere,Double> matieres;

    public Formation(String identifiant, Map<Matiere, Double> matieres) {
        this.identifiant = identifiant;
        this.matieres = matieres;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public Double GetCoefficient(Matiere matiere) {
        if (!matieres.containsKey(matiere)) {
            return 0.0;
        } else {
        return matieres.get(matiere);
    }
}

    public void AddMatiere(Matiere matiere, Double coefficient) {
        matieres.put(matiere, coefficient);
    }

    public void RemoveMatiere(Matiere matiere) {
        matieres.remove(matiere);
    }
    
}
