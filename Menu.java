public class Menu {
    public Nourriture [] nourrituresTab;
    public double caloMenue;
    public Menu(Nourriture n1){
        this.caloMenue=0;
        this.nourrituresTab=new Nourriture[1];
        this.nourrituresTab[0]=n1;
    }
    public String toString() {
        String s="";
        for (int i=0;i<=this.nourrituresTab.length;i++){
            s=s+this.nourrituresTab[i].toString();
        }
        return s;
    }
    public void manger(){
        System.out.println("Le menu"+this.toString()+"est mangé");
    }
    
}
