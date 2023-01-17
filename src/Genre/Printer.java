package Genre;
// this class will receive a variable, we don't know the type yet, the user will decide
public class Printer <T>{
    private  T t;
    public Printer(T t){
        this.t=t;
    }
    public T getT(){
        return t;
    }

}
