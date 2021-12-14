public class PasFraisOuSecException extends Exception{
    public PasFraisOuSecException(String message){
        super("Probleme de typage, ceci est "+message);
    }
}