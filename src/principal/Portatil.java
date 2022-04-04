package principal;

enum Modelo {PAVILION, OMEN, KERNAVIO}

public class Portatil {

    protected String Marca;
    protected int nSerie;
    Modelo modelo;

    public Portatil(Modelo modelo) {
        Marca = "HP";
        nSerie = 545353;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return " y tiene un portatil de la marca " + Marca +
                ", con numero de serie " + nSerie +
                ", y modelo " + modelo;
    }

}
