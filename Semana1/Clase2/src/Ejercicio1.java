import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
		System.out.println("Digite su nombre:");
        var nombre=sc.nextLine();
        var resultado=saludo(nombre);
		System.out.println(resultado);
        sc.close();
    }
    public static String saludo(String nombre){
        return ("Hola, " +nombre+"!");
    }
}
