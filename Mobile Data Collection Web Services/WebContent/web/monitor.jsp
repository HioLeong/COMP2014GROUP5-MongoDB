<!DOCTYPE html>
<html>
  <head>
    <title>R analysis</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
	<style type="text/css">
      body {
        padding-top: 100px;
        padding-bottom: 40px;
      }
      .sidebar-nav {
        padding: 9px 0;
      }

      @media (max-width: 980px) {
        /* Enable use of floated navbar text */
        .navbar-text.pull-right {
          float: none;
          padding-left: 5px;
          padding-right: 5px;
        }
      }
    </style>
<link
	href="${pageContext.request.contextPath}/web/css/bootstrap.min.css"
	rel="stylesheet" media="screen">
<link
	href="${pageContext.request.contextPath}/web/css/formgenerator.css"
	rel="stylesheet" media="screen>">
  </head>
  <body>
	
	
	<div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <a class="brand" href="#">
		  <form>
			Patient NHS Number: <input type="text" class="span2" value = "00000001"placeholder="Type in NHS Number">
		  </form></a>
        </div>
      </div>
    </div>

    <div class="container-fluid">
		<div class="row-fluid">
			<div class="hero-unit">
				<h2>R analysis</h2>
				<p>Provides graphical analysis on the patients data monitoring</p>
			</div><!-- .hero-unit -->
		 </div>
	
      <div class="row-fluid">
        <div class="span4">
          <div class="well sidebar-nav">
            <ul class="nav nav-list">
			  <li class="nav-header">Patient name:</li>John Smith
			  <li class="nav-header">Hospital Number:</li>00000001
			  <li class="nav-header">Admission Date:</li>01/01/2013
			  <li class="nav-header">Notes:</li>
            </ul>
          </div><!--/.well -->
        </div><!--/span-->
        <div class="span8">
          <div class="hero-unit">
            <p>
			<div class="row-fluid">
			<form>
			<div class="span4">
        <select>
			<option value="allweeks">Weeks</option>
			<option value="week1">Week 1</option>
			<option value="week2">Week 2</option>
			<option value="week3">Week 3</option>
		</select>
			</div><!--/span-->
			<div class="span4">
        <select onchange=update_image(this)>
			<option value="allcat">All categories</option>
			<option value="physical">Physical</option>
			<option value="weight-loss">Weight Loss</option>
			<option value="intake">Intake</option>
			<option value="np-status">Neurological Status</option>
		</select>
			</div><!--/span-->
		</form>
		</div><!--/row-->
			</p>
			<div class="row-fluid">
				<img id="image" src="${pageContext.request.contextPath}/web/img/image.png"/>
			</div><!--/row-->
          </div>
         
        </div><!--/span-->
      </div><!--/row-->

      <hr>

      <footer>
        <p>&copy; Company 2013</p>
      </footer>

    </div><!--/.fluid-container-->
	
    <script type="text/javascript">
      function update_image(sel) {
        var value = sel.options[sel.selectedIndex].value;
        if (value == "appetite") {
        document.getElementById("image").src = "${pageContext.request.contextPath}/web/img/appetite_image.png"
        } 
        if (value == "intake") {
        document.getElementById("image").src = "${pageContext.request.contextPath}/web/img/intake_image.png"
        }
        if (value == "np-status") {
        document.getElementById("image").src = "${pageContext.request.contextPath}/web/img/npstatus_image.png"
        }
        if (value == "weight-loss") {
        document.getElementById("image").src = "${pageContext.request.contextPath}/web/img/weightloss_image.png"
        }
        if (value == "physical") {
        document.getElementById("image").src = "${pageContext.request.contextPath}/web/img/physical_image.png"
        } 
        if (value =="allcat") {
          document.getElementById("image").src = "${pageContext.request.contextPath}/web/img/image.png"
        }

      }

    </script>
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="/js/bootstrap.min.js"></script>
  </body>
</html>