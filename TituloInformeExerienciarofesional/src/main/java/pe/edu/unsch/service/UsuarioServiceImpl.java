package pe.edu.unsch.service;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.unsch.dao.UsuarioRepository;
import pe.edu.unsch.entities.Perfil;
import pe.edu.unsch.entities.Usuario;
import pe.edu.unsch.entities.UsuarioPerfil;

@Service("usuarioService")
public class UsuarioServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = usuarioRepository.findByUsuario(username);
		if (user == null) throw new UsernameNotFoundException(username);
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		for (UsuarioPerfil usuarioPerfil : user.getUsuarioPerfils()){
		Perfil perfil = usuarioPerfil.getPerfil();
		grantedAuthorities.add(new SimpleGrantedAuthority(perfil.getNombre()));
		}
		return new org.springframework.security.core.userdetails.User(user.getUsuario(), user.getPassword(), grantedAuthorities);
	}

	
	
}










