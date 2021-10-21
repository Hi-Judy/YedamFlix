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
		String detail_code = request.getParameter("code");
	%>
	
	window.onload = function(){
		detailPageLoad()
	}
	
	function detailPageLoad(){
		$.ajax({
			url: '../DetailPageServlet',
			type: 'get',
			data: {code: "<%=detail_code%>"},
			dataType: 'json',
			success: function(result){
				//image.setAttribute('src', '../images/' +result.image);
				document.getElementById('title').value = result.title;
				document.getElementById('actors').value = result.actors;
				document.getElementById('genre').value = result.genre;
				document.getElementById('feature').value = result.feature;
				document.getElementById('story').value = result.story;
				
				console.log(result);
			},
			error: function(reject){
				window.alert(오류);
			}
			
		});
		
	}

	
	
	}
</script>
</head>
<body>

<!-- 서블렛에 의해 호출된 jsp파일 -->>
	<%
		String code = (String)request.getAttribute("codeObject");
		out.println("테스트"+code);
	%>
	<div id ="title"><h3>제목</h3></div>
	<div id ="actors"><h3>출연진</h3></div>
	<div id ="genre"><h3>장르</h3></div>
	<div id ="feature"><h3>특징</h3></div>
	<div id ="story"><h3>줄거리</h3></div>
	

</body>
</html>