public class Frais extends Nourriture{
    public double stockAuFrais;
    public Frais(double stockmax,double stock,int calorie,String name){
        super(stockmax,stock,calorie,name)
    }
    public ajouterFrigo(Frigo f1,double Qtte){
        if (Qtte<this.stock){       //1er cas: plus de stock que de qtté mais 2 sous-cas: assez ou pas assez de place dans le frigo
            if (f1.place>Qtte){
                this.stock=-Qtte;
                this.stockAuFrais=+Qtte;
                Nourriture.StockTotal=-Qtte;
                f1.place=-Qtte;
                System.out.println(Qtte.toString()+" "+this.toString()+"ont été mis dans le frigo"+f1.toString)
            }
            else{this.stock=-place;
                this.stockAuFrais=+place;
                Nourriture.StockTotal=-place;
                f1.place=0;
                System.out.println(place.toString()+" "+this.toString()+"ont été mis dans le frigo"+f1.toString)
            }
        }
        else{                   //2eme cas : pas assez de stock, mais toujours les mêmes 2 sous-cas
            if (f1.place>stock){
                this.stock=0;
                this.stockAuFrais=+stock;
                Nourriture.StockTotal=-stock;
                f1.place=-stock;
                System.out.println("Seulement"+stock.toString()+" "+this.toString()+"ont été mis dans le frigo"+f1.toString)
            }
            else{this.stock=-place;
                this.stockAuFrais=+place;
                Nourriture.StockTotal=-place;
                f1.place=0;
                System.out.println(place.toString()+" "+this.toString()+"ont été mis dans le frigo"+f1.toString)
            }
        }
    }
    public ajouterMenu(Menu menu1, double Qtte){
        menu1.caloMenue=+this.calorie;
        if (this.stockAuFrais>Qtte){
            this.stockAuFrais=-Qtte;
            //a finir
        }
    }
}