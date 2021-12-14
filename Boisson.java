public class Boisson implements Frais {
    private double litre;
    private boolean gazeux;
    private String nom;
    private double poids;
    private double calories;
    private double prix;

    public Boisson(String nom, boolean gazeux, double litre,double calories, double prix){
        this.litre=litre;
        this.poids=litre;
        this.nom=nom;
        this.calories=calories;
        this.prix = prix;
    }

    public void unVerre(double litre){ //Boit un verre de X litre et retire X litre à la quantié de Boisson
        this.litre-=litre;
        System.out.println("Un verre de "+litre+" de "+this.nom+" est bu");
    }

    public double getPoids(){
        return this.poids;
    }

    public void setLitre(double litre){     //pour rajouter X litres, on rajoute X litres et X kilo (1kg=1L)
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
    public double getCallo(){
        return this.calories;
    }
    public String toString(){
        return this.litre+" L de "+this.nom+" avec "+this.calories+" calories par Litre";
    }
    public void setQuantites(double quantites){
        //Défini les quantités en plus
        this.poids+=quantites;
        this.litre += quantites;
    }
}