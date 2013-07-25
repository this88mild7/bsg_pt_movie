<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>

<head>

	<%@ include file="commonLib.jsp" %>
	<style type="text/css">
		.flowplayer { width: 1027; height:768; }
	</style>
   
   <script type="text/javascript">
    $(function(){
	   
	   var api = flowplayer();
	   
	   api.bind("finish", function () {
		   alert("finish");
	   });
	   
	   
   }); 
   
   </script>

</head>

<body>

	<ul class="nav nav-tabs">
		<li class="active">
			<a href="#">flow-player</a>
		</li>
		<li>
			<a href="${contextPath}/jwplayer.do">jw-palyer</a>
		</li>
		<li  class="disabled">
			<a href="#">vimeo</a>
		</li>
	</ul>
				
	<div id="01" class="flowplayer" data-swf="player/flowplayer.swf" >
		<video>
			<source type="video/mp4" src="${movie}">
		</video>
	</div>
	<div id="02" class="flowplayer" data-swf="player/flowplayer.swf" >
		<!-- 
		<embed src="main.swf" width="550" height="400" wmode="transparent" />
		 -->
		<embed src="${swfSrc}"/>
	</div>

</body>
