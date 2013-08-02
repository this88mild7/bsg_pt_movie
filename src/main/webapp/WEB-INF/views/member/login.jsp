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
<script src="http://platform.twitter.com/anywhere.js?id=CBn666ysOIEVuy2Y5vUjA&v=1"></script >
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
			        	console.log(response);
			        	console.log(response.authResponse.userID);
			        	if (response.authResponse) {
			        		// accessToken
				            var accessToken = response.authResponse.accessToken;
				            FB.api('/me', function(userInfo) {
					            $.post("facebooklogin.do",  {
									                		'facebook_userID' : response.authResponse.userID,
									                		'user_name ' : userInfo.name,
									                		'user_email' : userInfo.email
									                }, 
									                function(data) {
															console.log(data);
															if(data.code ="200"){
													            window.location.href="/movie/main.do";
															}else{
																alert("facebook 로그인 오류가 발생 하였습니다.");
															}
														});
						        		 
				         		     });
					        	} else {
				        			 alert("facebook 로그인 오류가 발생 하였습니다.");
				        		 }
			       			 }, {scope: 'publish_stream,email,user_likes'});  
				
			});
		}
	);
	
	
	
</script>
 
<!-- google -->
 

<form class="form-horizontal" action="${contextPath}/auth.do">
	<fieldset>
	  <legend class="text-center"><h1>스토리팜</h1></legend>
	  <div class="form-group">
	    <label for="inputEmail" class="col-lg-3 control-label">아이디</label>
	    <div class="col-lg-9">
	      <input type="text" class="form-control" id="inputId" name="member_id"placeholder="아이디">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputPassword" class="col-lg-3 control-label">비밀번호</label>
	    <div class="col-lg-9">
	      <input type="password" class="form-control" id="inputPwd" name="member_pw" placeholder="비밀번호">
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
	      <button id="facebooklogin" type="button" class="btn">facebook 로그인</button>
	      <button id="googlelogin" type="button" class="btn">google 로그인</button>
	    </div>
	  </div>
	</fieldset>
   <script type="text/javascript">
      // Enter a client ID for a web application from the Google Developer Console.
      // The provided clientId will only work if the sample is run directly from
      // https://google-api-javascript-client.googlecode.com/hg/samples/authSample.html
      // In your Developer Console project, add a JavaScript origin that corresponds to the domain
      // where you will be running the script.
      var clientId = '143740392889.apps.googleusercontent.com';

      // Enter the API key from the Google Develoepr Console - to handle any unauthenticated
      // requests in the code.
      // The provided key works for this sample only when run from
      // https://google-api-javascript-client.googlecode.com/hg/samples/authSample.html
      // To use in your own application, replace this API key with your own.
      var apiKey = 'AIzaSyBPeZ3nx3XzLoxDBE7BQz4-4LUn8bQIXlc';

      // To enter one or more authentication scopes, refer to the documentation for the API.
      var scopes = 'https://www.googleapis.com/auth/plus.me';

      // Use a button to handle authentication the first time.
      function handleClientLoad() {
        gapi.client.setApiKey(apiKey);
        window.setTimeout(checkAuth,1);
      }

      function checkAuth() {
        gapi.auth.authorize({client_id: clientId, scope: scopes, immediate: true}, handleAuthResult);
      }


      function handleAuthResult(authResult) {
        var authorizeButton = document.getElementById('googlelogin');
        if (authResult && !authResult.error) {
          authorizeButton.style.visibility = 'hidden';
          makeApiCall();
        } else {
          authorizeButton.style.visibility = '';
          authorizeButton.onclick = handleAuthClick;
        }
      }

      function handleAuthClick(event) {
        gapi.auth.authorize({client_id: clientId, scope: scopes, immediate: false}, handleAuthResult);
        return false;
      }

      // Load the API and make an API call.  Display the results on the screen.
      function makeApiCall() {
        gapi.client.load('plus', 'v1', function() {
          var request = gapi.client.plus.people.get({
            'userId': 'me'
          });
          request.execute(function(resp) {
        	  console.log(resp);
        	 // window.location.href="/movie/main.do";
          });
        });
      }
    </script>
    <script src="https://apis.google.com/js/client.js?onload=handleClientLoad"></script>
</form>