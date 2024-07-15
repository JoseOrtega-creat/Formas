public class Formas {
    private String color;

    public Formas() {
        // Constructor por defecto
    }

    public void dibujar() {
        System.out.println("Dibujar forma");
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    public String obtenerColor() {
        return color;
    }
}


