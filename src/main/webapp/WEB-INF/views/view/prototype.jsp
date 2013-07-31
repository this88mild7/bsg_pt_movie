<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8" %>
<!doctype html>
<head>

   <!-- bootstrap -->
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">


</head>

<style>
.thumbnails {
	margin-top: 100px;
}

.learn-btn {
	margin-top: 10px;
	width: 100%;
}


</style>

<body>
   <!-- bootstrap & jquery -->
   <script src="http://code.jquery.com/jquery.js"></script>
   <script src="js/bootstrap.min.js"></script>
   	<div class="container">
   	<c:out value="나의 등급은 : ${login.id }"></c:out>
				<c:forEach var="balance" items="${userList}" varStatus="status">
					<tr>
						<td>${balance.access}</td>
					</tr>
				</c:forEach>
				
	<ul class="thumbnails">
		<li class="span3"><a href="#" class="thumbnail"> 
		<p>무료</p>
		<img src="img/260_180.png" data-src="holder.js/300x200" alt=""></a>
		<button class="learn-btn btn" type="button">학습하기</button>
		</li>
		<li class="span3"><a href="#" class="thumbnail"> 
		<p>무료</p>
		<img src="img/260_180.png" data-src="holder.js/300x200" alt=""></a>
		<button class="learn-btn btn" type="button">학습하기</button>
		</li>
		<li class="span3"><a href="#" class="thumbnail"> 
		<p>무료</p>
		<img src="img/260_180.png" data-src="holder.js/300x200" alt=""></a>
		<button class="learn-btn btn" type="button">학습하기</button>
		</li>
		<li class="span3"><a href="#" class="thumbnail"> 
		<p>유료</p>
		<img src="img/260_180.png" data-src="holder.js/300x200" alt=""></a>
		<button class="learn-btn btn" type="button">학습하기</button>
		</li>
	</ul>
	</div>
</body>
