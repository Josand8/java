package paquete1;
public class Peon extends Ficha {

    @Override
    public boolean mover() {
        return false;
    }
    
    public boolean comer(){
        var a=super.color;
        return false;
    }

    public static boolean coronar(){
        System.out.println("Funciono");
        return false;
    }
}
