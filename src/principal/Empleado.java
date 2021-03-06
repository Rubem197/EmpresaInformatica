package principal;

public abstract class Empleado {

    protected String nombre;
    protected String apellidos;
    protected String DNI;
    protected int antiguedad;
    protected int telefono;
    protected double salario;

    public Empleado(String nombre, String apellidos, String DNI, int antiguedad, int telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.antiguedad = antiguedad;
        this.telefono = telefono;
        this.salario = salario;
    }

    public abstract void incrementarsalario();

    public abstract void imprimir();


    public double getSalario() {
        return salario;
    }


}
