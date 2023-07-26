/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sise.util;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class Conexion {
    
    public static SqlSessionFactory conectar(){
        SqlSessionFactory ssf = null;
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            ssf = new SqlSessionFactoryBuilder().build(is);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return ssf;
    }
    
}
