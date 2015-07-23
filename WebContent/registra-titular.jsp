<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
	<jsp:attribute name="content">
		<div id="page-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Registrar titular</h1>
                </div>
            </div>
            <!-- ./row -->
            <div class="row">
                <div class="col-md-12">
                    <form action="RegistraTitularServlet" method="POST">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title">Datos de titular</h3>
                            </div>
                            <div class="panel-body">
                                <div class="row">
                                    <div class=col-md-6>
                                        <div class="form-group">
                                            <label for="nombres">Nombres</label>
                                            <input type="text" class="form-control" name="nombres" id="nombres" placeholder="Ingrese nombres" required/>
                                        </div>
                                        <div class="form-group">
                                            <label for="apellidos">Apellidos</label>
                                            <input type="text" class="form-control" name="apellidos" id="apellidos" placeholder="Ingrese apellidos" required/>
                                        </div>
                                        <div class="form-group">
                                            <label for="direccion">Dirección</label>
                                            <input type="text" class="form-control" name="direccion" id="direccion" placeholder="Ingrese dirección" required/>
                                        </div>
                                        <div class="form-group">
                                            <label for="telefono">Teléfono</label>
                                            <input type="text" class="form-control" name="telefono" id="telefono" placeholder="Ingrese número de teléfono" />
                                        </div>
                                    </div>
                                    <div class=col-md-6>
                                        <div class="form-group">
                                            <label for="dni">DNI</label>
                                            <input type="number" class="form-control" name="dni" id="dni" placeholder="Ingrese numero de DNI" pattern="[0-9]{8}" required/>
                                        </div>
                                        <div class="form-group">
                                            <label for="email">Email</label>
                                            <input type="email" class="form-control" name="email" id="email" placeholder="Ingrese e-mail" />
                                        </div>
                                        <div class="form-group">
                                            <label for="codigo">Código</label>
                                            <input type="text" class="form-control" name="codigo" id="codigo" placeholder="Ingrese código" required/>
                                        </div>
                                        <div class="form-group">
                                            <label for="tipo_titular_id">Tipo</label>
                                            <select class="form-control" name="tipo_titular_id" id="tipo_titular_id" required>
                                                <option value="1">Alumno</option>
                                                <option value="2">Docente</option>
                                                <option value="3">Administrativo</option>
                                                <option value="4">Visita</option>
                                                <option value="5">Post Grado</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-footer">
                                <div class="row">
                                    <div class="col-md-6">
                                        <button type="submit" class="btn btn-primary">Registrar</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- ./panel -->
                    </form>
                </div>
            </div>
            <!-- ./row -->
        </div>
    </div>
	</jsp:attribute>
	
	<jsp:attribute name="css_content">
		
	</jsp:attribute>
	
	<jsp:attribute name="js_content">
		
	</jsp:attribute>
</t:layout>