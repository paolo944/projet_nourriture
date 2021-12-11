import java.util.ArrayList;

public class Frigo {
    private static ArrayList<Frais> frigo = new ArrayList<Frais>();
    private static double poidsMax;

    public Frigo(double poidsMax){
        //définir le poids maximal que le frigo peut acceuillir
        this.poidsMax = poidsMax;
    }

    public ArrayList<Frais> getFrigo(){
        //récupérer la référence du frigo et le manipuler dans le client
        return frigo;
    }

    private double getPoids(){
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
        //ajouter un liste d'élément
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
    public Frigo clone(){
        //Retourne un clone du frigo
        Frigo frigoNouveau = new Frigo(poidsMax);
        frigoNouveau.ajouterListe(frigo);
        return frigoNouveau;
    }

    public void afficher(){
        System.out.println(this.toString());
    }
}