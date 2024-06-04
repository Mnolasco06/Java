package Interface;

public class Circulo implements Figura, Rotar, Dibujar{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo ");
    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public void rotar() {
        System.out.println("Estoy rotando un circulo ");
    }
}
