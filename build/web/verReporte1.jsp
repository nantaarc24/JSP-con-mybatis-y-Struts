<%-- 
    Document   : verAutos
    Created on : 09-abr-2018, 19:22:25
    Author     : Administrador
--%>

<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Reporte</title>
    </head>
    <body>
        <div class="principal">
            <div class="encabezado"></div>
            <div class="menu">
                <ul class="listas">
                    <li><a href="agregarAlquiler.jsp">Agregar Alquiler</a></li>
                    <li><a href="mostrarAlquileres">Mostrar Alquiler</a></li>
                    <li><a href="verReporte2.jsp">Reporte 2</a></li>
                </ul>

            </div>
            <div class="contenido">
                <div class="contenedor">
                    <div class="titulo">Reporte 1</div>
                    <div class="tablaFrm">

                        <s:form action="verReporte">

                            <s:submit value="Ver Reporte"></s:submit>
                        </s:form>

                    </div>
                </div>
            </div>

        </div>
    </body>
</html>
