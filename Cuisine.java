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
}