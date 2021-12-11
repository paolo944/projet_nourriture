public abstract class Nourriture{
    private double poids;
    private String nom;
    private int quantites;
<<<<<<< HEAD
=======
    private double prix;
>>>>>>> 2f72c89cb28c65a665578fe5e9ad76d3eb36e07d

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