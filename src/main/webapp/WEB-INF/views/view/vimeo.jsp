<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="row">
	<div class="col-lg-12">
		<ul class="nav nav-tabs">
			<li >
				<a href="${contextPath}/flowplayer.do">flow-player</a>
			</li>
			<li>
				<a href="${contextPath}/jwplayer.do">jw-palyer</a>
			</li>
			<li class="active">
				<a href="${contextPath}/vimeo.do">vimeo</a>
			</li>
		</ul>
		<div id="vimeoPlayer" >
			<!-- <iframe src="http://player.vimeo.com/video/27246366" width="600" height="300" frameborder="0" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe> -->
			<iframe src="http://player.vimeo.com/video/27246366?&color=999" width="700" height="400" frameborder="0" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>
		</div>
	</div>
</div>

<script type="text/javascript">
$(function(){
   	

}); 
</script>