public class Computadores {
    // Variables base
    protected static final int PESO_BASE=5;
    protected static final char CONSUMO_W_BASE='F';
    protected static final double PRECIO_BASE=100.0;
    // Variables
    protected int peso;
    protected char consumoW;
    protected double precioBase;
    // Constructores public Computadores(){
    // Constructor
    public Computadores() {
        this.consumoW=CONSUMO_W_BASE;
        this.peso=PESO_BASE;
        this.precioBase=PRECIO_BASE;
    }
    public Computadores(Double precioBase, Integer peso) {
        this.consumoW=CONSUMO_W_BASE;
        this.peso=peso;
        this.precioBase=precioBase;
    }
    public Computadores(Double precioBase, Integer peso, char consumoW) {
        this.consumoW=consumoW;
        this.peso=peso;
        this.precioBase=precioBase;
    }
    // Metodos
    public double calcularConsumoW(){
        double aumento=0.0;
        switch (this.consumoW){
            case 'A':
                aumento=100;
                break;
            case 'B':
                aumento=80;
                break;
            case 'C':
                aumento=60;
                break;
            case 'D':
                aumento=50;
                break;
            case 'E':
                aumento=30;
                break;
            case 'F':
                aumento=10;
                break;
        }
        return aumento;
    }

    public Double calcularPrecio() {
        Double adicion = 0.0;
        double consumoW=calcularConsumoW();
        double aum_peso=0.0;
        // Código
        if (this.peso>=0 && this.peso<19){
            aum_peso=10;
        }
        else if (this.peso>=20 && this.peso<49){
            aum_peso=50;
        }
        else if (this.peso>=50 && this.peso<=79){
            aum_peso=80;
        }
        else{
            aum_peso=100;
        }
        adicion=consumoW+aum_peso;
        return adicion;
    }
    // Getter
}
