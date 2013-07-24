<!doctype html>

<head>

   <!-- player skin -->
   <link rel="stylesheet" type="text/css" href="js/flowplayer/skin/minimalist.css">

   <!-- site specific styling -->
   <style type="text/css">
   body { font: 12px "Myriad Pro", "Lucida Grande", sans-serif; text-align: center; padding-top: 5%; }
   .flowplayer { width: 80%; }
   </style>

   <!-- flowplayer depends on jQuery 1.7.1+ (for now) -->
   <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>

   <!-- include flowplayer -->
   <script type="text/javascript" src="js/flowplayer/flowplayer.min.js"></script>
   
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
	
   <div class="flowplayer" data-swf="player/flowplayer.swf" data-ratio="0.4167">
      <video>
         <source type="video/mp4" src="${movie}">
      </video>
   </div>

</body>
