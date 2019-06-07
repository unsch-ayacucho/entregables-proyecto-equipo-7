package pe.edu.unsch.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Memorandomultiple {
    private int idMemorandoMultiple;
    private int idDocumento;

    @Id
    @Column(name = "idMemorandoMultiple")
    public int getIdMemorandoMultiple() {
        return idMemorandoMultiple;
    }

    public void setIdMemorandoMultiple(int idMemorandoMultiple) {
        this.idMemorandoMultiple = idMemorandoMultiple;
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
        Memorandomultiple that = (Memorandomultiple) o;
        return idMemorandoMultiple == that.idMemorandoMultiple &&
                idDocumento == that.idDocumento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMemorandoMultiple, idDocumento);
    }
}
