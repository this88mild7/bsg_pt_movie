<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    

<div class="well">카테고리 영역</div>
<c:forEach var="category" items="${cateList}">
<div class="well"><a href="${contextPath}/sub.do?cateId=${category.cateId}">${category.cateName}</a></div>
</c:forEach>
