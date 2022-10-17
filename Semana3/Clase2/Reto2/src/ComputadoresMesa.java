public class ComputadoresMesa extends Computadores{
    private final static Integer ALMACENAMIENTO_BASE = 50;
    // Variable
    private int almacenamiento;
    // Constructor
    public ComputadoresMesa() {
        super.consumoW=CONSUMO_W_BASE;
        super.peso=PESO_BASE;
        super.precioBase=PRECIO_BASE;
        this.almacenamiento=ALMACENAMIENTO_BASE;
    }
    // Constructor
    public ComputadoresMesa(Double precioBase, Integer peso) {
        super.consumoW=CONSUMO_W_BASE;
        super.peso=peso;
        super.precioBase=precioBase;
        this.almacenamiento=ALMACENAMIENTO_BASE;
    }
    // Constructor
    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer
    almacenamiento) {
        super.consumoW=consumoW;
        super.peso=peso;
        super.precioBase=precioBase;
        this.almacenamiento=almacenamiento;
    }
    // Métodos
    public Double calcularPrecio() {
        // Código return adicion;
        var adicion=super.calcularPrecio();
if (this.almacenamiento>100){
            adicion+=50;
        }
        return adicion;
    }
    public Integer getCarga() {
        return almacenamiento;
    }

}
    
