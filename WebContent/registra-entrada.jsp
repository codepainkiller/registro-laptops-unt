<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
	<jsp:attribute name="content">
		<div id="page-wrapper">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
					    <h1 class="page-header">Registra Entrada</h1>
					</div>
				</div>
			</div>
			<!-- /.row -->
            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Ingresos</h3>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-inline">
                                        <input type="number" class="form-control" id="dni" placeholder="Numero de DNI"/>
                                        <input type="text" class="form-control" id="serie" placeholder="Serie de laptop"/>
                                        <button class="btn btn-default" id="buscar">Buscar</button>
                                    </div>
                                </div>
                            </div>
                            <h3>Resultados</h3>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="panel panel-default">
                                        <div class="panel-body">
                                            <div class="col-md-6">
                                                <div class="form-group">
                                                    <h4>Titular</h4>
                                                    <input type="text" class="form-control" id="nombre" disabled/>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <div class="form-group">
                                                    <h4>Laptop</h4>
                                                    <input type="text" class="form-control" id="laptop" disabled/>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="panel-footer">
                            <button class="btn btn-primary" id="marcar_registro" disabled>Marcar Ingreso</button>
                        </div>
                    </div>
                </div>
            </div>
			<!-- /.row -->
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
				
				$('#marcar_registro').click( function(event) {
					console.log("Boton Marcar registro");
				});
				
				$('#buscar').click( function(event) {
					
					var dni = $('#dni').val();
					var serie = $('#serie').val();
					
					if (dni == "" || serie == "") {
						alert("Ingrese DNI y Serie de Laptop");
					}
					else {
						console.log("Busqueda: Peticion por AJAX");
						
						$.get(
							"IngresoLaptopServlet",
							{
								dni: dni,
								serie: serie,
							},
							function(data) {
								validarIngreso(data.split(","));
							}
						);
					}
				});
				
				function validarIngreso(array) {
					
					console.log(array);
					
					if (array[0] != "null") {
						$('#nombre').val(array[0]);
					}
					else {
						$('#nombre').val("No encontrado");
					}
					
					if (array[1] != "null") {
						$('#laptop').val(array[1]);
					}
					else {
						$('#laptop').val("No encontrado");
					}
					
					if (array[0] != "null" && array[1] != "null") {
						$('#marcar_registro').attr('disabled', false);
					} else {
						$('#marcar_registro').attr('disabled', true);
					}
					
				}
				
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