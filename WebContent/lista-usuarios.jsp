<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
	<jsp:attribute name="content">
		<div id="page-wrapper">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
					    <h1 class="page-header">Usuarios</h1>
					</div>
				</div>
			</div>
			
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Lista de usuarios
                        </div>
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" id="usuarios_table">
                                    <thead>
                                        <tr>
                                            <th>id</th>
                                            <th>Nombres</th>
                                            <th>Apellidos</th>
                                            <th>DNI</th>
                                            <th>Email</th>
                                            <th>Tipo de usuario</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    	<!-- json content -->
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
			
		</div>
	</jsp:attribute>
	
	<jsp:attribute name="css_content">
    	<link href="assets/plugins/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">
    	<link href="assets/plugins/datatables-responsive/css/dataTables.responsive.css" rel="stylesheet">
	</jsp:attribute>
	
	<jsp:attribute name="js_content">
		
		<script src="assets/plugins/datatables/media/js/jquery.dataTables.min.js"></script>
		<script src="assets/plugins/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>
		
		<script type="text/javascript">
			$(document).ready(function () {
				
				$('#usuarios_table').DataTable({ 
					"language": {"url": "//cdn.datatables.net/plug-ins/9dcbecd42ad/i18n/Spanish.json"},
			    	responsive: true, 
					"ajax" : {
						"url" : "ListaUsuariosServlet",
						"dataSrc": ""
					},
			    	"columns": [
			    		{"data": "id"},
			    		{"data": "nombres"},
			    		{"data": "apellidos"},
			    		{"data": "dni"},
			    		{"data": "email"},
			    		{"data": "tipoUsuarioId"}
			    	]
			    });
			    
			});
			
		</script>
	</jsp:attribute>
</t:layout>