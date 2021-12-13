public class Boeuf extends Viande{
    public String Morceau;
    public Boeuf(double poids, String nom, int quantites,double callories, double prix){
        super(poids,nom,quantites,callories,prix);
        this.Morceau=Morceau;
    }
    public String toString(){
        String S=this.getCallo()+" callories pour "+this.getPoids()+" kg de "+this.Morceau+"de Boeuf";
        return S;
    }
}