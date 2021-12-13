import java.util.ArrayList; 
class Cuisine{
    public static final Cuisine Cuisine1 = new Cuisine();

    public static ArrayList<Frigo> frigoList = new ArrayList<Frigo>();

    public static ArrayList<Etagere> etagereList = new ArrayList<Etagere>();
    
    private Cuisine(){}
   
    public static void  ajouterFrigo(Frigo frigo){
        frigoList.add(frigo);
    }
    
    public static void  ajouterEtagere(Etagere etageR){
        etagereList.add(etageR);
    }
}