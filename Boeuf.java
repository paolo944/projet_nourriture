public class Boeuf extends Viande{
    public String Morceau;
    public Boeuf(double poids, String nom, int quantites,double callories, double prix){
        super(poids,nom,quantites,callories,prix);
        this.Morceau=Morceau;
    }
    public String toString(){
        String S=this.getPoids()+" kg de "+this.Morceau+"de Boeuf avec "+this.getCallo()+" calories par Kilo";
        return S;
    }
}