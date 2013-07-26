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

	<div class="container-fluid contents">
		<div class="row-fluid">
			<div class="span2"><tiles:insertAttribute name="sidebar" /></div>
			<div class="span10"><tiles:insertAttribute name="content" /></div>
		</div>
	</div>

	<footer>
	<tiles:insertAttribute name="footer" />
	</footer>	

</body>
</html>




