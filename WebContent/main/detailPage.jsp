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
				console.log(result.actors);
				$("#title").append(result.title);
				$("#actors").append(result.actors);
				$("#genre").append(result.genre);
				$("#feature").append(result.feature);
				$("#story").append(result.story);
				
				
			}
		})
	}
</script>
</head>
<body>
<!-- 서블렛에 의해 호출된 jsp파일 -->>
	<%
		String codeOb = (String)request.getAttribute("codeObject");
		out.println("테스트");
	%>
	<div id ="title"><h3>제목</h3></div>
	<div id ="actors"><h3>출연진</h3></div>
	<div id ="genre"><h3>장르</h3></div>
	<div id ="feature"><h3>특징</h3></div>
	<div id ="story"><h3>줄거리</h3></div>
	
</body>
</html>