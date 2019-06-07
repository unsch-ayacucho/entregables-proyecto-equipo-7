package pe.edu.unsch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Consejofacultad {
    private int idConsejoFacultad;

    @Id
    @Column(name = "idConsejoFacultad")
    public int getIdConsejoFacultad() {
        return idConsejoFacultad;
    }

    public void setIdConsejoFacultad(int idConsejoFacultad) {
        this.idConsejoFacultad = idConsejoFacultad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consejofacultad that = (Consejofacultad) o;
        return idConsejoFacultad == that.idConsejoFacultad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConsejoFacultad);
    }
}
