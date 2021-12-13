public class Menu {
    public String nomMenue;
    public Nourriture [] nourrituresTab;
    public Boisson [] boissonTab;
    public double caloMenue;
    public boolean pasEncoreMange;
    public Menu(String nomMenue){
        this.caloMenue=0;
        this.nomMenue=nomMenue;
        this.pasEncoreMange=false;
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
        System.out.println("Ce menu vaut "+this.caloMenue+" callories.");
    }
    public void manger(){
        if (this.pasEncoreMange=false){
            System.out.println("Le menu "+this.nomMenue+" est mangé.");
            this.pasEncoreMange=true;
        }
        else{
            System.out.println("Le menu "+this.nomMenue+"a deja été manger !");
        }
    }
    
}