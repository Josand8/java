import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        var sc=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        var numero=sc.nextInt();
        var resultado=numeroDigitos(numero);
        System.out.println("El numero "+numero+" tiene "+resultado+" cifras");
        sc.close();
    }
    public static int numeroDigitos(int num){
        var cifras=0;
        while (num!=0){
            num/=10;
            cifras++;
        }
        return cifras;
    }
}
