package com.utp.venta.Modelos;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "proveedores")
public class Proveedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Debes especificar la razon social")
    @Size(min = 1, max = 50, message = "La razon social debe medir entre 1 y 50")
    private String razonSocial;

    @NotNull(message = "Debes especificar el email")
    @Size(min = 1, max = 50, message = "El email debe medir entre 1 y 50")
    private String email;

    @NotNull(message = "Debes especificar el tipo de documento")
    @Min(value = 0, message = "El tipo de documento debe medir entre 1 y 50")
    private String tipoDocumento;

    @NotNull(message = "Debes especificar el documento")
    @Min(value = 0, message = "El documento debe medir entre 1 y 50")
    private String documento;



    public Proveedor() {
    }

    public Proveedor(String razonSocial, String email, String tipoDocumento, String documento) {
        this.razonSocial = razonSocial;
        this.email = email;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
    }

    public Proveedor(Integer id, String razonSocial, String email, String tipoDocumento, String documento) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.email = email;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }


}
