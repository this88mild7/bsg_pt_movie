<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<style>
body {
	padding-top: 100px;
	background-color: #f5f5f5;
}

.form-horizontal {
	padding: 20px 30px;
	margin: 0 auto 20px;
	max-width: 500px;
	height: 300px;
	background-color: #fff;
}

.control-group-button {
	margin-left: 150px;
}
</style>

<script>
	// facebook
	window.fbAsyncInit = function() {  
	    FB.init({appId: '168258180024105', status: true, cookie: true,xfbml: true});      
	};  
	      
	(function(d){  
	   var js, id = 'facebook-jssdk', ref = d.getElementsByTagName('script')[0];  
	   if (d.getElementById(id)) {return;}  
	   js = d.createElement('script'); js.id = id; js.async = true;  
	   js.src = "//connect.facebook.net/en_US/all.js";  
	   ref.parentNode.insertBefore(js, ref);  
	 }(document));     
	
	$("#facebooklogin").onclick(function(){
	    //페이스북 로그인 버튼을 눌렀을 때의 루틴.  
	        FB.login(function(response) {  
	            var fbname;  
	            var accessToken = response.authResponse.accessToken;  
	        }, {scope: 'publish_stream,user_likes'});  
		
	});
</script>

<form class="form-horizontal" action="${contextPath}/auth.do">
	<fieldset>
	  <legend class="text-center"><h1>스토리팜</h1></legend>
	  <div class="form-group">
	    <label for="inputEmail" class="col-lg-3 control-label">아이디</label>
	    <div class="col-lg-9">
	      <input type="text" class="form-control" id="inputId" placeholder="아이디">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputPassword" class="col-lg-3 control-label">비밀번호</label>
	    <div class="col-lg-9">
	      <input type="password" class="form-control" id="inputPwd" placeholder="비밀번호">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputPassword" class="col-lg-3 control-label"></label>
	    <div class="col-lg-9">
	      아직 회원이 아니세요? <a href="${contextPath}/join.do">가입하기</a>
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputPassword" class="col-lg-3 control-label"></label>
	    <div class="col-lg-9">
	      <button type="submit" class="btn btn-primary">로그인</button>
	    </div>
	  </div>
	</fieldset>
</form>