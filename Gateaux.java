public class Gateaux  extends Nourriture implements Sec {
    protected Gateaux(double poids, String nom, int quantites,double callories, double prix){
        super(poids,nom,quantites,callories,prix);
    }
    public String toString(){
        String S=this.getCallo()+" callories par kilos pour "+this.getPoids()+" kg de "+this.getNom();
        return S;
    }
}
