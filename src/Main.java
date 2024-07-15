public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        circulo.dibujar();

        Linea linea = new Linea(10.0);
        linea.dibujar();

        Triangulo triangulo = new Triangulo(30.0);
        triangulo.dibujar();

        Cuadrado cuadrado = new Cuadrado(5.0);
        cuadrado.dibujar();
    }
}

