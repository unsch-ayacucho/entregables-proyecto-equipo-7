package pe.edu.unsch.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.unsch.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

	public Usuario findByUsuario(String usuario);
}
