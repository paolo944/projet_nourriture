public class Porc extends Viande{
    public String Morceau; //Nom du morceau
    public Porc(double poids, String nom, int quantites,double callories, double prix){
        super(poids,nom,quantites,callories,prix);
        this.Morceau=Morceau;
    }
    public String toString(){
        String S=this.getPoids()+" kg de "+this.Morceau+"de Porc avec "+this.getCallo()+" calories par Kilo";
        return S;
    }
}
