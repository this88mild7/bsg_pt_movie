<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8" %>
<!doctype html>
<head>

   <!-- bootstrap -->
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">


   <!-- player skin -->
   <link rel="stylesheet" type="text/css" href="js/player/skin/minimalist.css">

   <!-- site specific styling -->
   <style type="text/css">
   body { font: 12px "Myriad Pro", "Lucida Grande", sans-serif; text-align: center; padding-top: 5%; }
   .flowplayer { width: 80%; }
   </style>

   <!-- flowplayer depends on jQuery 1.7.1+ (for now) -->
   <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>

   <!-- include flowplayer -->
   <script type="text/javascript" src="js/player/flowplayer.min.js"></script>
   
   <script type="text/javascript">
    $(function(){
	   
	   var api = flowplayer();
	   
	   api.bind("load", function () {
		   
	   }).bind("ready", function () {
		   
	   }).bind("finish", function () {
		   alert("finish");
	   });
	   
   }); 
   
   </script>

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

			<form method="post" action="/movie/main.do">
		아이디 : <input type="text" class="contents"  name="id" value="">
		<br>
		비밀번호 : <input type="text" class="contents"  name="pwd" value="">
		<br>
		<input type="submit" name="login" class="btn" value="확인">
	</form>
	</div>


		<div class="flowplayer" data-swf="player/flowplayer.swf" data-ratio="0.4167">
      <video>
         <source type="video/mp4" src="http://stream.flowplayer.org/bauhaus/624x260.mp4">
      </video>
   </div>

</body>
