// default package
// Generated 13/06/2019 02:30:17 PM by Hibernate Tools 5.1.10.Final
package pe.edu.unsch.entities;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Documento generated by hbm2java
 */
@Entity
@Table(name = "documento", catalog = "tesisexperienciaprofesional")
public class Documento implements java.io.Serializable {

	private int idDocumento;
	private Date fecha;
	private Date hora;
	private String tipoDocumento;

	public Documento() {
	}

	public Documento(int idDocumento, Date fecha, Date hora, String tipoDocumento) {
		this.idDocumento = idDocumento;
		this.fecha = fecha;
		this.hora = hora;
		this.tipoDocumento = tipoDocumento;
	}

	@Id

	@Column(name = "idDocumento", unique = true, nullable = false)
	public int getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Fecha", nullable = false, length = 10)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora", nullable = false, length = 16)
	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	@Column(name = "tipoDocumento", nullable = false, length = 60)
	public String getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

}
