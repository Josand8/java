import java.util.Scanner;

public class Ejercicios {
    // Atributos
    public int variable1;
    public String st;
    private double hora;

    // Constructor
    public Ejercicios(){
        this.st="Hola";
        this.variable1=10;
        this.hora=100;
    }
    public Ejercicios(String s,int var1,int h){
        this.st=s;
        this.variable1=var1;
        this.hora=h;
    }
    // Metodo principal
    public static void main(String[] args){
        ejercicio1();
    }
    public static void ejercicio1(){
        var sc= new Scanner(System.in);
        System.out.println("Digita el dia de nacimiento: ");
        var dia=sc.nextInt();
        System.out.println("Digite el mes de nacimiento: ");
        var mes=sc.nextInt();
        System.out.println("Digite el año de nacimiento: ");
        var an=sc.nextInt();
        var res= numerosuerte(dia,mes,an);
        System.out.println("Su numero de la suerte es: "+res);
        sc.close();
    }

    public static int numerosuerte(int d,int m, int a){
        var rs=d+m+a;
        var umil=rs/1000;
        var cent=(rs-umil*1000)/100;
        var dec=(rs-umil*1000+cent*100)/10;
        var un=(rs-umil*1000-cent*100-dec*10);
        var ns=umil+cent+dec+un;
        return ns;
    }

    public static void ejercicio5(){
        var sc= new Scanner (System.in);
        System.out.println("Digite el cateto opuesto: ");
        var co=sc.nextInt();
        System.out.println("Digite el cateto adyacente: ");
        var ca= sc.nextInt();
        var res=hypot(co,ca);
        System.out.println("La hipotenusa es:"+res);
        sc.close();
    }

    public static double hypot(double co,double ca){
        var hyp=Math.sqrt(Math.pow(co, 2)+Math.pow(ca, 2));
        return hyp;
    }
}
