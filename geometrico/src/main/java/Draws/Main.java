package Draws;

public class Main {

    public static void main(String[] args) {
        // Criando objetos de forma e cor
        Shape quadrado = new Square(new RedColor());
        Shape circulo = new Circle(new BlueColor());

        // Desenhando as formas
        quadrado.draw();
        circulo.draw();
    }
}