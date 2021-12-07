public abstract class Nourriture{
  public static double StockTotal;
  public String name;
  public double stockmax ;
  public double stock;
  public int calorie; 
  protected Nourriture(double stockmax,double stock,int calorie,String name){
    this.stockmax=stockmax;
    this.calorie=calorie;
    this.name=name;
    if (stockmax>stock){
        this.stock=stock;     
    }
    else{
        this.stock=stockmax;
    }
    Nourriture.StockTotal=+this.stock;
  }
  protected abstract void  course();
  protected abstract void ajouterMenu(Menu menu1,double Qtte);
}