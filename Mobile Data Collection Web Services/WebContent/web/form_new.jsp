<!DOCTYPE html>
<html>
<title>Form Creator</title>
<head>
<base href="${pageContext.request.contextPath}">
<link href="web/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="web/css/formgenerator.css" rel="stylesheet" media="screen>">
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
		<form method=post action="form_added">
			<div class="span10">
				<ul class="inline">
					<label>Form Name:</label>
					<input type="text" class="input-small" name="form-name" placeholder="">
				</ul>
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
						<th><select id="formselect" name="fcomponent"
							onChange=selectClickChange(this);>
								<option value="text-field">Text-field</option>
								<option value="check-box">Checkbox group</option>
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
						<th><input type="text" name="id"></th>
						<th><input type="text" name="name"></th>

						<th class="text-type" id="text1"><select name="type">
								<option value="" disabled selected>Type</option>
								<option value="string">String</option>
								<option value="int">Integer</option>
								<option value="real">Real</option>
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
		</form>
	</div>
	<script type="text/javascript" src="web/formlib.js"> </script>
	<script type="text/javascript">
		window.onload = init();
		function removeClonedRow() {
			var rowToClone = document.getElementById("rowToClone");
			rowToClone.parentNode.removeChild(rowToClone);
		}
		</script>
</body>
</html>
