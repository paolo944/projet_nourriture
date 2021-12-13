public class CuisineTest {

    public static void main(String[] args) {
        Frigo frigo1 = new Frigo(1000);
        Etagere EtagR1= new Etagere(3000);
        Agneau cotellettAgneau = new Agneau(500,"cotelette",600,700,800);
        frigo1.ajouterElem(cotellettAgneau);
        
        Cuisine cuisine=Cuisine.getCuisine();
        cuisine.ajouterFrigo(frigo1);
        cuisine.ajouterEtagere(EtagR1);
        Boisson coca = new Boisson("Coca", true, 200, 50);
        frigo1.ajouterElem(coca);
        frigo1.afficher();
        Gateaux cookies = new Gateaux(500,"cookies",600,700,800);
        EtagR1.ajouterElem(cookies);
        EtagR1.afficher();
        cuisine.afficher();
        Nourriture[] nourri = new Nourriture[2];
        nourri[0]=cotellettAgneau;
        nourri[1]=cookies;
        Boisson[] boiss = new Boisson[1];
        boiss[0]=coca;
        Menu repasPasEquilibr= new Menu("menu1");
        repasPasEquilibr.ajouterMenu(nourri,boiss);
        repasPasEquilibr.callorie();
        repasPasEquilibr.manger();
        repasPasEquilibr.manger();
    }
}
