public class Cuadrado extends Formas {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public void dibujar() {
        System.out.println("Cuadrado");
    }

    public double calcularArea() {
        return lado * lado;
    }
}


