package pe.edu.unsch.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Actadessustentacion {
    private int idActaDeSustentacion;
    private int idDocumento;
    private int idJuradoCalificador;
    private int idNotaDeSustentacion;
    private String codigo;

    @Id
    @Column(name = "idActaDeSustentacion")
    public int getIdActaDeSustentacion() {
        return idActaDeSustentacion;
    }

    public void setIdActaDeSustentacion(int idActaDeSustentacion) {
        this.idActaDeSustentacion = idActaDeSustentacion;
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
    @Column(name = "idJuradoCalificador")
    public int getIdJuradoCalificador() {
        return idJuradoCalificador;
    }

    public void setIdJuradoCalificador(int idJuradoCalificador) {
        this.idJuradoCalificador = idJuradoCalificador;
    }

    @Basic
    @Column(name = "idNotaDeSustentacion")
    public int getIdNotaDeSustentacion() {
        return idNotaDeSustentacion;
    }

    public void setIdNotaDeSustentacion(int idNotaDeSustentacion) {
        this.idNotaDeSustentacion = idNotaDeSustentacion;
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
        Actadessustentacion that = (Actadessustentacion) o;
        return idActaDeSustentacion == that.idActaDeSustentacion &&
                idDocumento == that.idDocumento &&
                idJuradoCalificador == that.idJuradoCalificador &&
                idNotaDeSustentacion == that.idNotaDeSustentacion &&
                Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idActaDeSustentacion, idDocumento, idJuradoCalificador, idNotaDeSustentacion, codigo);
    }
}
