<%@page import="java.util.Enumeration"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Tabeebak</title>

        <!-- Bootstrap Core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="${pageContext.request.contextPath}/css/sb-admin.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!--<script src="${pageContext.request.contextPath}/js/jquery.js"></script>-->
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/plugins/morris/morris-data.js"></script>
        <script src="${pageContext.request.contextPath}/js/plugins/morris/morris.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/plugins/morris/raphael.min.js"></script>        
        <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
        <!--Table-->
        <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>-->
        <script src="//cdn.datatables.net/1.10.5/js/jquery.dataTables.min.js"></script>
        <link href="//cdn.datatables.net/1.10.5/css/jquery.dataTables.css" rel="stylesheet"/>
        <script src="${pageContext.request.contextPath}/js/ADS_Script.js"></script>


    </head>

    <body>

        <div id="wrapper">

            <!-- Navigation -->
            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="${pageContext.request.contextPath}/Admin/Home.jsp">Tabeebak</a>
                </div>
                <!-- Top Menu Items -->
                <ul class="nav navbar-right top-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> ${account.getDisplayName()} <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="${pageContext.request.contextPath}/Admin/profile.jsp"><i class="fa fa-fw fa-user"></i> Profile</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="${pageContext.request.contextPath}/LogoutControler"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav side-nav">
                        <li>
                            <a href="${pageContext.request.contextPath}/Admin/Home.jsp"><i class="fa fa-fw fa-home"></i> Home</a>
                        </li>
                        <li class="active">
                            <a href="javascript:;" data-toggle="collapse" data-target="#Msp"><i class="fa fa-fw fa-ambulance"></i> MSP <i class="fa fa-fw fa-caret-down"></i></a>
                            <ul id="Msp" class="collapse">
                                <li>
                                    <a href="${pageContext.request.contextPath}/AdminAllMsps">All MSPS</a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/AdminDoctorDetails">Add Doctor</a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/ClinicDetails">Add Clinic</a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/Admin/addLab.jsp">Add Lab</a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/Admin/addHospital.jsp">Add Hospital</a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/Admin/addPharmacy.jsp">Add Pharmacy</a>
                                </li>
                                
                                <li>
                                    <a href="${pageContext.request.contextPath}/Admin/bulkUpload.jsp">Bulk Upload</a>
                                </li>
                                
                                <li>
                                    <a href="${pageContext.request.contextPath}/Admin/bulkDownload.jsp">Bulk Download</a>
                                </li>
                                
                            </ul>
                        </li>
                        <li>
                            <a href="javascript:;" data-toggle="collapse" data-target="#mic_id"><i class="fa fa-fw fa-university"></i> MIC <i class="fa fa-fw fa-caret-down"></i></a>
                            <ul id="mic_id" class="collapse">
                                <li>
                                    <a href="${pageContext.request.contextPath}/AdminAllMICS">ALL MICS</a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/Admin/AddMIC.jsp">Add MIC</a>
                                </li>
                            </ul>
                        </li>
                        <li >
                            <a href="${pageContext.request.contextPath}/Admin/viewreports.jsp"><i class="fa fa-fw fa-area-chart"></i> View Reports</a>
                        </li>
                        <li >
                            <a href="${pageContext.request.contextPath}/MspRecommendations"><i class="fa fa-fw fa-check-square-o"></i>Approve MSP</a>
                        </li>
                        <li >
                            <a href="${pageContext.request.contextPath}/AllUsers"><i class="fa fa-fw fa-users"></i>All Users</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </nav>

            <div id="page-wrapper">

                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">
                                Edit Clinic

                            </h1>
                            <ol class="breadcrumb">
                                <li>
                                    <i class="fa fa-home"></i>  <a href="${pageContext.request.contextPath}/Admin/Home.jsp">Home</a>
                                </li>
                                <li class="active">
                                    <i class="fa fa-ambulance"></i> Edit Clinic
                                </li>
                            </ol>
                        </div>
                    </div>
                    <!-- /.row -->
                    <div class="row">
                        <div class="col-lg-12">
                            <form id="contactform" method="POST" action="${pageContext.request.contextPath}/UpdateClinicDetails">
                                <input id="clinicid" name="clinicid" value="<c:out value='${clinic.getClinicId()}'/>" type="hidden">
                                <input id="teleid1" name="teleid1" value="<c:out value='${tele1.getTelephoneId()}'/>" type="hidden">                      
                                <input id="teleid2" name="teleid2" value="<c:out value='${tele2.getTelephoneId()}'/>" type="hidden">                      
                                <input id="branchid" name="branchid" value="<c:out value='${branch.getBrancheId()}'/>" type="hidden">
                                <table>
                                    <tr>
                                        <td><p class="contact"><label for="name">Clinic Name</label></p></td>

                                        <td>
                                            <input id="name" name="name" required="true" tabindex="1" type="text" value="<c:out value='${clinic.getClinicName()}'/>"/>                      
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><p class="contact"><label for="namear">Clinic Name Arabic</label></p></td>

                                        <td>
                                            <input id="namear" name="namear"  required="true" tabindex="2" type="text" value="<c:out value='${clinic.getClinicNameAr()}'/>">                      
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><p class="contact"><label for="name">Clinic Address</label></p></td>

                                        <td>
                                            <input id="clinicadd" name="clinicadd"  required="true" tabindex="3" type="text" value="<c:out value='${branch.getBrancheAddress()}'/>">                      
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><p class="contact"><label for="name">Clinic Address Arabic</label></p></td>

                                        <td>
                                            <input id="clinicaddar" name="clinicaddar"  required="true" tabindex="4" type="text" value="<c:out value='${branch.getBrancheAddressAr()}'/>">                      
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><p class="contact"><label for="name">Longitude</label></p></td>

                                        <td>
                                            <input id="longtiude" name="longitude"  required="true" tabindex="5" type="text" value="<c:out value='${branch.getBrancheLongtitude()}'/>">                      
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><p class="contact"><label for="name">Latitude</label></p></td>

                                        <td>
                                            <input id="latitude" name="latitude"  required="true" tabindex="6" type="text" value="<c:out value='${branch.getBrancheLatatitude()}'/>">                      
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><p class="contact"><label for="name">Telephone number 1</label></p></td>

                                        <td>
                                            <input id="tele1" name="tele1" tabindex="5" type="text" value="<c:out value='${tele1.getTelephoneNumber()}'/>">                      
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><p class="contact"><label for="name">Telephone number 2</label></p></td>

                                        <td>
                                            <input id="tele2" name="tele2"  tabindex="6" type="text" value="<c:out value='${tele2.getTelephoneNumber()}'/>">                      
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><p class="contact"><label for="name">Country :</label></p></td>
                                        <td>
                                            <select name="Country">
                                                <c:forEach var="country" items="${requestScope.allcountries}">
                                                    <option value="${country.getCountryId()}" ${country.getCountryId() == branch.getCountry().getCountryId() ? 'selected' : ''} >${country.getCountryName()}/${country.getCounteryNameAr()}</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><p class="contact"><label for="name">Area :</label></p></td>
                                        <td>
                                            <select name="Area">
                                                <c:forEach var="area" items="${requestScope.allareas}">
                                                    <option value="${area.getIdarea()}" ${area.getIdarea() == branch.getArea().getIdarea() ? 'selected' : ''}>${area.getAreaNameEn()}/${area.getAreaNameAr()}</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><p class="contact"><label for="name">Cities :</label></p></td>
                                        <td>
                                            <select name="Cities">
                                                <c:forEach var="cities" items="${requestScope.allcities}">
                                                    <option value="${cities.getCityId()}" ${cities.getCityId() == branch.getCity().getCityId() ? 'selected' : ''} >${cities.getCityName()}/${cities.getCityNameAr()}</option>
                                                </c:forEach>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="padding: 10px;" align="right" colspan="2" >
                                            <input class="btn btn-primary" name="submit" id="submit" tabindex="7" value="Update" type="submit"> 	 
                                            <input class="btn btn-warning" id="cancel_button" tabindex="8" value="reset" type="reset">
                                        </td>
                                    </tr>

                                </table>
                            </form>
                        </div>
                    </div>
                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

</body>

</html>
