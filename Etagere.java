import java.util.ArrayList

public class Etagere {
    private static ArrayList<Etagere> etagere = new ArrayList<Etagere>();
    private static double poidsMax;

    public Etagere(double poidsMax){
        this.poidsMax = poidsMax;
    }

    public ArrayList<Etagere> getEtagere(){
        return etagere;
    }

    private double getPoids(){
        double poids = 0;
        for(int i=0; i<etagere.size(); i++){
            poids += etagere.get(i).getPoids();
        }
        return poids;
    }

    public boolean ajouterElem(Sec elem){
        if(elem.getPoids()+getPoids() <= poidsMax) {
            etagere.add(elem);
            return true;
        }
        return false;
    }

    public boolean ajouterListe(Sec[] elems){
        double poidsTotal = 0;
        for(Sec elem: elems){
            poidsTotal += elem.getPoids();
        }
        if(poidsTotal <= poidsMax){
            for(Sec elem: elems){
                ajouterElem(elem);
            }
            return true;
        }
        return false;
    }
}