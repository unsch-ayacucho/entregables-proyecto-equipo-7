package pe.edu.unsch.entities;
// Generated 13/06/2019 07:12:27 PM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Juradocalificador generated by hbm2java
 */
@Entity
@Table(name = "juradocalificador", catalog = "tesisexperienciaprofesional")
public class Juradocalificador implements java.io.Serializable {

	private int idJuradoCalificador;

	public Juradocalificador() {
	}

	public Juradocalificador(int idJuradoCalificador) {
		this.idJuradoCalificador = idJuradoCalificador;
	}

	@Id

	@Column(name = "idJuradoCalificador", unique = true, nullable = false)
	public int getIdJuradoCalificador() {
		return this.idJuradoCalificador;
	}

	public void setIdJuradoCalificador(int idJuradoCalificador) {
		this.idJuradoCalificador = idJuradoCalificador;
	}

}
