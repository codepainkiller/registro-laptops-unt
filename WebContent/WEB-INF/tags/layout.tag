<%@tag description="Layout de la aplicacion" pageEncoding="UTF-8"%>
<%@attribute name="content" fragment="true" %>
<%@attribute name="css_content" fragment="true" %>
<%@attribute name="js_content" fragment="true" %>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Registro Laptops</title>

    <link href="assets/plugins/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/plugins/metisMenu/dist/metisMenu.min.css" rel="stylesheet">
    <link href="assets/css/sb-admin-2.css" rel="stylesheet">
    <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <jsp:invoke fragment="css_content"/>
</head>

<body>

<div id="wrapper">

<!-- Navigation -->
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.html">Registro Laptos UNT</a>
    </div>
    <!-- /.navbar-header -->

    <ul class="nav navbar-top-links navbar-right">
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-messages">
                <li>
                    <a href="#">
                        <div>
                            <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Ayer</em>
                                    </span>
                        </div>
                        <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a class="text-center" href="#">
                        <strong>Leer todos los mensajes</strong>
                        <i class="fa fa-angle-right"></i>
                    </a>
                </li>
            </ul>
            <!-- /.dropdown-messages -->
        </li>
        <!-- /.dropdown -->
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-bell fa-fw"></i>  <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-alerts">
                <li>
                    <a href="#">
                        <div>
                            <i class="fa fa-comment fa-fw"></i> Nueva alerta
                            <span class="pull-right text-muted small">Hace 4 minutos</span>
                        </div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a class="text-center" href="#">
                        <strong>See All Alerts</strong>
                        <i class="fa fa-angle-right"></i>
                    </a>
                </li>
            </ul>
            <!-- /.dropdown-alerts -->
        </li>
        <!-- /.dropdown -->
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-user">
                <li>
                	<a href="#">
                		<i class="fa fa-user fa-fw"></i>
                		<%
                			if (session.getAttribute("email") != null) {
                				out.print(session.getAttribute("nombres") +
                						" " + session.getAttribute("apellidos"));
                			} else {
                				out.print("No ha iniciado");
                				response.sendRedirect("iniciar-sesion.jsp");
                			}
                		%>
                	</a>
                </li>
                <li><a href="#"><i class="fa fa-gear fa-fw"></i> Configuraciones </a>
                </li>
                <li class="divider"></li>
                <li><a href="Logout"><i class="fa fa-sign-out fa-fw"></i> Cerrar Sesión</a>
                </li>
            </ul>
            <!-- /.dropdown-user -->
        </li>
        <!-- /.dropdown -->
    </ul>
    <!-- /.navbar-top-links -->

    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <ul class="nav" id="side-menu">
                <li class="sidebar-search">
                    <div class="input-group custom-search-form">
                        <input type="text" class="form-control" placeholder="Buscar...">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">
                                        <i class="fa fa-search"></i>
                                    </button>
                                </span>
                    </div>
                    <!-- /input-group -->
                </li>
                <li>
                    <a href="dashboard.jsp"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Administrador<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="registra-usuario.jsp">Registrar usuario</a>
                        </li>
                        <li>
                            <a href="lista-usuarios.jsp">Ver usuarios</a>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>
                <li>
                    <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Supervisor<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="#">Generar reporte</a>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>
                <li>
                    <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Operador<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="#">Entradas</a>
                        </li>
                        <li>
                            <a href="#">Salidas</a>
                        </li>
                        <li>
                            <a href="#">Registrar Laptop</a>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>
                <li>
                    <a href="javascript:void(0)"><i class="fa fa-edit fa-fw"></i> Ayuda</a>
                </li>

            </ul>
        </div>
        <!-- /.sidebar-collapse -->
    </div>
    <!-- /.navbar-static-side -->
</nav>

	<!-- page-content -->
		<jsp:invoke fragment="content"/>
	<!-- /page-content -->

</div>
<!-- /#wrapper -->

<script src="assets/plugins/jquery/dist/jquery.min.js"></script>
<script src="assets/plugins/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="assets/plugins/metisMenu/dist/metisMenu.min.js"></script>
<script src="assets/js/sb-admin-2.js"></script>

<jsp:invoke fragment="js_content"/>

</body>

</html>