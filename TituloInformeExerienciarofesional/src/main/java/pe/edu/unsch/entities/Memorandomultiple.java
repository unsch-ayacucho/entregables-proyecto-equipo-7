// default package
// Generated 13/06/2019 02:30:17 PM by Hibernate Tools 5.1.10.Final
package pe.edu.unsch.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Memorandomultiple generated by hbm2java
 */
@Entity
@Table(name = "memorandomultiple", catalog = "tesisexperienciaprofesional")
public class Memorandomultiple implements java.io.Serializable {

	private int idMemorandoMultiple;
	private int idDocumento;

	public Memorandomultiple() {
	}

	public Memorandomultiple(int idMemorandoMultiple, int idDocumento) {
		this.idMemorandoMultiple = idMemorandoMultiple;
		this.idDocumento = idDocumento;
	}

	@Id

	@Column(name = "idMemorandoMultiple", unique = true, nullable = false)
	public int getIdMemorandoMultiple() {
		return this.idMemorandoMultiple;
	}

	public void setIdMemorandoMultiple(int idMemorandoMultiple) {
		this.idMemorandoMultiple = idMemorandoMultiple;
	}

	@Column(name = "idDocumento", nullable = false)
	public int getIdDocumento() {
		return this.idDocumento;
	}

	public void setIdDocumento(int idDocumento) {
		this.idDocumento = idDocumento;
	}

}
