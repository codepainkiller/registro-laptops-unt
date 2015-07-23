<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Martin Cruz">

    <title>Iniciar Sesión</title>

    <link href="assets/plugins/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/plugins/metisMenu/dist/metisMenu.min.css" rel="stylesheet">
    <link href="assets/css/sb-admin-2.css" rel="stylesheet">
    <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

</head>

<body>
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Iniciar Sesión </h3>
                    </div>
                    <div class="panel-body">
                        <form action="Login" method="POST">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Numero de DNI" name="dni" type="number" pattern="{8}" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Contraseña" name="password" type="password" value="">
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Recordarme
                                    </label>
                                </div>
                                <button type="submit" class="btn btn-primary">Ingresar</button>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="assets/plugins/jquery/dist/jquery.min.js"></script>
    <script src="assets/plugins/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="assets/plugins/metisMenu/dist/metisMenu.min.js"></script>
    <script src="assets/js/sb-admin-2.js"></script>

</body>

</html>
