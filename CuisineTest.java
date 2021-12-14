public class CuisineTest {
    public static void main(String[] args){
        Frigo frigo1 = new Frigo(2000);
        Etagere EtagR1= new Etagere(4000);
        Boisson coca = new Boisson("Coca", true, 200, 50,50);
        Agneau cotellettAgneau = new Agneau(500,"cotelette",600,700,30);
        frigo1.ajouterElem(cotellettAgneau);
        frigo1.afficher();
        frigo1.ajouterElem(coca);
        frigo1.afficher();
        Gateaux cookies = new Gateaux(500,"cookies",600,700,800);
        EtagR1.ajouterElem(cookies);
        EtagR1.afficher();
        Cuisine cuisine = Cuisine.getCuisine();
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

        System.out.println("\n");
        System.out.println(cotellettAgneau.toString());
        Magasin Carrefour = new Magasin("Carrefour",1);
        cotellettAgneau.setQuantites(Carrefour.course(cotellettAgneau, 25));
        System.out.println(cotellettAgneau.toString());
        System.out.println(coca.toString());
        coca.setQuantites(Carrefour.course(coca,15));
        System.out.println(coca.toString());
        coca.unVerre(15);
        System.out.println(coca.toString());


    }
}