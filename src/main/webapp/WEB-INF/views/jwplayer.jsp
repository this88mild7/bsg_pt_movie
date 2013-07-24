<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>

<head>


   <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>

   <script type="text/javascript" src="js/jwplayer/jwplayer.js"></script>
   
   <script type="text/javascript">
    $(function(){
    	
    	var movieSrc = "${movie}";
	   
		var player = jwplayer("myElement").setup({
	    		flashplayer: "player/jwplayer.swf",
		        file: movieSrc,
		        height: 480,
		        width: 600
		    });
		
		player.onComplete(function(){
			alert("finish");
		});
   }); 
    
   
   </script>

</head>

<body >
	
		<div align="center"  id="myElement">Loading the player...</div>

</body>
