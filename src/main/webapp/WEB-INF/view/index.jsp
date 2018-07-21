<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<title>Best Fit</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
 <script src="static/js/Jquery.js"></script>
<script src="static/js/bootstrap.min.js"></script>
 <script type="text/javascript">
        $(document).ready(function(){
  
   
            $("#age").focusout(function(){
            	  var data={
            		         age:$('input:text[name=age]').val(),
            		         weight:$('input:text[name=weight]').val(),
            		         height:$('input:text[name=height]').val(),
            		    };
            	  console.log(data);
                $.ajax({
                    type:"POST",
                    dataType:"json",
                    data:JSON.stringify(data),
                    contentType: "application/json; charset=utf-8",
                    url:"http://localhost:8080/calculatebmi",
                    success: function(response) {
                    	var info=response.bmireport;
                    	$("#bmisuggestion").html(""+info+""+response.image);
                    	$("#bmisuggestion").show();
                    },
                    error: function(jqXHR, textStatus, errorThrown) {
                        console.log(' Error in processing!');

                    }
                });
            });   
        });
    </script>
</head>
<body>
<h1>BEST FIT</h1>	
weight<input type="text" name="weight" id="weight"/><br>
height<input type="text" name="height" id="height"/><br>
Age<input type="text" name="age" id="age"/><br>


<div id="bmisuggestion" style="display:none;">

</div>

</form>






<br>

<a href="/fitrecomendation">tes</a>
	
</body>
</html>