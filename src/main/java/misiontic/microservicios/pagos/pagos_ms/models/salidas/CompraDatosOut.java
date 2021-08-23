package misiontic.microservicios.pagos.pagos_ms.models.salidas;

import misiontic.microservicios.pagos.pagos_ms.models.Carritos;
import misiontic.microservicios.pagos.pagos_ms.models.Compras;
import misiontic.microservicios.pagos.pagos_ms.models.Envios;
import misiontic.microservicios.pagos.pagos_ms.models.Facturaciones;

import java.util.List;

public class CompraDatosOut {

    private Envios informacionEnvio;
    private Facturaciones informacionFacturacion;
    private List<Carritos> informacionCarrito;
    private Compras informacionCompra;

    public CompraDatosOut(Envios informacionEnvio, Facturaciones informacionFacturacion, List<Carritos> informacionCarrito, Compras informacionCompra) {
        this.informacionEnvio = informacionEnvio;
        this.informacionFacturacion = informacionFacturacion;
        this.informacionCarrito = informacionCarrito;
        this.informacionCompra = informacionCompra;
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

    public Compras getInformacionCompra() {
        return informacionCompra;
    }

    public void setInformacionCompra(Compras informacionCompra) {
        this.informacionCompra = informacionCompra;
    }
}
