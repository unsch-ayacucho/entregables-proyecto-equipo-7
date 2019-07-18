package pe.edu.unsch.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.unsch.entities.Decano;

@Repository("decanoRepository")
public interface DecanoDao extends CrudRepository<Decano, String> {
}
