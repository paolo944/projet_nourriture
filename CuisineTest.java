public class CuisineTest {

    public static void main(String[] args) {
        Frigo frigo1 = new Frigo(1000);
        Etagere EtagR1= new Etagere(300);
        Agneau cotellettAgneau = new Agneau(500,"cotelette",600,700,800);
        System.out.println(frigo1.ajouterElem(cotellettAgneau));
        
        Cuisine cuisine=Cuisine.getCuisine();
        cuisine.ajouterFrigo(frigo1);
        cuisine.ajouterEtagere(EtagR1);
        Boisson coca = new Boisson("Coca", true, 200, 50);
        frigo.ajouterElem(coca);
        frigo1.afficher();
    }
}
