public class Boisson implements Frais {
    public double litre;
    public boolean gazeux;
    public String nom;
    public double poids;
    public double calories;
    public double prix;

    public Boisson(String nom, boolean gazeux, double litre,double calories,Frigo f1, double prix){
        this.litre=litre;
        this.poids=litre;
        this.nom=nom;
        this.calories=calories;
        this.prix = prix;
    }

    public void unVerre(double litre){
        this.litre=-litre;
    }

    public double getPoids(){
        return this.poids;
    }

    public void setLitre(double litre){
        this.litre += litre;
        this.poids += litre;
    }

    public double getPrix(){
        return prix;
    }

    public double getCalories(){
        return calories;
    }

    public String getNom(){
        return nom;
    }
}