<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
<style>
div {
	text-align: center;
}
img {
	width: 60%;
	height: 60%;
}
</style>
</head>
<body>
	<div>
		<img alt="현재 이미지를 불러올수 없습니다." src="img/404.jpg">
		<p>
			<a href="javascript:history.back(-1);">뒤로</a> 혹은 <a href="/lucky">첫 화면</a>으로 이동할 수 있습니다. 
		</p>
	</div>
</body>
</html>