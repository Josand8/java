import java.util.Scanner;

public class App {
    public static void main(String[] args) {
		// tod0 Esbozo de método generado automáticamente
		String saludo="Hola";
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite su nombre:");
		var nombre=sc.nextLine();
		System.out.println(saludo+", "+nombre+"!");
        System.out.println("Digite su edad: ");
        var edad=sc.nextInt();
        if (edad>17){
            System.out.println("Es un adulto");
        }
        else if (edad>12){
            System.out.println("Es un adolescente");
        }
        else{
            System.out.println("Es un niño");
        }
        for (int i=0; i<=edad;i++){
            System.out.println(i);
        }
        sc.close();
	}
}
