<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="UTF-8"%>



<style>
</style>    
<<<<<<< HEAD

<div class="container">
	<div class="navbar">
	  <a class="navbar-brand" href="${contextPath}">스토리팜</a>
	  <ul class="nav navbar-nav">
	    <li><a href="${contextPath}/main.do">메인</a></li>
	    <li><a href="${contextPath}/sub.do">서브</a></li>
	    <li><a href="${contextPath}/flowplayer.do">플레이</a></li>
	  </ul>
	  <ul class="nav navbar-nav pull-right">
	    <li><a href="${contextPath}/login.do">로그인/로그아웃</a></li>
	  </ul>
=======
<div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="brand" href="/lucky"></a>
			<div class="nav-collapse collapse">
				<ul class="nav">
					<li><a href="/${pageContext.request.contextPath}/main.do">메인</a></li>
					<li><a href="/${pageContext.request.contextPath}/sub.do">서브</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
			<!-- USER INFOMATION -->
			<div class="btn-group pull-right" style="margin-top:5px; line-height:46px;">
				<button class="btn">로그인</button>
			</div>
			<!-- USER INFOMATION -->
		</div>
>>>>>>> 패키지 분류
	</div>
</div>

<script>
$(function(){
});
</script>