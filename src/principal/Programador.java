package principal;

import java.util.Scanner;

public class Programador extends Empleado implements Cambiar {
    Scanner sc = new Scanner(System.in);
    private Portatil portatil;
    private String movil;
    private Tecnologia tecnologia;
    private Proyecto proyecto;

    public Programador(String nombre, String apellidos, String DNI, int antiguedad, int telefono, double salario, String movil, Tecnologia tecnologia, Proyecto proyecto, Portatil portatil) {
        super(nombre, apellidos, DNI, antiguedad, telefono, salario);
        this.portatil = portatil;
        this.movil = movil;
        this.tecnologia = tecnologia;
        this.proyecto = proyecto;
    }

    @Override
    public void incrementarsalario() {
        for (int i = 0; i < antiguedad; i++) {
            this.salario = salario * 1.1;
        }
    }

    @Override
    public void cambiarTecnologia() {
        System.out.println("Escribe la tecnologia");
        setTecnologia(Tecnologia.valueOf(sc.nextLine()));
    }

    @Override
    public void cambiarPortatil() {
        System.out.println("Escribe el modelo");
        setPortatil(new Portatil(Modelo.valueOf(sc.nextLine())));
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Empledo " + nombre + apellidos + " con DNI " + DNI + ", gana " + salario + "€. Su teléfono es " +
                telefono + ", tiene el telefono " + movil + ", trabaja con la tecnologia " + tecnologia + ", trabaja en el proyecto " + proyecto + " y su puesto es de " + getClass().getSimpleName() + portatil;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public void setPortatil(Portatil portatil) {
        this.portatil = portatil;
    }
}
