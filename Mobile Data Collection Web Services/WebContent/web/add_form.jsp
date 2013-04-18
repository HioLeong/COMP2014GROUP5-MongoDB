<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.io.*,java.util.*,com.comp2014.group5.webservices.FormParameterHandler,org.json.*,com.comp2013group5.form.model.*,com.comp2014.group5.form_database.FormAccessor"%>

<!DOCTYPE html>
<html>
<title>Form Added Process</title>
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
					<li><a href="form_list">Form List</a></li>
					<li><a href="#">Data Analysis</a>
					<li>
				</ul>
			</div>
		</div>


		<%
			String queryString = request.getQueryString();
			FormParameterHandler handler = new FormParameterHandler(queryString);
			Form form = handler.getForm();

			FormAccessor accessor = new FormAccessor("localhost");
			
			try {
				accessor.saveForm(form);
			} catch (Exception e) {
				out.println("Error connecting to the database");
			}
		%>

	</div>

	<div class="container-fluid">
		<h1>Form Added</h1>
		<a href="/">Continue</a>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/web/formlib.js">
		
	</script>

</body>
</html>
