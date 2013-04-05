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
			clone.style.display = 'table-row';
			addDelBtn(clone);
			table.appendChild(clone); // add new row to end of table
		}

		function addRow(type, id, name, first_field, second_field) {
			var row = document.getElementById("rowToClone");
			var table = document.getElementById("tableToModify");
			var clone = row.cloneNode(true);

			clone.id = id;

			document.getElementById('add').style.display = 'table-cell'; //return add btn
			clone.style.display = 'table-row';

			table.appendChild(clone);
			addDelBtn(clone);

			clone.getElementsByClassName('id').item(0).getElementsByTagName('input').item(0).value = id;
			clone.getElementsByClassName('name').item(0).getElementsByTagName('input').item(0).value = name;

			reset_fields(clone);

			var selector = clone.getElementsByClassName('formselect').item(0).getElementsByTagName('select').item(0);

			if (type == 'text-field') {
				set_selector(selector,'text-field');
				init_textfield_row(clone, first_field, second_field);
			}
			if (type == 'check-group') {
				set_selector(selector,'check-group');
				init_checkgroup_row(clone, first_field, second_field);
			}
			if (type == 'radio-group') {
				set_selector(selector,'radio-group');
				init_radiogroup_row(clone, first_field, second_field);
			}
			if (type == 'drop-down') {
				set_selector(selector,'drop-down');
				init_dropdownlist_row(clone, first_field, second_field);
			}
			if (type == 'date-picker') {
				set_selector(selector,'date-picker');
				init_datepicker_row(clone,first_field);
			}

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
				init_textfield_row(parentRow,'string','text');
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
			} else if (selectedText == 'Drop-down list','dropDown') {
				init_dropdownlist_row(parentRow);
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

		function init_textfield_row(row, input_type, default_text) {

			var inputType = row.getElementsByClassName('input-type').item(0);
			var defaultText = row.getElementsByClassName('default-text').item(0);

			inputType.style.display = 'table-cell';
			defaultText.style.display = 'table-cell';

			if (typeof(input_type) == 'undefined') input_type = 'text-field';
			if (typeof(default_text) == 'undefined') default_text = 'undefined';

			inputType.getElementsByTagName('select').item(0).value = input_type;

			for(var i, j = 0; i = inputType.getElementsByTagName('select').item(0).options[j]; j++) {
				if(i.value == input_type) {
					inputType.getElementsByTagName('select').item(0).selectedIndex = j;
					break;
				}
			}
			defaultText.getElementsByTagName('input').item(0).value = default_text;

		}

		function init_checkgroup_row(row, group_items, group_index) {

			var groupItems = row.getElementsByClassName('group-options-1').item(0);
			var groupIndex = row.getElementsByClassName('group-options-2').item(0);

			groupItems.style.display = 'table-cell';
			groupIndex.style.display = 'table-cell';

			if (typeof(group_items) == 'undefined') group_items = '';
			if (typeof(group_index) == 'undefined') group_index = '';

			groupItems.getElementsByTagName('input').item(0).value = group_items;
			groupIndex.getElementsByTagName('input').item(0).value = group_index;

		}

		function init_radiogroup_row(row,group_items, group_index) {
			var groupItems = row.getElementsByClassName('group-options-1').item(0);
			var groupIndex = row.getElementsByClassName('group-options-2').item(0);

			groupItems.style.display = 'table-cell';
			groupIndex.style.display = 'table-cell';

			if (typeof(group_items) == 'undefined') group_items = '';
			if (typeof(group_index) == 'undefined') group_index = '';

			groupItems.getElementsByTagName('input').item(0).value = group_items;
			groupIndex.getElementsByTagName('input').item(0).value = group_index;
		}

		function init_timepicker_row(row, starting_time) {

			var timePicker = row.getElementsByClassName('time-picker').item(0);

			timePicker.style.display = 'table-cell';

			if (typeof(starting_time) == 'undefined') starting_time = '';

			timePicker.getElementsByTagName('input').item(0).value = starting_time; 

		}

		function init_datepicker_row(row, starting_date) {

			var datePicker = row.getElementsByClassName('date-picker').item(0);

			datePicker.style.display = 'table-cell';

			if (typeof(starting_date) == 'undefined') starting_date = '';

			datePicker.getElementsByTagName('input').item(0).value = starting_date; 

		}

		function init_calendardatepicker_row(row) {
			row.getElementsByClassName('calendar-date-picker').item(0).style.display = 'table-cell';
		}

		function init_dropdownlist_row(row) {
			row.getElementsByClassName('group-options-1').item(0).style.display = 'table-cell';
			row.getElementsByClassName('group-options-2').item(0).style.display = 'table-cell';
		}

		function set_selector(selector, item) {
			for(var i, j = 0; i = selector.options[j]; j++) {
				if(i.value == item) {
					selector.selectedIndex = j;
					break;
				}
			}
		}