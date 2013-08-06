<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    

<div class="well">카테고리 영역</div>
<c:forEach var="brand" items="${brandList}">
<div class="well"><a href="${contextPath}/sub.do?brandId=${brand.BRAND_ID}">${brand.BRAND_NM}</a></div>
</c:forEach>
