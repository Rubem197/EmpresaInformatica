package principal;

public class Programador extends Empleado {
    public Programador(String nombre, String apellidos, String DNI, String antiguedad, int telefono, double salario) {
        super(nombre, apellidos, DNI, antiguedad, telefono, salario);
    }

    public Programador(double salario) {
        super(salario);
    }

    @Override
    public void incrementarsalario() {
        this.salario= salario*1.1;
    }
}
