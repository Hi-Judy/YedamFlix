<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DetailPage</title>
<script src="../jquery/jquery-3.6.0.min.js"></script>

<script>
	<%
		String code = request.getParameter("code");
	%>
	
	window.onload = function(){
		clickPage();
	}
	
	function clickPage(){
		$.ajax({
			url: '../DetailPageServlet',
			type: 'post',
			data: {code: <%=code%>},
			dataType: 'json',
			success: function(result){
				console.log(result);
			}
		})
	}
</script>
</head>
<body>

</body>
</html>