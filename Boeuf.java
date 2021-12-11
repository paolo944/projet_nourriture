public class Boeuf extends Viande{
    public String Morceau;
    public Boeuf(double poids, String nom, int quantites , String Morceau){
        super(poids,nom,quantites);
        this.Morceau=Morceau;
    }
}
