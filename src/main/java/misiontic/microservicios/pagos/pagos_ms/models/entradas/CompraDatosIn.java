package misiontic.microservicios.pagos.pagos_ms.models.entradas;
import misiontic.microservicios.pagos.pagos_ms.models.Carritos;
import misiontic.microservicios.pagos.pagos_ms.models.Envios;
import misiontic.microservicios.pagos.pagos_ms.models.Facturaciones;

import java.util.List;

public class CompraDatosIn {

    private Envios informacionEnvio;
    private Facturaciones informacionFacturacion;
    private List<Carritos> informacionCarrito;

    public CompraDatosIn(Envios informacionEnvio, Facturaciones informacionFacturacion, List<Carritos> informacionCarrito) {
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
