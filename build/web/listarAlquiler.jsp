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
        <title>Ver Alquileres</title>
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
                <div class="titulo">Ver Alquiler</div>

                <table class="tablaDatos">
                    <tr>
                        <th>Codigo</th>
                        <th>DNI</th>
                        <th>Auto</th>
                        <th>Fecha</th>
                        <th>Dias</th>
                        <th>Precio</th>
                    </tr>

                    <s:iterator value="lstAlquileres">
                        <tr>
                            <td><s:property value="codigo"></s:property></td>
                            <td><s:property value="dniConductor"></s:property></td>
                            <td><s:property value="auto"></s:property></td>
                            <td><s:property value="fecha"></s:property></td>
                            <td><s:property value="diasAlquiler"></s:property></td>
                            <td><s:property value="precioDia"></s:property></td>
                            </tr>

                    </s:iterator>

                </table>
            </div>
        </div>
    </body>
</html>
