package misiontic.microservicios.pagos.pagos_ms.models;
import javax.persistence.*;

@Entity
public class Carritos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "carrito_id")
    private Long id;

    @Column(name = "producto_id")
    private Long productoId;

    @Column(name = "producto_cantidad")
    private Integer productoCantidad;

    @Column(name = "producto_precio_unitario")
    private Float productoPrecioUnitario;

    @Column(name = "producto_precio_total")
    private Float productoPrecioTotal;

    @Column(name = "compra_id")
    private Long compraId;

    public Carritos(Long id, Long productoId, Integer productoCantidad, Float productoPrecioUnitario, Float productoPrecioTotal, Long compraId) {
        this.id = id;
        this.productoId = productoId;
        this.productoCantidad = productoCantidad;
        this.productoPrecioUnitario = productoPrecioUnitario;
        this.productoPrecioTotal = productoPrecioTotal;
        this.compraId = compraId;
    }

    public Carritos() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public Integer getProductoCantidad() {
        return productoCantidad;
    }

    public void setProductoCantidad(Integer productoCantidad) {
        this.productoCantidad = productoCantidad;
    }

    public Float getProductoPrecioUnitario() {
        return productoPrecioUnitario;
    }

    public void setProductoPrecioUnitario(Float productoPrecioUnitario) {
        this.productoPrecioUnitario = productoPrecioUnitario;
    }

    public Float getProductoPrecioTotal() {
        return productoPrecioTotal;
    }

    public void setProductoPrecioTotal(Float productoPrecioTotal) {
        this.productoPrecioTotal = productoPrecioTotal;
    }

    public Long getCompraId() {
        return compraId;
    }

    public void setCompraId(Long compraId) {
        this.compraId = compraId;
    }
}
