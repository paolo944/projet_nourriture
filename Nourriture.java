public abstract class Nourriture{
        private double poids;
        private String nom;
        private int quantites;
        private double calories;
        private double prix;
    
    protected Nourriture(double poids, String nom, int quantites, double calories, double prix){
        this.poids = poids;
        this.nom = nom;
        this.quantites = quantites;
        this.calories = calories;
        this.prix = prix;
        }
    public String getNom(){
        return this.nom;
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

    public double getPrix(){
        return prix;
    }

    public void setQuantites(int quantites){
        this.quantites += quantites;
    }

    public String getNom(){
        return Nom;
    }
}
