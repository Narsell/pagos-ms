package misiontic.microservicios.pagos.pagos_ms.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Envios {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "envio_id")
    private Long id;

    @Column(name = "envio_nombre")
    private String nombre;

    @Column(name = "envio_ciudad")
    private String ciudad;

    @Column(name = "envio_departamento")
    private String departamento;

    @Column(name = "envio_direccion")
    private String direccion;

    @Column(name = "envio_celular")
    private String celular;

    @Column(name = "envio_fecha_entrega")
    private LocalDateTime fechaEntrega;

    @Column(name = "compra_id")
    private Long compraId;

    public Envios(Long id, String nombre, String ciudad, String departamento, String direccion, String celular, LocalDateTime fechaEntrega, Long compraId) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.direccion = direccion;
        this.celular = celular;
        this.fechaEntrega = fechaEntrega;
        this.compraId = compraId;
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

    public void setId(Long envioId) {
        this.id = envioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDateTime fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
