package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JefeDepartamento extends Empleado implements Cambiar {
    Scanner sc = new Scanner(System.in);
    private Portatil portatil;
    private Tecnologia tecnologia;
    private Proyecto proyecto;
    Coche coche;
    private List<Programador> lista = new ArrayList<>();

    public JefeDepartamento(String nombre, String apellidos, String DNI, int antiguedad, int telefono, double salario, Tecnologia tecnologia, Proyecto proyecto, Portatil portatil, Coche coche) {
        super(nombre, apellidos, DNI, antiguedad, telefono, salario);
        this.portatil = portatil;
        this.tecnologia = tecnologia;
        this.coche = coche;

    }

    @Override
    public void incrementarsalario() {
        for (int i = 0; i < antiguedad; i++) {
            this.salario = salario * 1.2;
        }
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
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

    public void cambiarCoche() {
        System.out.println("Escribe el coche");
        System.out.println("Escribe la matricula");
        String matricula = sc.nextLine();
        System.out.println("Escribe el modelo");
        String modelo = sc.nextLine();
        System.out.println("Escribe la marca");
        String marca = sc.nextLine();
        setCoche(new Coche(matricula, marca, modelo));
    }

    public void altaProgramadores(Programador programador) {
        lista.add(programador);
    }

    public void bajaProgramadores(Programador programador){
        lista.remove(programador);
    }

    @Override
    public String toString() {
        return "Empledo " + nombre + apellidos + " con DNI " + DNI + ", gana " + salario + "€. Su teléfono es " +
                telefono + ", trabaja con la tecnologia " + tecnologia + ", trabaja en el proyecto " + proyecto + " y su puesto es de " + getClass().getSimpleName() + portatil + " su coche es " + coche;
    }

    public void setPortatil(Portatil portatil) {
        this.portatil = portatil;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
}
