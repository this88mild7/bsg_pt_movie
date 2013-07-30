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
	height: 200px;
	background-color: #fff;
}

.control-group-button {
	margin-left: 150px;
}
</style>

<script>
	// facebook 로딩 속도를 확보하기 위해 다음과 같은 코드를 사용할 수도 있다.
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
	
	$(function(){
			$("#facebooklogin").click(function(){
			    //페이스북 로그인 버튼을 눌렀을 때의 루틴.  
			        FB.login(function(response) {  
			        	if (response.session) {
			        		// accessToken
				            var accessToken = response.authResponse.accessToken;
				            windows.location.href="/movie/main.do";
		        		 } else {
		        		   // user cancelled login
		        		 }
			        }, {scope: 'publish_stream,user_likes'});  
				
			});	
		
		}
	);
	
	
</script>

<form class="form-horizontal" action="${contextPath}/auth.do">
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
      <button type="submit" class="btn btn-primary">로그인</button>
      <button id="facebooklogin" type="button" class="btn">facebook 로그인</button>
    </div>
  </div>
</form>