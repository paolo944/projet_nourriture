import java.util.ArrayList; 
class Cuisine{
    private static final Cuisine Cuisine1 = new Cuisine();

    private static ArrayList<Frigo> frigoList = new ArrayList<Frigo>();

    private static ArrayList<Etagere> etagereList = new ArrayList<Etagere>();
    
    private Cuisine(){}
    public static Cuisine getCuisine(){
        return Cuisine1;
    }
    public static void  ajouterFrigo(Frigo frigo){
        frigoList.add(frigo);
    }
    
    public static void  ajouterEtagere(Etagere etageR){
        etagereList.add(etageR);
    }
    public String toString(){
        String S="Cuisine composé de \n";
        for(int i=0; i<frigoList.size(); i++){
           S+=(frigoList.get(i)).toString()+"\n";
        }
        for(int i=0; i<etagereList.size(); i++){
            S+=(etagereList.get(i)).toString()+"\n";
         }
        return S;
    }
}