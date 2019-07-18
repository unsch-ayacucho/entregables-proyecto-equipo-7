package pe.edu.unsch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.unsch.dao.SolicitudRepository;
import pe.edu.unsch.entities.Documento;
import pe.edu.unsch.entities.Solicitud;
import pe.edu.unsch.service.GenerarSolicitudService;

import javax.validation.Valid;
@CrossOrigin(origins = "*")@RestController
@Controller
@RequestMapping("views/generarDocumento")
public class GenerarSolicitudController {


    @Autowired
    private GenerarSolicitudService generarSolicitudService;

    @Autowired
    @Qualifier("solicitudRepository")
    private SolicitudRepository solicitudRepository;


    @GetMapping("views/listar")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("views/admin/generarSolicitud/index");
        System.out.println("lista solicitud " + generarSolicitudService.getSolicitud());
        mv.addObject("listaSolcicitud", generarSolicitudService.getSolicitud());
        return mv;
    }


    @GetMapping("views/solicitud")
    public ModelAndView mantenimiento(@ModelAttribute("solicitud") Solicitud solicitud) {
        ModelAndView mv = new ModelAndView("views/admin/generarSolicitud/mantenimiento");
        mv.addObject("solicitudObject", solicitud);
        mv.addObject("idDoc", 1);
        return mv;
    }

    @PostMapping("/SaveDoc")
    public ModelAndView save(@Valid Solicitud solicitud, BindingResult result, String single_cal3) {
        Documento doc = new Documento();
        doc.setIdDocumento(1);
        solicitud.setDocumento(doc);

        //persona.setNombreCompleto(persona.getNombres() + " " + persona.getApellidos());
        solicitudRepository.save(solicitud);
        return index();
    }


    @GetMapping("/EditVisitaDomiciliaria/{idSolicitud}")
    public ModelAndView edit(@PathVariable("idSolicitud") int id) {
        return mantenimiento(solicitudRepository.findById(id).get());
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/report/{idSolicitud}")
    public String empReport(@PathVariable("idSolicitud") int idSolicitud) {
        Solicitud solicitud = (Solicitud) solicitudRepository.findById(idSolicitud).get();
        return generarSolicitudService.generateReport(solicitud );
    }


   /*@Bean
    @Qualifier("ReportX")
    public JasperReportsPdfView reportX() {
        JasperReportsPdfView v = new JasperReportsPdfView();
        v.setUrl("classpath:reportes/tesis_solicitud.jasper");
        v.setReportDataKey("datasource");
        return v;
    }

    @Autowired @Qualifier("ReportX")
    private JasperReportsPdfView reportX;


    @RequestMapping(value = "IncidenciaBI", method = RequestMethod.GET)
    public ModelAndView getRptX(ModelAndView modelAndView) {
        Map<String, Object> parameterMap = new HashMap<>();
        //parameterMap.put("datasource",dbsoruce);
        parameterMap.put("datasource",null);
        modelAndView = new ModelAndView(reportX, parameterMap);
        return modelAndView;
    }

*/

/*

    @Autowired
    private ApplicationContext appContext;

    @GetMapping( "/pdf")
    public ModelAndView report() {

        JRViewer view = new JRViewer();
        view.setUrl("classpath:reportes/tesis_solicitud.jrxml");
        view.setApplicationContext(appContext);

        Map<String, Object> params = new HashMap<>();
        params.put("datasource", null);

        params.put("strNombreDecano", "decano decano decano ");
        params.put("strNombreBachiller", "bachiller bachiller bachiller");
        params.put("strDniBachiller", "52548954");
        params.put("strCodigoBachiller", "70905469");
        params.put("strDireccionBachiller", "direccion xxx ");
        params.put("strFechaLugarSolicitud", "nnn");

        return new ModelAndView(view, params);
    }

*/


}
