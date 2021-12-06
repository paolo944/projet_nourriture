import java.util.ArrayList;

public class Frigo {
    private static ArrayList<Frigo> frigo = new ArrayList<Frigo>();
    private static double poidsMax;

    public Frigo(double poidsMax){
        this.poidsMax = poidsMax;
    }

    public ArrayList<Frigo> getFrigo(){
        return frigo;
    }

    private double getPoids(){
        double poids = 0;
        for(int i=0; i<frigo.size(); i++){
            poids += frigo.get(i).getPoids();
        }
        return poids;
    }

    public boolean ajouterElem(Frais elem){
        if(elem.getPoids()+getPoids() <= poidsMax) {
            frigo.add(elem);
            return true;
        }
        return false;
    }

    public boolean ajouterListe(Frais[] elems){
        double poidsTotal = 0;
        for(Frais elem: elems){
            poidsTotal += elem.getPoids();
        }
        if(poidsTotal <= poidsMax){
            for(Frais elem: elems){
                ajouterElem(elem);
            }
            return true;
        }
        return false;
    }
}