package collection;


public class Main {
    public static void main(String[] args) {
        Formation formation = new Formation("1");
        formation.AddMatiere(new Matiere("1"), 0.5);
        formation.AddMatiere(new Matiere("2"), 0.3);
        formation.AddMatiere(new Matiere("3"), 0.2);
    }
}