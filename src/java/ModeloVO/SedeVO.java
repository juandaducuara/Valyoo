/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author ACER
 */
public class SedeVO {

    private String sedeId, sedeNombre, sedeDireccion, sedeTelefono, sedeEstado;

    public SedeVO() {
    }

    public SedeVO(String sedeId, String sedeNombre, String sedeDireccion, String sedeTelefono, String sedeEstado) {
        this.sedeId = sedeId;
        this.sedeNombre = sedeNombre;
        this.sedeDireccion = sedeDireccion;
        this.sedeTelefono = sedeTelefono;
        this.sedeEstado = sedeEstado;
    }

    public String getSedeId() {
        return sedeId;
    }

    public void setSedeId(String sedeId) {
        this.sedeId = sedeId;
    }

    public String getSedeNombre() {
        return sedeNombre;
    }

    public void setSedeNombre(String sedeNombre) {
        this.sedeNombre = sedeNombre;
    }

    public String getSedeDireccion() {
        return sedeDireccion;
    }

    public void setSedeDireccion(String sedeDireccion) {
        this.sedeDireccion = sedeDireccion;
    }

    public String getSedeTelefono() {
        return sedeTelefono;
    }

    public void setSedeTelefono(String sedeTelefono) {
        this.sedeTelefono = sedeTelefono;
    }

    public String getSedeEstado() {
        return sedeEstado;
    }

    public void setSedeEstado(String sedeEstado) {
        this.sedeEstado = sedeEstado;
    }

}
