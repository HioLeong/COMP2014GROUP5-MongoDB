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
			// makeReadOnly(clone);
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

			var parentElement = element.parentNode;
			var dropDown = parentElement.getElementById('formselect');
			var selectedText = dropDown.options[dropDown.selectedIndex].text;

			reset_fields();
			
			if (selectedText == 'Text-field') {
				init_textfield_row();
			} else if (selectedText == 'Checkbox group') {
				init_checkgroup_row();
			}

		}	


		function reset_fields() {
			document.getElementById('text2').style.display = 'none';
			document.getElementById('check_rad1').style.display = 'none';
			document.getElementById('check_rad2').style.display = 'none';
			document.getElementById('time').style.display = 'none';
			document.getElementById('date').style.display = 'none';
			document.getElementById('calendar').style.display = 'none';
			document.getElementById('devel').style.display = 'none';
			document.getElementById('form').style.display = 'none';
		}

		function init_textfield_row() {
			document.getElementById('text1').style.display = 'table-cell';
			document.getElementById('text2').style.display= 'table-cell';
		}

		function init_checkgroup_row() {
			document.getElementById('check_rad1').style.display = 'table-cell';
			document.getElementById('check_rad2').style.display = 'table-cell';
		}

		function init_radiogroup_row() {
			document.getElementById('check_rad1').style.display = 'table-cell';
			document.getElementById('check_rad2').style.display = 'table-cell';
		}
