package pe.edu.unsch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Comisiondictaminadora {
    private int idComisionDictaminadora;

    @Id
    @Column(name = "idComisionDictaminadora")
    public int getIdComisionDictaminadora() {
        return idComisionDictaminadora;
    }

    public void setIdComisionDictaminadora(int idComisionDictaminadora) {
        this.idComisionDictaminadora = idComisionDictaminadora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comisiondictaminadora that = (Comisiondictaminadora) o;
        return idComisionDictaminadora == that.idComisionDictaminadora;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComisionDictaminadora);
    }
}
