package pe.edu.unsch.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Juradocalificador {
    private int idJuradoCalificador;

    @Id
    @Column(name = "idJuradoCalificador")
    public int getIdJuradoCalificador() {
        return idJuradoCalificador;
    }

    public void setIdJuradoCalificador(int idJuradoCalificador) {
        this.idJuradoCalificador = idJuradoCalificador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Juradocalificador that = (Juradocalificador) o;
        return idJuradoCalificador == that.idJuradoCalificador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJuradoCalificador);
    }
}
