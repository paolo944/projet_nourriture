public class Magasin{
    private String nom; //Nom de l'enseigne
    private double differencePrix; //Diffèrence de prix de l'enseigne

    public Magasin(String nom, double differencePrix){
        this.nom = nom;
        this.differencePrix = differencePrix;
    }

    public double course(Nourriture nourriture, int quantite){
        System.out.println("Vous avez achetez "+quantite+" de "+nourriture.getNom()+" pour "+quantite*nourriture.getPrix()*this.differencePrix+" euros");
        return quantite;
    }

    public double course(Boisson boisson, double litre){
        //Fais les courses et achète quantité de boisson
        System.out.println("Vous avez achetez "+litre+" litre de "+boisson.getNom()+" pour "+litre*boisson.getPrix()*differencePrix+" euros");
        return litre;
    }

    public int coursePrix(Nourriture nourriture, double prix){
        int quantite = (int) (prix%nourriture.getPrix());
        System.out.println("Vous avez achete "+quantite+"de "+nourriture.getNom());
        return quantite;
    }

    public double coursePrix(Boisson boisson, double prix){
        //Fais les courses et achète pour prix de boisson
        double litre = prix/boisson.getPrix();
        boisson.setLitre(litre);
        System.out.println("Vous avez achete "+litre+"litre de "+boisson.getNom());
        return litre;
    }
}