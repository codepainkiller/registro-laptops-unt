<%@page import="entities.Usuario"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prueba Bean</title>
</head>
<body>
	
	<button id="actualizar">Actualizar</button>
	<div id="contenido">
		
	</div>
	
	<script src="assets/plugins/jquery/dist/jquery.min.js"></script>
	
	<script type="text/javascript">
		$(document).ready( function() {
			$('#actualizar').click( function(event) {
				
				$.get("ListaUsuariosServlet", 
						{
							miNombre: "Martin Cruz"
						}, function(respuestaSolicitud){
					   		//alert(respuestaSolicitud);
					   		console.log(respuestaSolicitud);
						},
						"json"
				) 
				
			});
		});
	
	</script>
		
</body>
</html>