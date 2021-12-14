import java.util.ArrayList;

public class Etagere {
    private ArrayList<Sec> etagere = new ArrayList<Sec>(); //Liste des éléments contenu dans étagère
    private double poidsMax; //Poids max de l'étagère
    private static int compteur = 0;  //Compteur du nombre d'étagère
    public int id; //Identifiant de l'étagère

    public Etagere(double poidsMax){
        //définir le poids maximal que l'étagère peut acceuillir
        this.poidsMax = poidsMax;
        this.compteur+=1;
        this.id=compteur;
    }

    public ArrayList<Sec> getEtagere(){
        //récupérer la référence du frigo et le manipuler dans le client
        return etagere;
    }

    private double getPoids(){
        //avoir le poids pour les ajouts
        double poids = 0;
        for(int i=0; i<etagere.size(); i++){
            poids += etagere.get(i).getPoids();
        }
        return poids;
    }

    public boolean ajouterElem(Sec elem){
        //ajouter un seul élément
        if(elem.getPoids()+getPoids() <= poidsMax) { //Regarde si le poids de l'élément + poids actuel est supérieur au poids max
            etagere.add( elem);
            return true;
        }
        return false;
    }

    public boolean ajouterListe(Sec[] elems) throws PoidsException{
        //ajouter un liste d'élément
        double poidsTotal = 0;
        for(Sec elem: elems){
            poidsTotal += elem.getPoids();
        }
        if(poidsTotal > poidsMax){//Regarde si le poids de l'élément + poids actuel est supérieur au poids max
            throw new PoidsException("Le poids est trop élevé");
        }
        else{
            for(Sec elem: elems){
                ajouterElem(elem);
            }
            return true;
        }
    }

    public boolean ajouterListe(ArrayList<Sec> elems) throws PoidsException{
        //ajouter un Arrayliste d'élément
        double poidsTotal = 0;
        for(int i=0; i<elems.size(); i++){
            poidsTotal += elems.get(i).getPoids();
        }
        if(poidsTotal > poidsMax){//Regarde si le poids de l'élément + poids actuel est supérieur au poids max
            throw new PoidsException("Le poids est trop élevé");
        }
        else{
            for(int i=0; i<elems.size(); i++){
                ajouterElem(elems.get(i));
            }
            return true;
        }
    }

    public String toString(){
        String S="Etagere "+this.id+" "+"qui contient \n"; 
        for(Sec elem: etagere){
            S += elem.toString()+"\n";
        }
        return S;
    }

    public Etagere clone(){
        //Retourne un clone du frigo
        Etagere etagereNouveau = new Etagere(this.poidsMax);
        try {
            etagereNouveau.ajouterListe(etagere);
        } catch (PoidsException e){}
        return etagereNouveau;
    }

    public void afficher(){
        //Affiche toString()
        System.out.print(this.toString());
    }
    
}