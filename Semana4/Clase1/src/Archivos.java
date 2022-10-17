import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Archivos {
    public static void main(String[] args) throws Exception {
        lectura_io();
        escritura_io();
        escritura_nio();
    }

    public static void lectura_io() throws FileNotFoundException{
        var archivo= new File("prueba.txt");
        
        if(archivo.exists()){
            var lector=new Scanner(archivo);
            while(lector.hasNext()){
                var lectura= new StringTokenizer(lector.next(),",");
                while(lectura.hasMoreTokens()){
                    System.out.println(lectura.nextToken());
                }

            }
            lector.close();
        }
        else{
            System.out.println("El archivo no existe");
        }
    }
    public static void escritura_io() throws FileNotFoundException{
        int[] numeros={10,20,3,4,5,67};
        var archivo="numeros.txt";
        var salida=new PrintWriter(archivo);

        for (int i : numeros) {
            salida.println(i+", ");
        }
        salida.close();
    }

    public static void escritura_nio(){
        Path archivo=Paths.get("Archivo2.txt");
        if (Files.notExists(archivo)){
            try {
                archivo=Files.createFile(Paths.get("Archivo2.txt"));    
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
        else{
            System.out.println("El archivo ya existe");
        }

        var texto= "Hola Mundo \n Bienvenidos";
        try {
            Files.write(archivo, texto.getBytes(StandardCharsets.UTF_8));    
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public static void lectura_nio(){
        try {
            var contenido=new String(Files.readAllBytes(Paths.get("Archivo2.txt")),StandardCharsets.UTF_8);
            System.out.println(contenido);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
