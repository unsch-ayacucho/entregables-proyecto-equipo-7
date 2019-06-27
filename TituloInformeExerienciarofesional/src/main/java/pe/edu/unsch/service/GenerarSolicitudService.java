package pe.edu.unsch.service;

import java.util.List;

import pe.edu.unsch.entities.*;

public interface GenerarSolicitudService {
	
	List<Solicitud> getSolicitud();

	Solicitud getSolicitudById(int idSolicitud);

	boolean addSolicitud(Solicitud solicitud);

	void updateSolicitud(Solicitud Solicitud);

	void deleteSolicitud(int idSolicitud);

}
