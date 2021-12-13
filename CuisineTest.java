public class CuisineTest {

    public static void main(String[] args) {
        Frigo frigo1 = new Frigo(200);
        Etagere EtagR1= new Etagere(300);
        Agneau cotellettAgneau = new Agneau(500,"cotelette",600,700,800);
        frigo1.ajouterElem(cotellettAgneau);
        frigo1.afficher();
      
        // Cuisine1.ajouterFrigo(frigo1);
       // Cuisine1.ajouterEtagere(EtagR1);

    }
}
