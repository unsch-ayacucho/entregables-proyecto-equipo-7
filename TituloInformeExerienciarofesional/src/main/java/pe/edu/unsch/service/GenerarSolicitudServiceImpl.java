package pe.edu.unsch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsch.dao.GenerarSolicitudDao;
import pe.edu.unsch.entities.*;


@Service
public class GenerarSolicitudServiceImpl implements GenerarSolicitudService {

	@Autowired
	private GenerarSolicitudDao generarSolicitudDAO;

	@Override
	public Solicitud getSolicitudById(int idSolicitud) {
		Solicitud oSol = generarSolicitudDAO.getSolicitudById(idSolicitud);
		return oSol;
	}

	@Override
	public List<Solicitud> getSolicitud() {
		return generarSolicitudDAO.getSolicitud();
	}

	@Override
	public synchronized boolean addSolicitud(Solicitud solicitud) {
		if (generarSolicitudDAO.SolicitudExists(solicitud.getBachiller(), solicitud.getDecano(), solicitud.getDocumento())) {
			return false;
		} else {
			generarSolicitudDAO.addSolicitud(solicitud);
			return true;
		}
	}

	@Override
	public void updateSolicitud(Solicitud solicitud) {
		generarSolicitudDAO.updateSolicitud(solicitud);
	}

	@Override
	public void deleteSolicitud(int idSolicitud) {
		generarSolicitudDAO.deleteSolicitud(idSolicitud);
	}
}
