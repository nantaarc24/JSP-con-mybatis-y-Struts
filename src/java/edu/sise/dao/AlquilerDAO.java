/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sise.dao;

import edu.sise.entity.Alquiler;
import edu.sise.util.Conexion;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 *
 * @author fclou
 */
public class AlquilerDAO {
    
    SqlSessionFactory ssf = Conexion.conectar();
    
    public boolean agregar(Alquiler alquiler){
        boolean resultado = false;
        SqlSession session = ssf.openSession();
        try {
            session.insert("agregarAlquiler", alquiler);
            session.commit();
            resultado = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        session.close();
        return resultado;
    }
    
    public List<Alquiler> listar(){
        List<Alquiler> lstAlquileres = null;
        SqlSession session = ssf.openSession();
        try {
            lstAlquileres = session.selectList("listarAlquileres");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        session.close();
        return lstAlquileres;
    }
    

    
}
