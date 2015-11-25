<%-- 
    Document   : MeseroLogin
    Created on : 16/11/2015, 04:33:44 PM
    Author     : sony valle
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
        <h1 align="left">Mesero_Login</h1>
        <table align="left">
            
        <tr><td><input type="submit" value="Ingresar a pedidos" onclick="window.open('Pedidos.jsp')" /></td></tr>
        <tr><td><input type="submit" value="Ingresar a cuentas" onclick="window.open('cuentas.jsp')" /></td></tr>
        <tr><td><input type="submit" value="Ingresar a reservaciones" onclick="window.open('Reservaciones.jsp')" /></td></tr>
        </table>
    </body>
</html>