<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
	<jsp:attribute name="content">
		<div id="page-wrapper">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
					    <h1 class="page-header">Dashboard</h1>
					</div>
				</div>
                <!-- ./row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <div class="row">
                                        <div class="col-xs-3">
                                            <i class="fa fa-user fa-5x"></i>
                                        </div>
                                        <div class="col-xs-9 text-right">
                                            <div class="huge">2235</div>
                                            <div>Usuarios</div>
                                        </div>
                                    </div>
                                </div>
                                <a href="#">
                                    <div class="panel-footer">
                                        <span class="pull-left">Ver detalles</span>
                                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                        <div class="clearfix"></div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-green">
                                <div class="panel-heading">
                                    <div class="row">
                                        <div class="col-xs-3">
                                            <i class="fa fa-laptop fa-5x"></i>
                                        </div>
                                        <div class="col-xs-9 text-right">
                                            <div class="huge">250</div>
                                            <div>Laptops</div>
                                        </div>
                                    </div>
                                </div>
                                <a href="#">
                                    <div class="panel-footer">
                                        <span class="pull-left">Ver detalles</span>
                                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                        <div class="clearfix"></div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-6">
                            <div class="panel panel-yellow">
                                <div class="panel-heading">
                                    <div class="row">
                                        <div class="col-xs-3">
                                            <i class="fa fa-sign-in fa-5x"></i>
                                        </div>
                                        <div class="col-xs-9 text-right">
                                            <div class="huge">1245</div>
                                            <div>Ingresos</div>
                                        </div>
                                    </div>
                                </div>
                                <a href="#">
                                    <div class="panel-footer">
                                        <span class="pull-left">Ver detalles</span>
                                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                        <div class="clearfix"></div>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="col-lg-3 col-md-4">
                            <div class="panel panel-red">
                                <div class="panel-heading">
                                    <div class="row">
                                        <div class="col-xs-3">
                                            <i class="fa fa-reply-all fa-5x"></i>
                                        </div>
                                        <div class="col-xs-9 text-right">
                                            <div class="huge">1541</div>
                                            <div>Salidas</div>
                                        </div>
                                    </div>
                                </div>
                                <a href="#">
                                    <div class="panel-footer">
                                        <span class="pull-left">Ver detalles</span>
                                        <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                        <div class="clearfix"></div>
                                    </div>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ./row -->
                <div class="row">
                    <div class="col-md-12">
                        <div class="col-md-6">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    Estadísticas
                                </div>
                                <div class="panel-body">
                                    <div class="flot-chart">
                                        <div class="flot-chart-content" id="estadisticas"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="panel panel-default">
                                <div class="panel-body">
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto beatae
                                    consequuntur et, eveniet nam ullam veniam voluptates! Aliquam consequatur maxime
                                    natus non. Accusamus consequuntur debitis enim modi officiis omnis quod repudiandae
                                    sed ut voluptatem. A consectetur deleniti dolor dolorum eos error
                                    unde.</p>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto beatae
                                    consequuntur et, eveniet nam ullam veniam voluptates! Aliquam consequatur maxime
                                    natus non. Accusamus consequuntur debitis enim modi officiis omnis quod repudiandae
                                    sed ut voluptatem. A consectetur deleniti dolor dolorum eos error esse fuga fugit
                                    hic impedit in minus molestiae nam natus nobis optio porro, praesentium, quae quasi
                                    quis repellat repudiandae sapiente suscipit tempore ut voluptas voluptate
                                    voluptates.</p>
                                    <p>
                                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto beatae
                                    consequuntur et, eveniet nam ullam veniam voluptates! Aliquam consequatur maxime
                                    natus non. Accusamus consequuntur debitis enim modi officiis omnis quod repudiandae
                                    sed ut voluptatem. A consectetur deleniti dolor dolorum eos error esse fuga fugit
                                    hic impedit in minus molestiae nam natus nobis optio porro, praesentium
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- ./row -->
			</div>
		</div>
	</jsp:attribute>
	
	<jsp:attribute name="css_content">
		<link href="assets/plugins/morrisjs/morris.css" rel="stylesheet">
	</jsp:attribute>
	
	<jsp:attribute name="js_content">
        <script src="assets/plugins/flot/jquery.flot.js"></script>
        <script src="assets/plugins/flot/jquery.flot.pie.js"></script>

        <script type="text/javascript">
        var data = [{
            label: "Ingresos",
            data: 70
        }, {
            label: "Salidas",
            data: 30
        }];

        var plotObj = $.plot($("#estadisticas"), data, {
            series: {
                pie: {
                show: true
            }
            },
                grid: {
                hoverable: true
            },
                tooltip: true,
                tooltipOpts: {
                content: "%p.0%, %s", // show percentages, rounding to 2 decimal places
            shifts: {
                x: 20,
                y: 0
            },
                defaultTheme: false
            }
        });
        </script>
	</jsp:attribute>
</t:layout>