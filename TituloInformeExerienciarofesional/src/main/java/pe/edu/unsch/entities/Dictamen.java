package pe.edu.unsch.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Dictamen {
    private int idDictamen;
    private int idDocumento;
    private int idCominsionDictaminadora;

    @Id
    @Column(name = "idDictamen")
    public int getIdDictamen() {
        return idDictamen;
    }

    public void setIdDictamen(int idDictamen) {
        this.idDictamen = idDictamen;
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
    @Column(name = "idCominsionDictaminadora")
    public int getIdCominsionDictaminadora() {
        return idCominsionDictaminadora;
    }

    public void setIdCominsionDictaminadora(int idCominsionDictaminadora) {
        this.idCominsionDictaminadora = idCominsionDictaminadora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dictamen dictamen = (Dictamen) o;
        return idDictamen == dictamen.idDictamen &&
                idDocumento == dictamen.idDocumento &&
                idCominsionDictaminadora == dictamen.idCominsionDictaminadora;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDictamen, idDocumento, idCominsionDictaminadora);
    }
}
