package principal;

public class Main {

    public static void main(String[] args) {
        Empleado ad = new Administrativo("susi", "pote", "776464564R", 4, 56434332, 540, Despachos.Administrativo, 435543645);
        Empleado a1 = new Programador("Susi", "navarro", "3248723e", 321, 324234, 312312, "Samsung", Tecnologia.CSS, Proyecto.CREACION_WEB, new Portatil(Modelo.KERNAVIO));
        Empleado a2 = new Programador("Susi", "navarro", "3248723e", 321, 324234, 312312, "Samsung", Tecnologia.CSS, Proyecto.CREACION_WEB, new Portatil(Modelo.KERNAVIO));
        ((Programador) a2).cambiarPortatil();
        a1.imprimir();
    }
}
