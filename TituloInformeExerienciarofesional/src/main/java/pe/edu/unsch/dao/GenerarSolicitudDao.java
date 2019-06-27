
package pe.edu.unsch.dao;
import java.util.List;
import pe.edu.unsch.entities.*;

public interface GenerarSolicitudDao {
	List<Solicitud> getSolicitud();
	Solicitud getSolicitudById(int idSolicitud);
    void addSolicitud(Solicitud solicitud);
    void updateSolicitud(Solicitud solicitud);

	void deleteSolicitud(int idSolicitud);
    boolean SolicitudExists(Bachiller bachiller, Decano decano, Documento documento );
	
}
