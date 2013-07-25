<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>

<head>
	<%@ include file="commonLib.jsp" %>  	
   
   <script type="text/javascript">
	var player;
	$(function(){
    	
		var movieSrc = "${movie}";
	  
		player = jwplayer("myElement").setup({
		   		flashplayer: "player/jwplayer.swf",
		        file: movieSrc,
		        width: 1027,
		        height: 768
		    });
	
		player.onComplete(function(){
			alert("finish");
		});
   }); 
    
   
   </script>

</head>



<body >
	<ul class="nav nav-tabs">
		<li >
			<a href="${contextPath}/flowplayer.do">flow-player</a>
		</li>
		<li class="active">
			<a href="${contextPath}/jwplayer.do">jw-palyer</a>
		</li>
		<li  class="disabled">
			<a href="#">vimeo</a>
		</li>
	</ul>
	
	<div id="myElement" >Loading the player...</div>

</body>
