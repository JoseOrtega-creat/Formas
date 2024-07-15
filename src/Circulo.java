public class Circulo extends Formas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void dibujar() {
        System.out.println("Círculo");
    }

    public double calcularRadio() {
        return radio;
    }
}

