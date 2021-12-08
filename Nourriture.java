public abstract class Nourriture{
    private double poids;
    private String nom;
    private int quantites;
    private double prix

    public Nourriture(double poids, String nom, int quantites){
        this.poids = poids;
        this.nom = nom;
        this.quantites = quantites;
    }

    public double getPoids(){
        return poids;
    }

    public String toString(){
        return nom+", poids: "+poids+"kg"+" quantités: "+quantites;
    }
}