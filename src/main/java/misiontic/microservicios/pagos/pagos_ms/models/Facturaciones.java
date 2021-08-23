package misiontic.microservicios.pagos.pagos_ms.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Facturaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "facturacion_id")
    private Long id;

    @Column(name = "facturacion_tipo_doc")
    private String tipoDocumento;

    @Column(name = "facturacion_num_doc")
    private String numeroDocumento;

    @Column(name = "facturacion_celular")
    private String numeroCelular;

    @Column(name = "facturacion_metodo_pago")
    private String metodoPago;

    @Column(name = "facturacion_total")
    private Float precioTotal;

    @Column(name = "compra_id")
    private Long compraId;

    public Facturaciones(Long id, String tipoDocumento, String numeroDocumento, String numeroCelular, String metodoPago, float precioTotal, Long compraId) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.numeroCelular = numeroCelular;
        this.metodoPago = metodoPago;
        this.precioTotal = precioTotal;
        this.compraId = compraId;
    }

    public Facturaciones() {
    }

    public Long getCompraId() {
        return compraId;
    }

    public void setCompraId(Long compraId) {
        this.compraId = compraId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
}
