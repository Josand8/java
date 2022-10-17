public class ComputadoresPortatiles extends Computadores{
    private final static Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private boolean camaraITG;
    // Constructor
    public ComputadoresPortatiles() {
        super.consumoW=CONSUMO_W_BASE;
        super.peso=PESO_BASE;
        super.precioBase=PESO_BASE;
        this.camaraITG=false;
        this.pulgadas=PULGADAS_BASE;
    }
    // Constructor
    public ComputadoresPortatiles(Double precioBase, Integer peso) {
        super.consumoW=CONSUMO_W_BASE;
        super.peso=peso;
        super.precioBase=precioBase;
        this.camaraITG=false;
        this.pulgadas=PULGADAS_BASE;
    }
    // Constructor
    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean camaraITG) {
        super.consumoW=consumoW;
        super.peso=peso;
        super.precioBase=precioBase;
        this.camaraITG=camaraITG;
        this.pulgadas=pulgadas;
    }
    // Métodos
    public Double calcularPrecio() {
    // Método Código return adicion;
    var adicion=super.calcularPrecio();
    if (this.pulgadas>40){
        adicion=adicion+super.precioBase*0.3;
    }
    if (this.camaraITG==true){
        adicion+=50;
    }
    return adicion;
    }
    
    }
