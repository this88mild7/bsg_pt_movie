<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<tiles:insertAttribute name="head" />
</head>
<body>

	<header>
		<tiles:insertAttribute name="header" />
	</header>

	<div class="container contents">
		<div class="row">
			<div class="col-lg-2"><tiles:insertAttribute name="player-sidebar" /></div>
			<div class="col-lg-10"><tiles:insertAttribute name="content" /></div>
		</div>
	</div>

	<footer>
	<tiles:insertAttribute name="footer" />
	</footer>	

</body>
</html>




