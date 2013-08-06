<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

/storyfarm/source/${src_path}
<div class="row">
	<div class="col-lg-12">
		<div id="01" class="flowplayer" data-swf="player/flowplayer.swf" >
			<video>
				<source type="video/flash" src="/storyfarm/source/${src_path}">
			</video>
		</div>
	</div>			
</div>

<script>
$(function() {
	var api = flowplayer();
	api.bind("finish", function() {
		alert("finish");
	});
});
</script>
