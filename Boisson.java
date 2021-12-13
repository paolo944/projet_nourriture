public class Boisson implements Frais {
    private double litre;
    private boolean gazeux;
    private String nom;
    private double poids;
    private double calories;
    public Boisson(String nom, boolean gazeux, double litre,double calories){
        this.litre=litre;
        this.poids=litre;
        this.nom=nom;
        this.calories=calories;
    }
    public void unVerre(double litre){
        this.litre=-litre;
    }
    public double getPoids(){
        return this.poids;
    }
    public double getCallo(){
        return this.poids;
    }
    public String toString(){
        return this.litre+" L de "+this.nom+" avec "+this.calories+" calories par Litre";
    }

}