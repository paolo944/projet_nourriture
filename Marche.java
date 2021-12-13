public class Magasin{
    private String nom; //Nom de l'enseigne
    private double differencePrix; //Diffèrence de prix de l'enseigne
    private double prixTotal = 0;
    private ArrayList<>

    public Magasin(String nom, double differencePrix){
        this.nom = nom;
        this.differencePrix = differencePrix;
    }

    public double course(Nourriture nourrtiure, int quantite){
        nourriture.setQuantites(quantite);
        System.out.println("Vous avez achetez "+quantite" de "+nourriture.getNom()+" pour "+litre*nourriture.getPrix()*diffrencedePrix+" euros");
        return quantite*nourriture.getPrix()*differencePrix;
    }

    public double course(Boisson boisson, double litre){
        boisson.setLitre(litre);
        System.out.println("Vous avez achetez "+litre" litre de "+boisson.getNom()+" pour "+litre*boisson.getPrix()*differencePrix+" euros");
        return litre*boisson.getPrix()*differencePrix;
    }

    public int coursePrix(Nourriture nourriture, double prix){
        int quantite = int(prix%nourriture.getPrix());
        nourriture.setQuantites(quantite);
        System.out.println("Vous avez achete "+quantite+"de "+nourriture.getNom());
        return quantite;
    }

    public double coursePrix(Boisson boisson, double prix){
        double litre = prix/boisson.getPrix();
        boisson.setLitre(litre);
        System.out.println("Vous avez achete "+litre+"litre de "+boisson.getNom());
        return litre;
    }
}