public class Gateaux  extends Nourriture implements Sec {
    public Gateaux(double poids, String nom, int quantites,double callories, double prix){
        super(poids,nom,quantites,callories,prix);
    }
    public String toString(){
        String S=this.getPoids()+" kg de "+this.getNom()+" avec "+this.getCallo()+" calories par Kilo";
        return S;
    }
}