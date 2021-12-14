public abstract class Nourriture{
        private double poids; //Poids de la nourriture
        private String nom; //Nom de la nourriture
        private int quantites; //Quantites de la nourriture
        private double calories; //Calories par kg de la nourriture
        private double prix; //Prix par unités
    
    protected Nourriture(double poids, String nom, int quantites, double calories, double prix){
        this.poids = poids;
        this.nom = nom;
        this.quantites = quantites;
        this.calories = calories;
        this.prix = prix;
        }
    public String getNom(){
        //Retourne le nom de la nourriture
        return this.nom;
    }
    public double getPoids(){
        //Retourne le poids de la nourriture
        return poids;
    }
    public double getCallo(){
        //Retourne les calories par kg de la nourriture
        return calories;
    }

    public String toString(){
        return nom+", poids: "+poids+" kg"+" quantités: "+quantites;
    }

    public double getPrix(){
        //Retourne le prix de la nourriture par unités
        return prix;
    }

    public void setQuantites(int quantites){
        //Défini les quantités en plus
        this.quantites += quantites;
    }

}
