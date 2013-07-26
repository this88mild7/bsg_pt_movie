<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!-- 
HTML Style Guide 
 - No type or language attributes on script tags.
 - No type attribute on link or style tags.
 - http://contribute.jquery.org/style-guide/html/ 
-->

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/movie.css">
<link rel="stylesheet" href="js/flowplayer/skin/minimalist.css">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="js/jwplayer/jwplayer.js"></script>
<script src="js/flowplayer/flowplayer.min.js"></script>
<script src="js/bootstrap.min.js"></script>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />