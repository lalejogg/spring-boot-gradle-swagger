package HolaMundo;

public class HolaMundo{
    private final String message;
    public HolaMundo(String userName){
    this.message = String.format("Hola %s, Bienvenido al mundo",userName);
    }
    public String getMessage(){
    return this.message;
    }
}