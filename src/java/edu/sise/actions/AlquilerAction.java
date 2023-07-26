/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sise.actions;

import com.opensymphony.xwork2.ActionSupport;
import edu.sise.dao.AlquilerDAO;
import edu.sise.entity.Alquiler;
import java.util.List;


/**
 *
 * @author fclou
 */
public class AlquilerAction extends ActionSupport{
    
private Alquiler alquiler;
private List<Alquiler> lstAlquileres;

AlquilerDAO alquilerdao = new AlquilerDAO();


public String agregarAlquiler(){
        if (alquilerdao.agregar(alquiler)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    
    public String mostrarAlquileres(){
        
        lstAlquileres= alquilerdao.listar();
        return SUCCESS;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public List<Alquiler> getLstAlquileres() {
        return lstAlquileres;
    }

    public void setLstAlquileres(List<Alquiler> lstAlquileres) {
        this.lstAlquileres = lstAlquileres;
    }

   


    
    
}
