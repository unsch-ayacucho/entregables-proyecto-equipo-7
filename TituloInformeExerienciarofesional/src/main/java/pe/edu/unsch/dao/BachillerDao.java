package pe.edu.unsch.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.unsch.entities.Bachiller;

@Repository("bachillerRepository")
public interface BachillerDao extends CrudRepository<Bachiller,String> {
}
