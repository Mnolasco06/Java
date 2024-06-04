package Herencia;

public class Consultor  extends Persona{

    int numb_consultora;
    String nombre_consultora;

    public Consultor() {
    }

    public Consultor(int ID, String nombre, String apellido, String domicilio, String telefono, int numb_consultora, String nombre_consultora) {
        super(ID, nombre, apellido, domicilio, telefono);
        this.numb_consultora = numb_consultora;
        this.nombre_consultora = nombre_consultora;
    }

    public int getNumb_consultora() {
        return numb_consultora;
    }

    public void setNumb_consultora(int numb_consultora) {
        this.numb_consultora = numb_consultora;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }
}
