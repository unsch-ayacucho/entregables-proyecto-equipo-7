package pe.edu.unsch.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Bachiller {
    private String codigo;
    private String dni;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String escuela;
    private String email;
    private String telefono;

    @Id
    @Column(name = "codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "dni")
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellidoPaterno")
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    @Basic
    @Column(name = "apellidoMaterno")
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    @Basic
    @Column(name = "escuela")
    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bachiller bachiller = (Bachiller) o;
        return Objects.equals(codigo, bachiller.codigo) &&
                Objects.equals(dni, bachiller.dni) &&
                Objects.equals(nombre, bachiller.nombre) &&
                Objects.equals(apellidoPaterno, bachiller.apellidoPaterno) &&
                Objects.equals(apellidoMaterno, bachiller.apellidoMaterno) &&
                Objects.equals(escuela, bachiller.escuela) &&
                Objects.equals(email, bachiller.email) &&
                Objects.equals(telefono, bachiller.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, dni, nombre, apellidoPaterno, apellidoMaterno, escuela, email, telefono);
    }
}
