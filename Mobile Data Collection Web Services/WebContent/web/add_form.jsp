<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.io.*,java.util.*,com.comp2014.group5.webservices.FormParameterHandler,org.json.*,com.comp2013group5.form.model.*"%>

<!DOCTYPE html>
<html>
<title>Form Creator</title>
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
					<li class="active"><a href="#">Form Creator</a></li>
					<li><a href="#">Form List</a></li>
					<li><a href="#">Data Analysis</a>
					<li>
				</ul>
			</div>
		</div>
		

			<%
		String queryString = request.getQueryString();
		FormParameterHandler handler = new FormParameterHandler(queryString);
		for (FormWidget widget : handler.getFormComponents()) {
			out.println(widget.toJSONObject().toString());
		}
	%>

	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/web/formlib.js"> </script>
	
</body>
</html>
