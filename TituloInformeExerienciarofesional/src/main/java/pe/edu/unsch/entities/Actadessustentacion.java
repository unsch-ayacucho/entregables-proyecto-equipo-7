package pe.edu.unsch.entities;
// Generated 13/06/2019 07:12:27 PM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Actadessustentacion generated by hbm2java
 */
@Entity
@Table(name = "actadessustentacion", catalog = "tesisexperienciaprofesional")
public class Actadessustentacion implements java.io.Serializable {

	private int idActaDeSustentacion;
	private int idDocumento;
	private int idJuradoCalificador;
	private int idNotaDeSustentacion;
	private String codigo;

	public Actadessustentacion() {
	}

	public Actadessustentacion(int idActaDeSustentacion, int idDocumento, int idJuradoCalificador,
			int idNotaDeSustentacion, String codigo) {
		this.idActaDeSustentacion = idActaDeSustentacion;
		this.idDocumento = idDocumento;
		this.idJuradoCalificador = idJuradoCalificador;
		this.idNotaDeSustentacion = idNotaDeSustentacion;
		this.codigo = codigo;
	}

	@Id

	@Column(name = "idActaDeSustentacion", unique = true, nullable = false)
	public int getIdActaDeSustentacion() {
		return this.idActaDeSustentacion;
	}

	public void setIdActaDeSustentacion(int idActaDeSustentacion) {
		this.idActaDeSustentacion = idActaDeSustentacion;
	}

	@Column(name = "idDocumento", nullable = false)
	public int getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

	@Column(name = "idJuradoCalificador", nullable = false)
	public int getIdJuradoCalificador() {
		return this.idJuradoCalificador;
	}

	public void setIdJuradoCalificador(int idJuradoCalificador) {
		this.idJuradoCalificador = idJuradoCalificador;
	}

	@Column(name = "idNotaDeSustentacion", nullable = false)
	public int getIdNotaDeSustentacion() {
		return this.idNotaDeSustentacion;
	}

	public void setIdNotaDeSustentacion(int idNotaDeSustentacion) {
		this.idNotaDeSustentacion = idNotaDeSustentacion;
	}

	@Column(name = "codigo", nullable = false, length = 8)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
