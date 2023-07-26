<%-- 
    Document   : frmAlquiler
    Created on : 09-abr-2018, 19:24:52
    Author     : Administrador
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Alquiler</title>
    </head>
    <body>
        <div class="principal">
            <div class="encabezado"></div>
            <div class="menu">
                <ul class="listas">
                    <li><a href="agregarAlquiler.jsp">Agregar Alquiler</a></li>
                    <li><a href="mostrarAlquileres">Mostrar Alquiler</a></li>
                 
                    <li><a href="verReporte1.jsp">Reporte 1</a></li>
                    <li><a href="verReporte2.jsp">Reporte 2</a></li>

                </ul>
            </div>
            <div class="contenido">
                <div class="titulo">Agregar Alquiler</div>

                <div  class="tablaFrm">
                    
                    <s:form action="agregarAlquiler">
                        <s:textfield label="DNI Conductor" name="alquiler.dniConductor"></s:textfield>
                        <s:select label="Auto" list="#{'Nissan Sentra':'Nissan Sentra','Toyota Corolla':'Toyota Corolla','Toyota Yaris':'Toyota Yaris','Mazda 3':'Mazda 3'}" name="alquiler.auto"></s:select>
                        <s:textfield label="Fecha" name="alquiler.fecha"></s:textfield>
                        <s:textfield label="Dias Alquilados" name="alquiler.diasAlquiler"></s:textfield>
                        <s:textfield label="Precio por Dia" name="alquiler.precioDia"></s:textfield>
                        
                        <s:submit value="Agregar"></s:submit>
                    </s:form>
                    
                </div>



            </div>
        </div>
    </body>
</html>
