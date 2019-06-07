package pe.edu.unsch.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Resoluciondecanal {
    private int idResolucionDecanal;
    private int idDocumento;

    @Id
    @Column(name = "idResolucionDecanal")
    public int getIdResolucionDecanal() {
        return idResolucionDecanal;
    }

    public void setIdResolucionDecanal(int idResolucionDecanal) {
        this.idResolucionDecanal = idResolucionDecanal;
    }

    @Basic
    @Column(name = "idDocumento")
    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resoluciondecanal that = (Resoluciondecanal) o;
        return idResolucionDecanal == that.idResolucionDecanal &&
                idDocumento == that.idDocumento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idResolucionDecanal, idDocumento);
    }
}
