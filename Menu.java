public class Menu {
    public String nomMenue; //Nom du menu
    public Nourriture [] nourrituresTab; //Liste de nourriture
    public Boisson [] boissonTab; //Liste de boisson
    public double caloMenue; //Nombre de calories
    public boolean pasEncoreMange; //Boolean si le menu est mangé

    public Menu(String nomMenue){
        this.caloMenue=0;
        this.nomMenue=nomMenue;
        this.pasEncoreMange=true;
    }

    public void ajouterMenu(Nourriture[] nourri,Boisson[] boisso){
        //Ajoute dans le menu des nourriture et des boissons.
        this.nourrituresTab=nourri;
        this.boissonTab=boisso;
    }

    public String toString() {
        String s="";
        for (int i=0;i<=this.nourrituresTab.length;i++){
            s=s+this.nourrituresTab[i].toString();
        }
        return s;
    }

    public void callorie(){
        //Calcul le nombre de calories
        for(int i=0;i<nourrituresTab.length;i++){
            this.caloMenue+=(this.nourrituresTab[i].getCallo())*(this.nourrituresTab[i].getPoids());
        }
        for(int i=0;i<boissonTab.length;i++){
            this.caloMenue+=(this.boissonTab[i].getCallo())*(this.boissonTab[i].getPoids());
        }
        System.out.println("Ce menu vaut "+this.caloMenue+" callories.");
    }
    public void manger(){
        //Manger le menu
        if(this.pasEncoreMange){
            this.pasEncoreMange=false
            ;System.out.println("Le menu "+this.nomMenue+" est mangé.");
        }
        else {
            System.out.println("Le menu "+this.nomMenue+" a deja été manger !");
        }
    }    
}