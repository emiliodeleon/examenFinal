<%-- 
    Document   : cuentas
    Created on : Nov 4, 2015, 10:35:02 PM
    Author     : sea_hack
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background="sources/fondo2.jpg">
        <table>
		<style type="text/css">
			
			* {
				margin:0px;
				padding:0px;
			}
			
			#header {
				margin:auto;
				width:500px;
				font-family:Arial, Helvetica, sans-serif;
			}
			
			ul, ol {
				list-style:none;
			}
			
			.nav > li {
				float:left;
			}
			
			.nav li a {
				background-color:#A4A4A4;
				color:#fff;
				text-decoration:none;
				padding:10px 12px;
				display:block;
			}
			
			.nav li a:hover {
				background-color:#FF8000;
			}
			
			.nav li ul {
				display:none;
				position:absolute;
				min-width:140px;
			}
			
			.nav li:hover > ul {
				display:block;
			}
			
			.nav li ul li {
				position:relative;
			}
			
			.nav li ul li ul {
				right:-140px;
				top:0px;
			}
			
		</style>
	</head>
	<body>
		<div id="header">
			<ul class="nav">
				<li><a onclick=window.open('main.jsp')>Inicio</a></li>
				<li><a href="">Menu</a>
					<ul>
						<li><a href="">Entradas</a></li>
						<li><a href="">Postres</a></li>
						<li><a href="">Ensaladas</a></li>
						<li><a href="">Plato fuerte</a>
						<li><a href="">Vinos y licores</a>
							<ul>
								<li><a href="">Cabernets sauvignon</a></li>
								<li><a href="">Tempranillos</a></li>
								<li><a href="">Licores de crema</a></li>
								
							</ul>
						</li>
					</ul>
				</li>
				<li><a href="">Acerca de</a>
					<ul>
						<li><a href="">Bussiness Unit</a></li>
						<li><a href="">Historia</a></li>

					</ul>
				</li>
				<li><a href="">Contacto</a></li>
			</ul>
		</div>
</table>
        	<div style="text-align:center;">
	<table>
		<br></br>
		<br></br>		
		<td><tr><H1><img src="sources/elbueno.jpg"></H1></tr></td>
		
	</table>
	</div>
        <h1>Cuentas</h1>

        <table>
        <form id="form3" name="form1" method="post" action="cuentas">      
        <tr><td align="left">Nueva Cuenta:<input type="text" name="nueva_cuenta"></td>></tr>
        <tr><td><input type="submit" value="Submit"  onclick= window.open('ClientesLogin.jsp')/></td></tr>
        <tr><td align="left">Altas:<input type="text" name="altas"></td></tr>
        <tr><td><input type="submit" value="Altas" /></td></tr>
        <tr><td align="left">Bajas:<input type="text" name="bajas"></td></tr>
        <tr><td><input type="submit" value="Bajas" /></td></tr>
        <tr><td><input type="submit" value="Back" onclick="window.open('MeseroLogin.jsp')" /></td></tr>
        
        
        </form>

        </table>
    </body>
</html>
