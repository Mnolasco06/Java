package Alumno.java;

public class Alumno {

        int ID;
        String nombre;
        String Apellido;

    public Alumno() {
    }

    public Alumno(int ID, String nombre, String apellido) {
        this.ID = ID;
        this.nombre = nombre;
        Apellido = apellido;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void mostrarNombre() {

            System.out.println("Hola, soy un alumno y se decir mi nombre");
        }

}
