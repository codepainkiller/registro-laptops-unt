<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
	<jsp:attribute name="content">
		<div id="page-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Registrar Usuario</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <div class="row">
                <div class="col-md-12">

                    <form action="RegistraServlet" method="POST">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title">Datos de nuevo usuario</h3>
                            </div>
                            <div class="panel-body">
                                <div class="row">
                                    <div class=col-md-6>
                                        <div class="form-group">
                                            <label for="nombre">Nombre</label>
                                            <input type="text" class="form-control" name="nombres" id="nombres"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="apellidos">Apellidos</label>
                                            <input type="text" class="form-control" name="apellidos" id="apellidos"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="direccion">Dirección</label>
                                            <input type="text" class="form-control" name="direccion" id="direccion"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="telefono">Teléfono</label>
                                            <input type="text" class="form-control" name="telefono" id="telefono" />
                                        </div>
                                    </div>
                                    <div class=col-md-6>
                                        <div class="form-group">
                                            <label for="dni">DNI</label>
                                            <input type="number" class="form-control" name="dni" id="dni" />
                                        </div>
                                        <div class="form-group">
                                            <label for="email">Email</label>
                                            <input type="email" class="form-control" name="email" id="email" />
                                        </div>
                                        <div class="form-group">
                                            <label for="password">Contraseña</label>
                                            <input type="password" class="form-control" name="password" id="password" />
                                        </div>
                                        <div class="form-group">
                                            <label for="tipo_usuario">Tipo</label>
                                            <select class="form-control" name="tipo_usuario_id" id="tipo_usuario_id">
                                                <option value="2">Supervisor</option>
                                                <option value="3">Operador</option>
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
                    </form>
                </div>
            </div>
        </div>
    </div>
	</jsp:attribute>
	
	<jsp:attribute name="css_content">
		
	</jsp:attribute>
	
	<jsp:attribute name="js_content">
		
	</jsp:attribute>
</t:layout>