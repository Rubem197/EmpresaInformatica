package principal;

enum Modelo{  PAVILION, OMEN, KERNAVIO}
public class Portatil {

    protected String Marca;
    protected int nSerie;
    Modelo modelo;

    public Portatil(int nSerie, Modelo modelo){
        Marca="HP";
        this.nSerie=nSerie;
        this.modelo=modelo;
    }
}
