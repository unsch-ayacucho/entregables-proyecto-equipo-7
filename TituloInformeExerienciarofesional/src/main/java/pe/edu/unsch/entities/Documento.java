package pe.edu.unsch.entities;
// Generated 23/06/2019 06:32:43 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Documento generated by hbm2java
 */
@Entity
@Table(name = "documento", catalog = "tesisexperienciaprofesional")
public class Documento implements java.io.Serializable {


	private Integer idDocumento;
	private String tipoDocumento;
	private String descripcion;
	private Set<Solicitud> solicituds = new HashSet<Solicitud>(0);

	public Documento() {
	}

	public Documento(String tipoDocumento, String descripcion) {
		this.tipoDocumento = tipoDocumento;
		this.descripcion = descripcion;
	}

	public Documento(String tipoDocumento, String descripcion, Set<Solicitud> solicituds) {
		this.tipoDocumento = tipoDocumento;
		this.descripcion = descripcion;
		this.solicituds = solicituds;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idDocumento", unique = true, nullable = false)
	public Integer getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	@Column(name = "tipoDocumento", nullable = false, length = 250)
	public String getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	@Column(name = "descripcion", nullable = false, length = 500)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "documento")
	public Set<Solicitud> getSolicituds() {
		return this.solicituds;
	}

	public void setSolicituds(Set<Solicitud> solicituds) {
		this.solicituds = solicituds;
	}
	
	/*@Override
	public String toString() {
		return "Documento [idDocumento=" + idDocumento + ", tipoDocumento=" + tipoDocumento + ", descripcion="
				+ descripcion + ", solicituds=" + solicituds + "]";
	}*/

}
