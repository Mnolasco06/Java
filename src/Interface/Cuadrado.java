package Interface;

public class Cuadrado implements Figura, Dibujar{

    private double lado;

    public Cuadrado(){
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
         System.out.println("Estoy dibujando un cuadrado");
    }
}
