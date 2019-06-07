package pe.edu.unsch.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Notadesustentacion {
    private int idNotaDeSustentacion;
    private int idJurado;
    private String codigo;
    private int calificacion;

    @Id
    @Column(name = "idNotaDeSustentacion")
    public int getIdNotaDeSustentacion() {
        return idNotaDeSustentacion;
    }

    public void setIdNotaDeSustentacion(int idNotaDeSustentacion) {
        this.idNotaDeSustentacion = idNotaDeSustentacion;
    }

    @Basic
    @Column(name = "idJurado")
    public int getIdJurado() {
        return idJurado;
    }

    public void setIdJurado(int idJurado) {
        this.idJurado = idJurado;
    }

    @Basic
    @Column(name = "codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "Calificacion")
    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notadesustentacion that = (Notadesustentacion) o;
        return idNotaDeSustentacion == that.idNotaDeSustentacion &&
                idJurado == that.idJurado &&
                calificacion == that.calificacion &&
                Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNotaDeSustentacion, idJurado, codigo, calificacion);
    }
}
