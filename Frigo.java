import java.util.ArrayList;

public class Frigo {
    private ArrayList<Frais> frigo = new ArrayList<Frais>();
    private double poidsMax; //poids maximum que le frigo peut acceuillir
    private static int compteur = 0; //Nombre de frigo instanciés
    private int id;
    public Frigo(double poidsMax){
        //définir le poids maximal que le frigo peut acceuillir
        this.poidsMax = poidsMax;
        compteur++;
    }

    public double getPoids(){
        //avoir le poids pour les ajouts
        double poids = 0;
        for(int i=0; i<frigo.size(); i++){
            poids += frigo.get(i).getPoids();
        }
        return poids;
    }

    public boolean ajouterElem(Frais elem){
        //ajouter un seul élément
        if(elem.getPoids()+getPoids() <= poidsMax) {
            frigo.add(elem);
            return true;
        }
        return false;
    }

    public boolean ajouterListe(Frais[] elems){
        //ajouter une liste d'élément
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

    public boolean ajouterListe(ArrayList<Frais> elems){
        //ajouter un liste d'élément
        double poidsTotal = 0;
        for(int i=0; i<elems.size(); i++){
            poidsTotal += elems.get(i).getPoids();
        }
        if(poidsTotal <= poidsMax){
            for(int i=0; i<elems.size(); i++){
                ajouterElem(elems.get(i));
            }
            return true;
        }
        return false;
    }

    public static int getNombreFirgo(){
        //Retourne le nombre de frigo
        return compteur;
    }

    public Frigo clone(){
        //Retourne un clone du frigo
        Frigo frigoNouveau = new Frigo(this.poidsMax);
        frigoNouveau.ajouterListe(frigo);
        return frigoNouveau;
    }

    public String toString(){
        String S="Frigo "+this.id+" "+"qui contient ";
        for(int i=0; i<this.frigo.size(); i++){
           S=S+(frigo.get(i)).toString();
        }
        return S;
    }

    public void afficher(){
        System.out.println(this.toString());
    }
}