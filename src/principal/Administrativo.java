package principal;

public class Administrativo extends Empleado {

    private Despachos despachos;
    private int numeroFax;

    public Administrativo(String nombre, String apellidos, String DNI, int antiguedad,
                          int telefono, double salario, Despachos despachos, int numeroFax) {
        super(nombre, apellidos, DNI, antiguedad, telefono, salario);
        this.despachos = despachos;
        this.numeroFax = numeroFax;
    }

    @Override
    public void incrementarsalario() {
        for (int i = 0; i < antiguedad; i++) {
            this.salario = salario * 1.05;
        }
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Empledo " + nombre + apellidos + " con DNI " + DNI + ", gana " + salario + "€. Su teléfono es " +
                telefono + ", trabaja en el despacho " + despachos + ",  su numero de fax es " + numeroFax + " y su puesto es de " + getClass().getSimpleName();
    }

}
