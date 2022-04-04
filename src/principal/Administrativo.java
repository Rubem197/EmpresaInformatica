package principal;

public class Administrativo extends Empleado {

    private Despachos despachos;
    private int numeroFax;

    public Administrativo(String nombre, String apellidos, String DNI, String antiguedad,
                          int telefono, double salario, Despachos despachos, int numeroFax) {
        super(nombre, apellidos, DNI, antiguedad, telefono, salario );
        this.despachos=despachos;
    }
    public Administrativo(double salario) {
        super(salario);
    }

    @Override
    public void incrementarsalario() {
        this.salario= salario*1.05;
    }
}
