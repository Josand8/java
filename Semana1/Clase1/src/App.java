import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String a="hola";
        System.out.println("Hello, World!");
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        String nombre = sc.nextLine();
        System.out.println(nombre);
    }
}
