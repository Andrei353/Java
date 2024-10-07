package Draws;

interface Shape {
    void draw();
}

interface Color {
    String getColorName();
}

class RedColor implements Color {
    @Override
    public String getColorName() {
        return "vermelho";
    }
}

class BlueColor implements Color {
    @Override
    public String getColorName() {
        return "azul";
    }
}

class Square implements Shape {
    private final Color cor;

    public Square(Color cor) {
        this.cor = cor;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando um quadrado na cor " + cor.getColorName());
    }
}

class Circle implements Shape {
    private final Color cor;

    public Circle(Color cor) {
        this.cor = cor;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando um círculo na cor " + cor.getColorName());
    }
}