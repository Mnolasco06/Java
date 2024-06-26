package Herencia;

public class Empleado extends Persona{

    int num_empleado;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int ID, String nombre, String apellido, String domicilio, String telefono, int num_empleado, String cargo, Double sueldo) {
        super(ID, nombre, apellido, domicilio, telefono);
        this.num_empleado = num_empleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
