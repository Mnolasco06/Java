package Herencia;

public class Herencia {

    public static void main(String[] args) {

        Empleado emple = new Empleado();

    emple.setCargo("Gerente");
    emple.setSueldo(1000.99);
    emple.setNombre("Max");
    emple.setApellido("Nolasco");

    System.out.println("El nombre del formulario debe ser en nombre de: " + emple.getNombre() + " " + emple.getApellido());
    System.out.println("Cargo: " + emple.getCargo());
    System.out.println("Sueldo es: " + emple.getSueldo());

    }
}
