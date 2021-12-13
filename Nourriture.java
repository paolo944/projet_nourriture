public abstract class Nourriture{
        private double poids;
        private String nom;
        private int quantites;
        private double calories;
        private double prix;
    
    public Nourriture(double poids, String nom, int quantites, double calories, double prix){
        this.poids = poids;
        this.nom = nom;
        this.quantites = quantites;
        this.calories = calories;
        this.prix = prix;
        }
    public double getPoids(){
        return poids;
    }
    public double getCallo(){
        return calories;
    }

    public String toString(){
        return nom+", poids: "+poids+" kg"+" quantités: "+quantites;
    }
}
