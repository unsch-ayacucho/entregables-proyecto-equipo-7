package pe.edu.unsch.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tituloprofesional {
    private int idTituloProfesional;
    private String codigo;
    private int idResolucionDecanal;

    @Id
    @Column(name = "idTituloProfesional")
    public int getIdTituloProfesional() {
        return idTituloProfesional;
    }

    public void setIdTituloProfesional(int idTituloProfesional) {
        this.idTituloProfesional = idTituloProfesional;
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
    @Column(name = "idResolucionDecanal")
    public int getIdResolucionDecanal() {
        return idResolucionDecanal;
    }

    public void setIdResolucionDecanal(int idResolucionDecanal) {
        this.idResolucionDecanal = idResolucionDecanal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tituloprofesional that = (Tituloprofesional) o;
        return idTituloProfesional == that.idTituloProfesional &&
                idResolucionDecanal == that.idResolucionDecanal &&
                Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTituloProfesional, codigo, idResolucionDecanal);
    }
}
