public class Menu {
    public String nomMenue;
    public Nourriture [] nourrituresTab;
    public Boisson [] boissonTab;
    public double caloMenue;
    public boolean pasEncoreMange;
    public Menu(String nomMenue){
        this.caloMenue=0;
        this.nomMenue=nomMenue;
        this.pasEncoreMange=true;
    }
    public void ajouterMenu(Nourriture[] nourri,Boisson[] boisso){
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
        for(int i=0;i<nourrituresTab.length;i++){
            this.caloMenue+=(this.nourrituresTab[i].getCallo())*(this.nourrituresTab[i].getPoids());
        }
        for(int i=0;i<boissonTab.length;i++){
            this.caloMenue+=(this.boissonTab[i].getCallo())*(this.boissonTab[i].getPoids());
        }
        System.out.println("Ce menu vaut "+this.caloMenue+" callories.");
    }
    public void manger(){
        if(this.pasEncoreMange){
            this.pasEncoreMange=false
            ;System.out.println("Le menu "+this.nomMenue+" est mangé.");
        }
        else {
            System.out.println("Le menu "+this.nomMenue+" a deja été manger !");
        }
    }    
}