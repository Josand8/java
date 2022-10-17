public class BecaUniversitaria {
    //
    // Atributos
    private double pMonto;
    private double pInteres;
    private int pTiempo;

    // Constructores
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres){
        this.pMonto=pMonto;
        this.pInteres=pInteres;
        this.pTiempo=pTiempo;
    }

    public BecaUniversitaria(){
        this.pInteres=0;
        this.pMonto=0;
        this.pTiempo=0;
    }
    // Métodos
    //
    public double calcularInteresSimple( ){
        var intsimple=this.pMonto*this.pInteres*this.pTiempo/100;
        return Math.round(intsimple);
    }
    public double calcularInteresCompuesto( ){
        var intcomp=this.pMonto*((Math.pow(1+this.pInteres/100, this.pTiempo))-1);
        return Math.round(intcomp);
    }
    public String compararInversion (int pTiempo, double pMonto, double pInteres){
        this.pMonto=pMonto;
        this.pInteres=pInteres;
        this.pTiempo=pTiempo;
        var intsimple=calcularInteresSimple();
        var intcomp=calcularInteresCompuesto();
        var diferencia=intcomp-intsimple;

        if (diferencia==0){
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
    }
        else{
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $"+diferencia;
    }
    }
    public  String compararInversion(){
        var intsimple=calcularInteresSimple();
        var intcomp=calcularInteresCompuesto();
        var diferencia=intcomp-intsimple;
        if (diferencia==0){
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
        else{
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $"+diferencia;
        }
    }

    public static void main(String[] args) {
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(60,13000,1.4));
    }
    }