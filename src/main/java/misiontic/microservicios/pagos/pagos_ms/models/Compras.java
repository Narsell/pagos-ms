package misiontic.microservicios.pagos.pagos_ms.models;


import javax.persistence.*;
import java.util.Date;
@Entity
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "compra_id")
    private Long id;

    @Column(name = "compra_fecha")
    private Date compraFecha;

    @Column(name = "compra_estado")
    private String compraEstado;

    public Compras(Date compraFecha, String compraEstado) {
        this.compraFecha = compraFecha;
        this.compraEstado = compraEstado;
    }

    public Compras() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCompraFecha() {
        return compraFecha;
    }

    public void setCompraFecha(Date compraFecha) {
        this.compraFecha = compraFecha;
    }

    public String getCompraEstado() {
        return compraEstado;
    }

    public void setCompraEstado(String compraEstado) {
        this.compraEstado = compraEstado;
    }
}
