package misiontic.microservicios.pagos.pagos_ms.models;

import org.springframework.data.annotation.Id;

public class Carritos {

    @Id
    private String id;

    private String productoId;
    private int productoCantidad;
    private float productoTotal;

    public Carritos(String id, String productoId, int productoCantidad, float productoTotal) {
        this.id = id;
        this.productoId = productoId;
        this.productoCantidad = productoCantidad;
        this.productoTotal = productoTotal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    public int getProductoCantidad() {
        return productoCantidad;
    }

    public void setProductoCantidad(int productoCantidad) {
        this.productoCantidad = productoCantidad;
    }

    public float getProductoTotal() {
        return productoTotal;
    }

    public void setProductoTotal(float productoTotal) {
        this.productoTotal = productoTotal;
    }
}
