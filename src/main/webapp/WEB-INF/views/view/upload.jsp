<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<link rel="stylesheet" href="css/bootstrap-fileupload.min.css">

<script src="js/bootstrap-fileupload.min.js"></script>

<form class="form-horizontal" action="${contextPath}/upload.do" method="POST" enctype="multipart/form-data">
<fieldset>
	  <div class="form-group">
	  	
	    <label for="brand_nm" class="col-lg-3 control-label">브랜드 이름</label>
	    <div class="col-lg-6">
						<select size="1" name="brand_nm">
							<c:forEach items="${ brandList }" var="brand">
								<option value="${ brand.BRAND_NM }" >${ brand.BRAND_NM }</option>
							</c:forEach>
						</select>
				</div>
	  </div>
	  <div class="form-group">
	    <label for="item_nm" class="col-lg-3 control-label">콘텐츠 명</label>
	    <div class="col-lg-6">
	      <input type="text" class="form-control" id="item_nm" name="item_nm"placeholder="콘텐츠 명">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="item_desc" class="col-lg-3 control-label">콘텐츠 설명</label>
	    <div class="col-lg-6">
	      <input type="text" class="form-control" id="item_desc" name="item_desc" placeholder="콘텐츠 설명">
	    </div>
	  </div>
	  <div class="form-group">
		    <label for="item_desc" class="col-lg-3 control-label">원본 파일</label>
		    <div class="col-lg-6">
		      <input type="file"  id="item_file" name="item_file" placeholder="파일경로">
		    </div>
	    </div>
	  <div class="form-group">
		    <label for="item_desc" class="col-lg-3 control-label"></label>
		    <div class="col-lg-6">
	      		<button id="cancel" type="button" class="btn">취소</button>
		    	<button type="submit" class="btn btn-primary">등록</button>
		    </div>
	    </div>
	</fieldset>
</form>

