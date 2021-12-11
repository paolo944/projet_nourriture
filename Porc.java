public class Porc extends Viande{
    public String Morceau;
    public Porc(double poids, String nom, int quantites , String Morceau){
        super(poids,nom,quantites);
        this.Morceau=Morceau;
    }
}
