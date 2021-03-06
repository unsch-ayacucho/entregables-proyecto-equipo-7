package pe.edu.unsch.entities;
// Generated 23/06/2019 06:32:43 PM by Hibernate Tools 4.3.5.Final

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Decano generated by hbm2java
 */
@Entity
@Table(name = "decano", catalog = "tesisexperienciaprofesional")
public class Decano implements java.io.Serializable {

	/*@Override
	public String toString() {
		return "Decano [dni=" + dni + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", email=" + email + ", telefono=" + telefono
				+ ", nombreCompleto=" + nombreCompleto + ", solicituds=" + solicituds + "]";
	}*/

	private String dni;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String email;
	private String telefono;
	private String nombreCompleto;
	@JsonIgnore
	private Set<Solicitud> solicituds = new HashSet<Solicitud>(0);

	public Decano() {
	}

	public Decano(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String email,
			String telefono, String nombreCompleto) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.email = email;
		this.telefono = telefono;
		this.nombreCompleto = nombreCompleto;
	}

	public Decano(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, String email,
			String telefono, String nombreCompleto, Set<Solicitud> solicituds) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.email = email;
		this.telefono = telefono;
		this.nombreCompleto = nombreCompleto;
		this.solicituds = solicituds;
	}

	@Id

	@Column(name = "dni", unique = true, nullable = false, length = 8)
	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Column(name = "nombre", nullable = false, length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apellidoPaterno", nullable = false, length = 50)
	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	@Column(name = "apellidoMaterno", nullable = false, length = 50)
	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	@Column(name = "email", nullable = false, length = 60)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "telefono", nullable = false, length = 9)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "nombreCompleto", nullable = false, length = 500)
	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "decano")
	public Set<Solicitud> getSolicituds() {
		return this.solicituds;
	}

	public void setSolicituds(Set<Solicitud> solicituds) {
		this.solicituds = solicituds;
	}

	public Decano(String dni,String nombreCompleto){
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
	}

}
