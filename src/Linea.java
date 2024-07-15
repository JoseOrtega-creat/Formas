public class Linea extends Formas {
    private double largo;

    public Linea(double largo) {
        this.largo = largo;
    }

    public void dibujar() {
        System.out.println("Línea");
    }

    public double obtenerLargo() {
        return largo;
    }
}


