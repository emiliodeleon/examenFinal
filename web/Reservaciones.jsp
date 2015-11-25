<%-- 
    Document   : Reservaciones
    Created on : Nov 5, 2015, 11:12:30 PM
    Author     : sea_hack
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
    <center><h1> Reservación </h1></center>
     <table align="center">
    <form id="form1" name="form1" method="post" action="Reservaciones">
        <tr> <td> Nombre:</td> </tr> <tr> <td><input type="text" name="nombre_reservacion"></td> </tr><br>
        <tr> <td> Fecha:</td> </tr> <tr> <td><input type="text" name="fecha_reservacion"></td> </tr><br>
        <tr> <td><input type="submit" value="Validar fecha" /></td> </tr><br>
     
        <tr> <td><label for="fafds">Número de comensales</label></td></tr> <br/>
        <tr><td>      <select id="comensales" name="comensales">
<optgroup label="Comensales">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option> 

</optgroup></td></tr>
        <tr><td><input type="submit" value="Hacer reservación" /></td></tr>
        <td align = "right"> <input type="submit" value="Atrás" onclick="window.open('ClientesLogin.jsp')" /> <br><br>
    </form>  
    </body>
    
</html>