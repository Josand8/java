public class PrecioTotal {
    private Double totalComputadores = 0.0;
    private Double totalComputadoresPortatiles = 0.0;
    private Double totalComputadoresMesa = 0.0;
    private Computadores[] listaComputadores;
    // Constructor
    PrecioTotal(Computadores[] pComputadores) {
        this.listaComputadores = pComputadores;
    }
    public void mostrarTotales() {
    // Código
    for (Computadores computadores : listaComputadores) {
        totalComputadores+=computadores.precioBase+computadores.calcularPrecio();
    if (computadores.getClass()==ComputadoresMesa.class){
        totalComputadoresMesa+=computadores.precioBase+computadores.calcularPrecio();
    }
    if (computadores.getClass()==ComputadoresPortatiles.class){
        totalComputadoresPortatiles+=computadores.precioBase+computadores.calcularPrecio();
    }
    }
    // Mostramos los resultados
    System.out.println("La suma del precio de los computadores es de " + totalComputadores);
    System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
    System.out.print("La suma del precio de los computadores portátiles es de " + totalComputadoresPortatiles);
    }
}