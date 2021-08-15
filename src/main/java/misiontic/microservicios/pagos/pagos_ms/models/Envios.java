package misiontic.microservicios.pagos.pagos_ms.models;

import org.springframework.data.annotation.Id;

public class Envios {

    @Id
    private String id;

    private String nombre;
    private String ciudad;
    private String departamento;
    private String direccion;
    private String celular;
    private String fechaEntreg;

    public Envios(String envioId, String nombre, String ciudad, String departamento, String direccion, String celular, String fechaEntreg) {
        this.id = envioId;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.direccion = direccion;
        this.celular = celular;
        this.fechaEntreg = fechaEntreg;
    }

    public String getEnvioId() {
        return id;
    }

    public void setEnvioId(String envioId) {
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

    public String getFechaEntreg() {
        return fechaEntreg;
    }

    public void setFechaEntreg(String fechaEntreg) {
        this.fechaEntreg = fechaEntreg;
    }
}
