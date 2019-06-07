package pe.edu.unsch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Presidentecomisionacademina {
    private int idPresidenteComisionAcademina;

    @Id
    @Column(name = "idPresidenteComisionAcademina")
    public int getIdPresidenteComisionAcademina() {
        return idPresidenteComisionAcademina;
    }

    public void setIdPresidenteComisionAcademina(int idPresidenteComisionAcademina) {
        this.idPresidenteComisionAcademina = idPresidenteComisionAcademina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Presidentecomisionacademina that = (Presidentecomisionacademina) o;
        return idPresidenteComisionAcademina == that.idPresidenteComisionAcademina;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPresidenteComisionAcademina);
    }
}
