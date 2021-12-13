public class Boisson implements Frais {
    public double litre;
    public boolean gazeux;
    public String nom;
    public double poids;
    public double calories;
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
    public String toString(){
        String S=this.litre+" L de "+this.nom+" avec "+this.calories+" calories par Litre";
        return S;
    }
}