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
	console.log(<%=code%>);
	window.onload = function(){
		clickPage();
	}
	
	function clickPage(){
		$.ajax({
			url: '../DetailPageServlet',
			type: 'get',
			data: {code: <%=code%>},
			dataType: 'json',
			success: function(result){
				<%=request.getAttribute("content") %> 
				console.log(result);
			}
		})
	}
</script>
</head>
<body>

</body>
</html>