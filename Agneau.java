public class Agneau extends Viande{
    public String Morceau;
    public Agneau(double poids, String nom, int quantites,double callories, double prix){
        super(poids,nom,quantites,callories,prix);
        this.Morceau=nom;
    }
    public String toString(){
        String S=this.getCallo()+" callories pour "+this.getPoids()+" kg de "+this.Morceau+"d'Agneau";
        return S;
    }
}
