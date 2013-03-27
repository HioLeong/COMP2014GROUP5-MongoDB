		var rows = 0;

		function init() {
			cloneRow();
		}

		function cloneRow() {
			var row = document.getElementById("rowToClone"); // find row to copy
			var table = document.getElementById("tableToModify") // find table to append to
			var clone = row.cloneNode(true); // copy children too
			clone.id = "row_"+rows++; // change id or other attributes/contents
			document.getElementById('add').style.display = 'table-cell'; //return add btn
			clone.style.display = 'table-row'
			addDelBtn(clone);
			table.appendChild(clone); // add new row to end of table
		}
		
		function makeReadOnly(clone){
			for (var i=0; i<clone.cells.length-1; i++) { //to avoid disappearance of del btn
				clone.cells[i].children[0].disabled = true; // MAKE READONLY //make uneditable already filled row
			}
		}
		
		function addDelBtn(clone){
			var rowlength = clone.cells.length;
			clone.cells[clone.cells.length-1].children[0].disabled = false;
		}
		
		function deleteRow(element){

			var elemToDelete = document.getElementById(element.parentNode.parentNode.id);
			var table = document.getElementById('tableToModify');
			elemToDelete.remove();
			rows--;
		}
		
		
		function selectClickChange(element) {
			var parentRow = element.parentNode.parentNode;
			var dropDown = element;
			var selectedText = dropDown.options[dropDown.selectedIndex].text;

			reset_fields(parentRow);
			
			if (selectedText == 'Text-field') {
				init_textfield_row(parentRow);
			} else if (selectedText == 'Checkbox group') {
				init_checkgroup_row(parentRow);
			} else if (selectedText == 'Radio group') {
				init_radiogroup_row(parentRow);
			} else if (selectedText == 'Time picker') {
				init_timepicker_row(parentRow);
			} else if (selectedText == 'Date picker') {
				init_datepicker_row(parentRow);
			} else if (selectedText == 'Calendar Date picker') {
				init_calendardatepicker_row(parentRow);
			}

		}	

		function reset_fields(row) {
			row.getElementsByClassName('input-type').item(0).style.display = 'none';
			row.getElementsByClassName('default-text').item(0).style.display = 'none';
			row.getElementsByClassName('group-options-1').item(0).style.display = 'none';
			row.getElementsByClassName('group-options-2').item(0).style.display = 'none';
			row.getElementsByClassName('time-picker').item(0).style.display = 'none';
			row.getElementsByClassName('date-picker').item(0).style.display = 'none';
			row.getElementsByClassName('calendar-date-picker').item(0).style.display = 'none';
			row.getElementsByClassName('dev').item(0).style.display = 'none';
			row.getElementsByClassName('form-array').item(0).style.display = 'none';
		}

		function init_textfield_row(row) {
			row.getElementsByClassName('input-type').item(0).style.display = 'table-cell';
			row.getElementsByClassName('default-text').item(0).style.display = 'table-cell';
		}

		function init_checkgroup_row(row) {
			row.getElementsByClassName('group-options-1').item(0).style.display = 'table-cell';
			row.getElementsByClassName('group-options-2').item(0).style.display = 'table-cell';
		}

		function init_radiogroup_row(row) {
			row.getElementsByClassName('group-options-1').item(0).style.display = 'table-cell';
			row.getElementsByClassName('group-options-2').item(0).style.display = 'table-cell';
		}

		function init_timepicker_row(row) {
			row.getElementsByClassName('time-picker').item(0).style.display = 'table-cell';
		}

		function init_datepicker_row(row) {
			row.getElementsByClassName('date-picker').item(0).style.display='table-cell';
		}

		function init_calendardatepicker_row(row) {
			row.getElementsByClassName('calendar-date-picker').item(0).style.display = 'table-cell';
		}

		function init_dropdown_row(row) {
		}