/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sise.actions;

import com.opensymphony.xwork2.ActionSupport;
import edu.sise.dao.ReporteDAO;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletResponseAware;

/**
 *
 * @author Fernando Tapia Arcos
 */
public class ReporteAction extends ActionSupport implements ServletResponseAware{

    private HttpServletResponse response;
    private String nombreAuto;
    
    ReporteDAO reportedao=new ReporteDAO();
    
    public String verReporte(){
        
        try {
            String nombre=ServletActionContext.getServletContext().getRealPath("/")+"/reportes/mostrarAlquileres.jasper";
            
            JasperPrint reporteLleno= reportedao.obtenerReporte(nombre, null);
            
            JRPdfExporter ex= new JRPdfExporter();
            ex.setParameter(JRExporterParameter.JASPER_PRINT, reporteLleno);
            ex.setParameter(JRExporterParameter.OUTPUT_STREAM, response.getOutputStream());
            ex.exportReport();
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
        
        return null;
    }
    
    @Override
    public void setServletResponse(HttpServletResponse hsr) {

        response= hsr;
    }
    
        public String verReporte2(){
        
        try {
            String nombre=ServletActionContext.getServletContext().getRealPath("/")+"/reportes/AlquilerXAuto.jasper";
            
            Map parametros = new HashMap();
            parametros.put("PAuto", nombreAuto);
            
            JasperPrint reporteLleno= reportedao.obtenerReporte(nombre, parametros);
            
            JRPdfExporter ex= new JRPdfExporter();
            ex.setParameter(JRExporterParameter.JASPER_PRINT, reporteLleno);
            ex.setParameter(JRExporterParameter.OUTPUT_STREAM, response.getOutputStream());
            ex.exportReport();
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
        
        return null;
    }

    public String getNombreAuto() {
        return nombreAuto;
    }

    public void setNombreAuto(String nombreAuto) {
        this.nombreAuto = nombreAuto;
    }
    
    
}
