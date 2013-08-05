<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

	<div id="myElement" >Loading the player...</div>

<script type="text/javascript">
var movieplayer, swfPlayer;
$(function(){
   	
	var movieSrc = "${contenstSrc}";

	movieplayer = jwplayer("myElement").setup({
	   		flashplayer: "player/jwplayer.swf",
	        file: movieSrc,
	        width: 1027,
	        height: 768
	    }).onComplete(function(){
			alert("finish");
		});

}); 
</script>