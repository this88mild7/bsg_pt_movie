<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8" %>
<!doctype html>
<head>

   <!-- bootstrap -->
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">


</head>

<style>

body {
	padding-top: 100px;
	background-color: #f5f5f5;
}

.form-horizontal {
	max-width: 300px;
	padding: 19px 29px 29px;
	margin: 0 auto 20px;
	background-color: #fff;
	border: 1px solid #e5e5e5;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
	-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
}

.control-group-button {
	margin-left: 150px;
	
}

</style>

<body>
   <!-- bootstrap & jquery -->
   <script src="http://code.jquery.com/jquery.js"></script>
   <script src="js/bootstrap.min.js"></script>
   
   	<div class="container">
	<form class="form-horizontal" method="post" action="/movie/main.do">
			<div class="control-group">
				<input type="text" class="contents"  name="id" value="" placeholder="아이디를 입력하세요">
			</div>
			<div class="control-group">
				<input type="text" class="contents"  name="pwd" value="" placeholder="비밀번호를 입력하세요">
			</div>
			<div class="control-group-button">
				<button type="submit" class="btn">Sign in</button>
			</div>
		</form>
	</div>


</body>
