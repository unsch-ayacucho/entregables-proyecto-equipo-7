package pe.edu.unsch.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
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

	@Override
	public String generateReport(Solicitud solicitud){
		try {
			String reportPath = "C:\\reportes";
			// Compile the Jasper report from .jrxml to .japser
			JasperReport jasperReport = JasperCompileManager.compileReport(reportPath +  "\\tesis_solicitud.jrxml");
			//JasperReport jasperReport1 = new JasperReport();
			// Get your data source
			JRBeanCollectionDataSource jrBeanCollectionDataSource = new JRBeanCollectionDataSource(null);
			//JRBeanCollectionDataSource jrBeanCollectionDataSource = null;

			// Add parameters
			Map<String, Object> params = new HashMap<>();
			params.put("strNombreDecano", solicitud.getDecano().getNombreCompleto());
			params.put("strNombreBachiller", solicitud.getBachiller().getNombreCompleto());
			params.put("strDniBachiller", solicitud.getBachiller().getDni());
			params.put("strCodigoBachiller", solicitud.getBachiller().getCodigo());
			params.put("strDireccionBachiller", "direccion xxx xxx ");
			params.put("strFechaLugarSolicitud", "Ayacucho ");
			// Fill the report,
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params);
			// Export the report to a PDF file
			JasperExportManager.exportReportToPdfFile(jasperPrint, reportPath + "\\tesis_solicitud.pdf");

			System.out.println("Done");

			//return "Report successfully generated @path= " + reportPath;
			return reportPath+ "\\tesis_solicitud.pdf";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
}
