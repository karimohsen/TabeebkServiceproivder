<%-- 
    Document   : doctor2
    Created on : Apr 27, 2015, 1:25:10 AM
    Author     : Amal
--%>
<%@page import="java.util.Enumeration"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
                        <ul class="dropdown-menu message-dropdown">
                            <li class="message-preview">
                                <a href="#">
                                    <div class="media">
                                        <span class="pull-left">
                                            <img class="media-object" src="http://placehold.it/50x50" alt="">
                                        </span>
                                        <div class="media-body">
                                            <h5 class="media-heading"><strong>${account.getDisplayName()}</strong>
                                            </h5>
                                            <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                            <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="message-preview">
                                <a href="#">
                                    <div class="media">
                                        <span class="pull-left">
                                            <img class="media-object" src="http://placehold.it/50x50" alt="">
                                        </span>
                                        <div class="media-body">
                                            <h5 class="media-heading"><strong>${account.getDisplayName()}</strong>
                                            </h5>
                                            <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                            <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="message-preview">
                                <a href="#">
                                    <div class="media">
                                        <span class="pull-left">
                                            <img class="media-object" src="http://placehold.it/50x50" alt="">
                                        </span>
                                        <div class="media-body">
                                            <h5 class="media-heading"><strong>${account.getDisplayName()}</strong>
                                            </h5>
                                            <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                            <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="message-footer">
                                <a href="#">Read All New Messages</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
                        <ul class="dropdown-menu alert-dropdown">
                            <li>
                                <a href="#">Alert Name <span class="label label-default">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-success">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-info">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a>
                            </li>
                            <li>
                                <a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">View All</a>
                            </li>
                        </ul>
                    </li>
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
                                Bulk Download
                            </h1>
                            <ol class="breadcrumb">
                                <li>
                                    <i class="fa fa-home"></i>  <a href="${pageContext.request.contextPath}/Admin/Home.jsp">Home</a>
                                </li>
                                <li class="active">
                                    <i class="fa fa-file-excel-o"></i> Bulk Download
                                </li>
                            </ol>
                        </div>
                    </div>
                    <!-- /.row -->
                   
                    
                    
                     <form action="${pageContext.request.contextPath}/SecondServlet"
             
                                                                                     
                           <h2>  doctor sheet   </h2>


             
            </div>       
            <table border="1" cellpadding="3">

                <tbody>
                    <tr>
                        <td><select name="docselector1" size="1">
                                <option>  </option>

                               
                                  <option>doctorName</option>
                                  <option>doctorNameAr</option>
                                  <option>doctorDegree</option>
                                  <option>doctorDegreeAr</option>
                                <option>doctorspeciality</option>
                               
                                 <option>phone</option>

                            </select></td>
                        <td>
                            <select name="docselector2" size="1">
                                <option>  </option>

                          <option>doctorName</option>
                                  <option>doctorNameAr</option>
                                  <option>doctorDegree</option>
                                  <option>doctorDegreeAr</option>
                                <option>doctorspeciality</option>
                               
                                 <option>phone</option>
                            </select>
                        </td>
                        <td>
                            <select name="docselector3" size="1">
                                <option>  </option>

                                 <option>doctorName</option>
                                  <option>doctorNameAr</option>
                                  <option>doctorDegree</option>
                                  <option>doctorDegreeAr</option>
                                <option>doctorspeciality</option>
                               
                                 <option>phone</option>
                                 </select>
                        </td>
                        <td>
                            <select name="docselector4" size="1">
                                <option>  </option>

                                  <option>doctorName</option>
                                  <option>doctorNameAr</option>
                                  <option>doctorDegree</option>
                                  <option>doctorDegreeAr</option>
                                <option>doctorspeciality</option>
                               
                            </select>
                        </td>
                        <td>
                            <select name="docselector5" size="1">
                                <option>  </option>
                                <option>doctorName</option>
                                  <option>doctorNameAr</option>
                                  <option>doctorDegree</option>
                                  <option>doctorDegreeAr</option>
                                <option>doctorspeciality</option>
                               
                                 <option>phone</option>
                            </select>
                        </td>
                        
                         <td>
                            <select name="docselector6" size="1">
                                <option>  </option>
                                <option>doctorName</option>
                                  <option>doctorNameAr</option>
                                  <option>doctorDegree</option>
                                  <option>doctorDegreeAr</option>
                                <option>doctorspeciality</option>
                               
                                 <option>phone</option>
                            </select>
                             
                              <td>
                            <select name="docselector7" size="1">
                                <option>  </option>
                                <option>doctorName</option>
                                  <option>doctorNameAr</option>
                                  <option>doctorDegree</option>
                                  <option>doctorDegreeAr</option>
                                <option>doctorspeciality</option>
                               
                                 <option>phone</option>
                            </select>
                        </td>
                        </td>
                    </tr>
                </tbody>
            </table>



                     </br> </br>
                     
                                                                             
           clinic sheet 

 
            <table border="1" cellpadding="3">

                <tbody>
                    <tr>
                        <td><select name="clinicselector1" size="1">
                               <option> </option>
                                <option>clinicName</option>
                                <option>clinicNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                            </select></td>
                       
                       <td><select name="clinicselector2" size="1">
                                 <option> </option>
                                <option>clinicName</option>
                                <option>clinicNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                            </select></td>
                         <td><select name="clinicselector3" size="1">
                                   <option> </option>
                                <option>clinicName</option>
                                <option>clinicNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                            </select></td>
                               <td><select name="clinicselector4" size="1">
                                         <option> </option>
                                <option>clinicName</option>
                                <option>clinicNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                            </select></td>
                            
                                    <td><select name="clinicselector5" size="1">
                                              <option> </option>
                                <option>clinicName</option>
                                <option>clinicNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                            </select></td>
                    </tr><tr>
                                    <td><select name="clinicselector6" size="1">
                                              <option> </option>
                                <option>clinicName</option>
                                <option>clinicNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                            </select></td>
                                    <td><select name="clinicselector7" size="1">
                                              <option> </option>
                                <option>clinicName</option>
                                <option>clinicNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                            </select></td>
                            
                                    <td><select name="clinicselector8" size="1">
                                              <option> </option>
                                <option>clinicName</option>
                                <option>clinicNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                <option>phones</option>
                                
                                
                            </select></td>
                            
                                  <td><select name="clinicselector9" size="1">
                                            <option> </option>
                                <option>clinicName</option>
                                <option>clinicNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                <option>phones</option>
                                
                                
                            </select></td>
                    </tr>
                </tbody>
            </table>
           <br>
           hospital sheet 

 
            <table border="1" >

                <tbody>
                    <tr>
                        <td><select name="hospitalSelector1" size="1">
                               <option> </option>
                                <option>hospitalName</option>
                                <option>hospitalNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                                   <option>hospitalspecialities</option>
                                   <option>labs</option>
                                   
                            </select></td>
                        <td><select name="hospitalSelector2" size="1">
                               <option> </option>
                                <option>hospitalName</option>
                                <option>hospitalNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                                   <option>hospitalspecialities</option>
                                   <option>labs</option>
                                   
                            </select></td>
                    <td><select name="hospitalSelector3" size="1">
                               <option> </option>
                                <option>hospitalName</option>
                                <option>hospitalNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                                   <option>hospitalspecialities</option>
                                   <option>labs</option>
                                   
                            </select></td>
                         
                           <td><select name="hospitalSelector4" size="1">
                               <option> </option>
                                <option>hospitalName</option>
                                <option>hospitalNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                                   <option>hospitalspecialities</option>
                                   <option>labs</option>
                                   
                            </select></td>  
                            
                              <td><select name="hospitalSelector5" size="1">
                               <option> </option>
                                <option>hospitalName</option>
                                <option>hospitalNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                                   <option>hospitalspecialities</option>
                                   <option>labs</option>
                                   
                            </select></td>   
                             <td><select name="hospitalSelector6" size="1">
                               <option> </option>
                                <option>hospitalName</option>
                                <option>hospitalNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                                   <option>hospitalspecialities</option>
                                   <option>labs</option>
                                   
                            </select></td>
                    </tr>
                    
                    <tr>
                  <td><select name="hospitalSelector7" size="1">
                               <option> </option>
                                <option>hospitalName</option>
                                <option>hospitalNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                                   <option>hospitalspecialities</option>
                                   <option>labs</option>
                                   
                            </select></td>
                             <td><select name="hospitalSelector8" size="1">
                               <option> </option>
                                <option>hospitalName</option>
                                <option>hospitalNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                                   <option>hospitalspecialities</option>
                                   <option>labs</option>
                                   
                            </select></td>
                             <td><select name="hospitalSelector9" size="1">
                               <option> </option>
                                <option>hospitalName</option>
                                <option>hospitalNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                                   <option>hospitalspecialities</option>
                                   <option>labs</option>
                                   
                            </select></td>
                             <td><select name="hospitalSelector10" size="1">
                               <option> </option>
                                <option>hospitalName</option>
                                <option>hospitalNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                                   <option>hospitalspecialities</option>
                                   <option>labs</option>
                                   
                            </select></td>
                             <td><select name="hospitalSelector11" size="1">
                               <option> </option>
                                <option>hospitalName</option>
                                <option>hospitalNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                                   <option>hospitalspecialities</option>
                                   <option>labs</option>
                                   
                            </select></td>
                             <td><select name="hospitalSelector12" size="1">
                               <option> </option>
                                <option>hospitalName</option>
                                <option>hospitalNameAr</option>
                                <option> cityName</option>
                                <option>cityNameAr</option>
                                <option>areaNameEn</option>
                                <option>areaNameAr</option>
                                <option>brancheAddress</option>
                                <option>brancheAddressAr</option>
                                   <option>phones</option>
                                   <option>hospitalspecialities</option>
                                   <option>labs</option>
                                   
                            </select></td>
                    </tr>
                </tbody>
            </table>
           
            <input type="submit" class="btn btn-primary" value="Download" />
        </form>
                    
                    
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












        </form>
