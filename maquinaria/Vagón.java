package Ferroviaria.maquinaria;

public class Vagón {
    //id
    //cargaMaxima
    //cargaActual
    //mercancia
    //numeral para las mercancias

    protected String id;
    protected int cargaMaxima;
    protected int cargaActual;
    protected String mercancia;
    protected int numMercancias;

    public Vagón(String id, int cargaMaxima, int cargaActual, String mercancia, int numMercancias) {
        this.id = id;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
        this.numMercancias = numMercancias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getMercancia() {
        return mercancia;
    }

    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }

    public int getNumMercancias() {
        return numMercancias;
    }

    public void setNumMercancias(int numMercancias) {
        this.numMercancias = numMercancias;
    }

    @Override
    public String toString() {
        return "Vagón{" +
                "id='" + id + '\'' +
                ", cargaMaxima=" + cargaMaxima +
                ", cargaActual=" + cargaActual +
                ", mercancia='" + mercancia + '\'' +
                ", numMercancias=" + numMercancias +
                '}';
    }
}
