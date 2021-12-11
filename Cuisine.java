public class Cuisine{
    public Frigo[] frigos;
    public Etagere[] etageres;

    public Cuisine(int frigos, int etageres) {
        this.frigos = new Frigo[frigos];
        this.etageres = new Etagere[etageres];
    }
}