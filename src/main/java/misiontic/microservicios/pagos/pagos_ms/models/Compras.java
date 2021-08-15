package misiontic.microservicios.pagos.pagos_ms.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.CreatedBy;

public class Compras {

    @Id
    private String id;

    private String envioId;
    private String facturacionId;
    private String carritoId;
    private String compraFecha;

    public Compras(String id, String envioId, String facturacionId, String carritoId, String compraFecha) {
        this.id = id;
        this.envioId = envioId;
        this.facturacionId = facturacionId;
        this.carritoId = carritoId;
        this.compraFecha = compraFecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnvioId() {
        return envioId;
    }

    public void setEnvioId(String envioId) {
        this.envioId = envioId;
    }

    public String getFacturacionId() {
        return facturacionId;
    }

    public void setFacturacionId(String facturacionId) {
        this.facturacionId = facturacionId;
    }

    public String getCarritoId() {
        return carritoId;
    }

    public void setCarritoId(String carritoId) {
        this.carritoId = carritoId;
    }

    public String getCompraFecha() {
        return compraFecha;
    }

    public void setCompraFecha(String compraFecha) {
        this.compraFecha = compraFecha;
    }
}
