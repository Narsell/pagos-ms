package misiontic.microservicios.pagos.pagos_ms.models;
import java.util.List;

public class CompraDatos {

    private Envios informacionEnvio;
    private Facturaciones informacionFacturacion;
    private List<Carritos> informacionCarrito;

    public CompraDatos(Envios informacionEnvio, Facturaciones informacionFacturacion, List<Carritos> informacionCarrito) {
        this.informacionEnvio = informacionEnvio;
        this.informacionFacturacion = informacionFacturacion;
        this.informacionCarrito = informacionCarrito;
    }

    public Envios getInformacionEnvio() {
        return informacionEnvio;
    }

    public void setInformacionEnvio(Envios informacionEnvio) {
        this.informacionEnvio = informacionEnvio;
    }

    public Facturaciones getInformacionFacturacion() {
        return informacionFacturacion;
    }

    public void setInformacionFacturacion(Facturaciones informacionFacturacion) {
        this.informacionFacturacion = informacionFacturacion;
    }

    public List<Carritos> getInformacionCarrito() {
        return informacionCarrito;
    }

    public void setInformacionCarrito(List<Carritos> informacionCarrito) {
        this.informacionCarrito = informacionCarrito;
    }
}
