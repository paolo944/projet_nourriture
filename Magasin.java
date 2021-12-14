public class Magasin{
    private String nom; //Nom de l'enseigne
    private double differencePrix; //Diffèrence de prix de l'enseigne

    public Magasin(String nom, double differencePrix){
        this.nom = nom;
        this.differencePrix = differencePrix;
    }

    public double course(Nourriture nourriture, int quantite){  //course de Nourriture avec la quantité
        System.out.println("Vous avez achetez "+quantite+" de "+nourriture.getNom()+" pour "+quantite*nourriture.getPrix()*this.differencePrix+" euros");
        return quantite;
    }

    public double course(Boisson boisson, double litre){    //course de Boisson avec la quantité
        //Fais les courses et achète quantité de boisson
        System.out.println("Vous avez achetez "+litre+" litre de "+boisson.getNom()+" pour "+litre*boisson.getPrix()*differencePrix+" euros");
        return litre;
    }

    public int coursePrix(Nourriture nourriture, double argent){  //course de Nourriture avec le prix
        int quantite = (int) (argent%nourriture.getPrix());
        System.out.println("Vous avez achete "+quantite+"de "+nourriture.getNom());
        return quantite;
    }

    public double coursePrix(Boisson boisson, double argent){     //course de Boisson avec le prix
        //Fais les courses et achète pour prix de boisson
        double litre = argent/boisson.getPrix();
        boisson.setLitre(litre);
        System.out.println("Vous avez achete "+litre+"litre de "+boisson.getNom());
        return litre;
    }
}