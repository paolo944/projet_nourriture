public abstract class Viande extends Nourriture implements Frais {
    protected Viande(double poids, String nom, int quantites,double callories, double prix){
        super(poids,nom,quantites,callories,prix);
    }
}
