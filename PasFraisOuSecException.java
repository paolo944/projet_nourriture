public class PasFraisOuSecException extends Exception{
    public PasFraisOuSecException(String type){
        super("Probleme de typage, ceci est "+message);
    }
}