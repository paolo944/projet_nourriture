public class Porc extends Viande{
    public String Morceau;
    public Porc(double poids, String nom, int quantites,double callories, double prix){
        super(poids,nom,quantites,callories,prix);
        this.Morceau=Morceau;
    }
    public String toString(){
        String S=this.getCallo()+" callories pour "+this.getPoids()+" kg de "+this.Morceau+"de Porc";
        return S;
    }
}
