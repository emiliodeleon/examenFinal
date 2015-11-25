<%-- 
    Document   : ClientesLogin
    Created on : 16/11/2015, 02:36:49 PM
    Author     : sony valle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table align="center">
            <tr><td><h1>Clientes</h1></td></tr>
        <form id="form1" name="form1" method="post" action="">
            <br>    
            <tr><td><input type="submit" value="Ingresar Pedido" onclick="window.open('Pedidos.jsp')" /></td></tr> <br><br>
            <tr><td><input type="submit" value="Hacer Reservación" onclick="window.open('Reservaciones.jsp')" /></td></tr> <br><br>
            <tr><td><input type="submit" value="Consultar Cuenta" onclick="window.open('cuentas.jsp')" /></td></tr> <br>
         </table>
    </body>
</html>
