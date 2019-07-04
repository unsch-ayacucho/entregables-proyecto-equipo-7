package pe.edu.unsch.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Solicitud;

@Repository("solicitudRepository")
public interface SolicitudRepository extends CrudRepository<Solicitud, Integer> {

}
