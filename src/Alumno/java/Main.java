package Alumno.java;

public class Main {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno ();
        Alumno alu2 = new Alumno (5, "Max", "Nolasco");


        System.out.println("La ID del alumno 2 es: " + alu2.getID());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());


        alu1.setID(8);
        alu1.setNombre("Jucelia");
        alu1.setApellido("Tolentino");

        System.out.println("----------------------------");

        System.out.println("La ID del alumno 1 es: " + alu1.getID());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());

        alu2.setID(35);

        System.out.println("----------------------------");
        System.out.println("La ID del alumno 2 es: " + alu2.getID());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
    }
}