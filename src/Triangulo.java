public class Triangulo extends Formas {
    private double angulo;

    public Triangulo(double angulo) {
        this.angulo = angulo;
    }

    public void dibujar() {
        System.out.println("Triángulo");
    }

    public double calcularArea() {
        
        return (angulo * angulo) / 2;
    }
}

