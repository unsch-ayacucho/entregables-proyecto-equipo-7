package pe.edu.unsch.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Constanciadeaprobacion {
    private int idConstanciaDeAprobacion;
    private int idDocumento;
    private String codigo;

    @Id
    @Column(name = "idConstanciaDeAprobacion")
    public int getIdConstanciaDeAprobacion() {
        return idConstanciaDeAprobacion;
    }

    public void setIdConstanciaDeAprobacion(int idConstanciaDeAprobacion) {
        this.idConstanciaDeAprobacion = idConstanciaDeAprobacion;
    }

    @Basic
    @Column(name = "idDocumento")
    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    @Basic
    @Column(name = "codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Constanciadeaprobacion that = (Constanciadeaprobacion) o;
        return idConstanciaDeAprobacion == that.idConstanciaDeAprobacion &&
                idDocumento == that.idDocumento &&
                Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConstanciaDeAprobacion, idDocumento, codigo);
    }
}
