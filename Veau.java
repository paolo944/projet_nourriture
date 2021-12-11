public class Veau extends Viande{
    public String Morceau;
    public Veau(double poids, String nom, int quantites , String Morceau){
        super(poids,nom,quantites);
        this.Morceau=Morceau;
    }
}
