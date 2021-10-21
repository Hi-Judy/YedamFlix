<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DetailPage</title>
<script src="../jquery/jquery-3.6.0.min.js"></script>
<link href="detailPage.css" rel="stylesheet" />
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
                $("#grade").append(result.grade);
                $("#opendate").append(result.opendate);
				let imgTag = $('<img />').attr({src : '../images/' + result.image});
                $('#img').append(imgTag);
				
			}
		})
	}
	
	function inout() {
        let loginbtn = document.getElementById('loginbtn');
        let userid = sessionStorage.getItem('userid');
        let userpw = sessionStorage.getItem('userpw');
        console.log(`id : ${userid}, pw : ${userpw}`)

        if(userid==null && userpw==null) {
            loginbtn.innerText = "로그인";
            console.log('로그인');
            console.log(`id : ${userid}, pw : ${userpw}`);
            location.href='../login/login.html';
        } else{
        	sessionStorage.removeItem('userid');
        	sessionStorage.removeItem('userpw');
        	
        	alert('로그아웃');
        	location.reload();
        }
    }
</script>
</head>
<body>
<!--Navigation 기본 구성-->
    <nav>
        <div id="logo">
        <input id ="logo_btn" type='button' value='YedamFlix' onclick="location.href='../main/main.html'">
        </div>
        <div id="menu">
            <form>
                <input id ="input2" type='button' value='TV' onclick="location.href='../main/tv.html'">
                <input id ="input3" type='button' value='영화' onclick="location.href='../main/movie.html'">
            </form>
        </div>
        <div id="btnLogin">
            <button type="button" onclick=inout() id="loginbtn">로그인</button>
        </div>
    </nav>
    
    
<!-- 서블렛에 의해 호출된 jsp파일 -->
	<%
		String codeOb = (String)request.getAttribute("codeObject");
	%>
	
	<br>
	<div id ="img"></div>

	<table>
		<tr>
			<td><h3>제목&ensp;</h3></td>
			<td id ="title"></td>
		</tr>
		<tr>
			<td><h3>출연진&ensp;</h3></td>
			<td id ="actors"></td>
		</tr>
		<tr>
			<td><h3>장르&ensp;</h3></td>
			<td id ="genre"></td>
		</tr>
		<tr>
			<td><h3>특징&ensp;</h3></td>
			<td id ="feature"></td>
		</tr>
		<tr>
			<td><h3>줄거리&ensp;</h3></td>
			<td id ="story"></td>
		</tr>
		<tr>
			<td><h3>등급&ensp;</h3></td>
			<td id ="grade"></td>
		</tr>
		<tr>
			<td><h3>방영일&ensp;</h3></td>
			<td id ="opendate"></td>
		</tr>
		
	</table>	
	<script>
    (function sessionCheck() {
    	let loginbtn = document.getElementById('loginbtn');
        let userid = sessionStorage.getItem('userid');
        let userpw = sessionStorage.getItem('userpw');
        console.log(`id : ${userid}, pw : ${userpw}`)
        
        if(userid==null && userpw==null) {
            loginbtn.innerText = "로그인";
            console.log('로그인');
            console.log(`id : ${userid}, pw : ${userpw}`);
        } else {
            loginbtn.innerText = "로그아웃";
            console.log('로그아웃');
            console.log(`id : ${userid}, pw : ${userpw}`);
            //location.href='main.html'
    }
    }());
    </script>
</body>
</html>