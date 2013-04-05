<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page
	import="java.io.*,java.util.*,com.comp2014.group5.webservices.FormParameterHandler,org.json.*,com.comp2013group5.form.model.*,com.comp2014.group5.form_database.FormAccessor"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<title>Form Creator</title>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/web/formlib.js"> </script>

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

	<%
		String url = request.getRequestURI();
			String formName = url.substring(url.lastIndexOf('/') + 1);
	%>

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
		<form method=get
			action="${pageContext.request.contextPath}/form_added">
			<div class="span10">
				<label>Form Name:</label> <input type="text" class="input-small"
					name="form-name" value="<%=formName%>" placeholder="">
			</div>



			<div class="row-fluid">
				<table id="tableToModify" class="span10 table table-striped">
					<!-- labels -->
					<tr id="labels" class="form-labels">
						<th id="label-0">Widget</th>
						<th id="label-1">ID</th>
						<th id="label-2">Name</th>
						<th id="label-3"></th>
						<th id="label-4"></th>
						<th id="label-5"></th>
						<th id="label-6"></th>
					</tr>

					<tr class="form-row" id="rowToClone" style="display: none">
						<th class="formselect"><select id="formselect" name="fcomponent"
							onChange=selectClickChange(this);>
								<option value="text-field">Text-field</option>
								<option value="check-group">Checkbox group</option>
								<option value="radio-group">Radio group</option>
								<option value="time-picker">Time picker</option>
								<option value="date-picker">Date picker</option>
								<option value="calendar-date-picker">Calendar Date
									picker</option>
								<option value="drop-down-list">Drop-down list</option>
								<option value="signature-box">Signature Box</option>
								<option value="pictures">Pictures</option>
								<option value="form">Form</option>
						</select></th>
						<th class="id"><input type="text" name="id"></th>
						<th class="name"><input type="text" name="name"></th>

						<th class="input-type" id="text1"><select name="input-type">
								<option value="undefined">Type</option>
								<option value="text">Text</option>
								<option value="number">Number</option>
								<option value="email">Email</option>
								<option value="phone_num">Phone number</option>
						</select></th>

						<th class="default-text" id="text2"><input type="text"
							name="default-text" placeholder="Default-text"></th>
						<!--CHECKBOX or RADIO_BTN form component - initially hidden -->
						<th class="group-options-1" id="check_rad1" style="display: none">
							<input type="text" name="options"
							placeholder="Options: [item1, item2..]">
						</th>
						<th class="group-options-2" id="check_rad2" style="display: none">
							<input type="text" name="default-choice"
							placeholder="Default-choice(index of elmnt)">
						</th>
						<!--TIME PICKER f.c. - i.h.-->
						<th class="time-picker" id="time" style="display: none"><input
							type="text" name="starting-time"
							placeholder="Starting time (hh:mm)"></th>
						<!--DATE PICKER f.c. - i.h.-->
						<th class="date-picker" id="date" style="display: none"><input
							type="text" name="starting-date"
							placeholder="Starting date(dd/mm/yyyy)"></th>
						<!--CALENDAR DATE PICKER f.c. - i.h.-->
						<th class="calendar-date-picker" id="calendar"
							style="display: none"><input type="text"
							name="starting-month" placeholder="Starting Month(e.g. July)">
						</th>
						<!-- SIGNATURE BOX && PICTURES f.c. - i.h. -->
						<th class="dev" id="devel" style="display: none"><input
							type="text" name="starting-month" placeholder="To be developed">
						</th>
						<!--FORM d.c. - i.h.-->
						<th class="form-array" id="form" style="display: none"><textarea
								rows="1" cols="30">Type in Form array here</textarea></th>
						<!---->

						<th id="add">
							<button type="button" onClick=cloneRow();>Add</button>
						</th>

						<th id="del">
							<button type="button" value="Delete" disabled="true"
								onClick=deleteRow(this);>Delete</button>
						</th>
					</tr>
				</table>
			</div>
			<div class="span10 offset6">

				<button onClick=removeClonedRow()>Submit</button>
			</div>

			<%
				Form form = null;
					try {

						FormAccessor accessor = new FormAccessor("localhost");
						String formString = accessor.getFormString(formName);
						form = new Form(new JSONObject(formString));
			%>
			<%
				} catch (Exception e) {
			%>
			<h1>Error connecting to the database.</h1>
			<%
				}
			%>

			<%
				for (FormWidget formWidget : form.getFormWidgets()) {
				// Can't believe I'm using instanceof	
				
					if (formWidget instanceof TextField) {
						TextField textField = (TextField) formWidget;
			%>
			<script type="text/javascript"> addRow('text-field','<%=textField.getId()%>', '<%=textField.getName()%>', '<%=textField.getInputType()%>', '<%=textField.getDefaultText()%>'); </script>
			<%
					}
					if (formWidget instanceof CheckGroup) {
						CheckGroup checkGroup = (CheckGroup) formWidget;
						String optionsString =checkGroup.getOptions().toString();
						optionsString = optionsString.substring(1,optionsString.length()-1);
						optionsString = optionsString.replace(", ", ",");
			%>
			<script type="text/javascript">addRow('check-group','<%=checkGroup.getId()%>','<%=checkGroup.getName()%>','<%= optionsString%>');</script>			
							
					<%
					}
					if (formWidget instanceof RadioGroup) {
						RadioGroup radioGroup = (RadioGroup) formWidget;
						String optionsString = radioGroup.getOptions().toString();
						optionsString = optionsString.substring(1, optionsString.length()-1);
						optionsString = optionsString.replace(", ", ",");
					%> 
						<script type="text/javascript">addRow('radio-group','<%=radioGroup.getId()%>','<%=radioGroup.getName()%>','<%= optionsString%>');</script>
					<%
					}
					if (formWidget instanceof DatePicker) {
						DatePicker datePicker = (DatePicker) formWidget;
					%> 
					<script type="text/javascript"> addRow('date-picker','<%=datePicker.getId()%>', '<%=datePicker.getName()%>', '<%=datePicker.getStartDate() %>'); </script>						
						<%
					}
					
				}
			%>

		</form>
	</div>

	<script type="text/javascript">
		function removeClonedRow() {
			var rowToClone = document.getElementById("rowToClone");
			rowToClone.parentNode.removeChild(rowToClone);
		}
	</script>
</body>
</html>
