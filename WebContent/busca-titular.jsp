<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
	<jsp:attribute name="content">
		<div id="page-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Titular</h1>
                </div>
            </div>
            
            <div class="row">
                <div class="col-md-12">
                    <div class="col-md-12">
                        <div class="panel panel-default">
                            <div class="panel-body">
                                <div class="form-inline">
                                    <input type="number" class="form-control" id="dni" placeholder="Ingresa numero de DNI"/>
                                    <button class="btn btn-default" id="buscar">Buscar</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-md-12">
                    <div class="col-md-9">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title">Laptops</h3>
                            </div>
                            <div class="panel-body">
                                <table class="table table-bordered" id="laptopsDT">
                                    <thead>
	                                    <th>Marca</th>
	                                    <th>Modelo</th>
	                                    <th>Serie</th>
	                                    <th>Descripción</th>
                                    </thead>
                                    <tbody>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <!-- ./col-md-10 -->
                    <div class="col-md-3">
                        <div class="panel panel-default">
                            <div class="panel-body">
	                            <button class="btn btn-default btn-block" id="add_laptop">Añadir</button>
	                            <div class="form-group">
	                                <label for="marca">Marca</label>
	                                <input type="text" class="form-control" id="marca">
	                            </div>
	                            <div class="form-group">
	                                <label for="modelo">Modelo</label>
	                                <input type="text" class="form-control" id="modelo">
	                            </div>
	                            <div class="form-group">
	                                <label for="serie">Serie</label>
	                                <input type="text" class="form-control" id="serie">
	                            </div>
	                            <div class="form-group">
	                                <label for="descripcion">Descripción</label>
	                                <textarea type="text" class="form-control" id="descripcion"></textarea>
	                            </div>
                            </div>
                        </div>
                    </div>
                    <!-- /.col-md-2 -->
                </div>
                <!-- /.row-->
            </div>
            <!-- /.row -->
        </div>
    </div>
	</jsp:attribute>
	
<jsp:attribute name="css_content">
	
</jsp:attribute>
	
<jsp:attribute name="js_content">
	<script type="text/javascript">
	
		$('#add_laptop').click(function(event) {
			//udpateTableAJAX(dni);
			console.log("Añadiniendo laptop!");
		});
	
		$('#buscar').click(function(event) {
			console.log("Buscando laptops!");
			udpateTableAJAX(dni);
		});
		
		function removeBodyTable() {
			$("#laptopsDT > tbody").empty();
		}
		
		function udpateTableAJAX() {
			var dni = $('#dni').val();
			
			$.post(
				"BuscaTitularServlet",
				{
					dni: dni
				},
				function(data) {
					removeBodyTable();
					
					$.each(data, function(i, item){
							
						var row = "<tr>"
							+ "<td>" + item.marca + "</td>"
							+ "<td>" + item.modelo + "</td>"
							+ "<td>" + item.serie + "</td>"
							+ "<td>" + item.descripcion + "</td>"
							+ "</tr>";
							
						$('tbody').append(row);
					}); 
				},
				"json"
				
			);
		}
	
	</script>
</jsp:attribute>
</t:layout>