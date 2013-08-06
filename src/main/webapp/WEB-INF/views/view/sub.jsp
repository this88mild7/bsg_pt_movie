<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<style>
.thumbnail img {
	width: 100%;
}
</style>


	 <div class="row">
<c:forEach items="${contensList}" var="contents">
			  <div class="col-lg-4">
			    <a href="play.do?itemId=${contents.ITEM_ID}" class="thumbnail">
			      <img src="" data-src="holder.js/100%x180" alt="${contents.ITEM_NM}">
			    </a>
			  </div>
</c:forEach>
	   </div>


<div class="text-center">
	<ul class="pagination">
	  <li class="active"><a href="#">&laquo;</a></li>
	  <li><a href="#">1</a></li>
	  <li><a href="#">2</a></li>
	  <li><a href="#">3</a></li>
	  <li><a href="#">4</a></li>
	  <li><a href="#">5</a></li>
	  <li><a href="#">&raquo;</a></li>
	</ul>
</div>
