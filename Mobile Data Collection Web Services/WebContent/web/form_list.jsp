<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page
	import="java.io.*,java.util.*,com.comp2014.group5.webservices.FormParameterHandler,org.json.*,com.comp2013group5.form.model.*,com.comp2014.group5.form_database.FormAccessor"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<title>Form List</title>
<head>
<link
	href="${pageContext.request.contextPath}/web/css/bootstrap.min.css"
	rel="stylesheet" media="screen">
<link
	href="${pageContext.request.contextPath}/web/css/formgenerator.css"
	rel="stylesheet" media="screen>">
</head>
<body>
	<!-- Nav Bar -->
	<div class="container-fluid">
		<div class="navbar">
			<div class="navbar-inner">
				<a class="brand" href="#">Data Collector</a>
				<ul class="nav">
					<li><a href="${pageContext.request.contextPath}/new_form/">Form Creator</a></li>
					<li class="active"><a href="#">Form List</a></li>
					<li><a href="#">Data Analysis</a>
					<li>
				</ul>
			</div>
		</div>
	</div>

	<div class="container-fluid">

		<%
			FormAccessor accessor;
			accessor = new FormAccessor("localhost");
		%>
		<ul class="nav nav-pills nav-stacked">
			<%
				for (String name : accessor.getFormNames()) {
			%>
			<li><a href="edit_form/<%=name%>"> <%
 	out.println(name);
 %>
			</a></li>
			<%
				}
			%>
		</ol>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/web/formlib.js">
		
	</script>
</body>
</html>