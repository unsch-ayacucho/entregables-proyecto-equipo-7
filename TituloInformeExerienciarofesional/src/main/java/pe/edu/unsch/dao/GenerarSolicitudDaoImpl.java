package pe.edu.unsch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Bachiller;
import pe.edu.unsch.entities.Decano;
import pe.edu.unsch.entities.Documento;
import pe.edu.unsch.entities.Solicitud;

@Repository("GenerarSolicitudDao")
public class GenerarSolicitudDaoImpl implements GenerarSolicitudDao {
	
	@PersistenceContext	
	private EntityManager entityManager;	
	@Override
	public Solicitud getSolicitudById(int idSolicitud) {
		return entityManager.find(Solicitud.class, idSolicitud);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Solicitud> getSolicitud() {
		String hql = "FROM Solicitud as solic ORDER BY solic.idSolicitud";
		return (List<Solicitud>) entityManager.createQuery(hql).getResultList();
	}	
	@Override
	public void addSolicitud(Solicitud solicitud) {
		entityManager.persist(solicitud);
	}
	
	@Override
	public void updateSolicitud(Solicitud solicitud) {
		Solicitud solic = getSolicitudById(solicitud.getIdSolicitud());
		solic.setDecano(solicitud.getDecano());
		solic.setBachiller(solicitud.getBachiller());
		solic.setDocumento(solicitud.getDocumento());
		entityManager.flush();
	}
	@Override
	public void deleteSolicitud(int idSolicitud) {
		entityManager.remove(getSolicitudById(idSolicitud));
	}
	@Override
	public boolean SolicitudExists(Bachiller bachiller, Decano decano, Documento documento ) {
		String hql = "FROM Solicitud as solic WHERE solic.bachiller = ? and solic.decano = ? and solic.documento = ?";
		int count = entityManager.createQuery(hql).setParameter(1, bachiller)
		              .setParameter(2, decano).setParameter(3, documento).getResultList().size();
		return count > 0 ? true : false;
	}

}




