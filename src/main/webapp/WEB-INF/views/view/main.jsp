<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<style>
.carousel-inner img {
	width: 100%;
	height: 100%;
}

.carousel-inner {
	height: 500px;
}

.thumbnail img {
	width: 100%;
}
</style>

<div id="carousel-example-generic" class="carousel slide">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="${contextPath}/img/olleh.jpg" alt="">
      <div class="carousel-caption">
       1
      </div>
    </div>
    <div class="item">
      <img src="${contextPath}/img/emptyGray.png" alt="">
      <div class="carousel-caption">
       2
      </div>
    </div>
    <div class="item">
      <img src="${contextPath}/img/slam.gif" alt="">
      <div class="carousel-caption">
       3
      </div>
    </div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
    <span class="icon-prev"></span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
    <span class="icon-next"></span>
  </a>
</div>

<br />
<br />


<div class="row">
  <div class="col-lg-4">
    <a href="play.do?contentsId=0" class="thumbnail">
      <img src="${contextPath}/img/bag.jpg" data-src="holder.js/100%x180" alt="썸네일 1">
    </a>
  </div>
  <div class="col-lg-4">
    <a href="play.do?contentsId=1" class="thumbnail">
      <img src="${contextPath}/img/bag.jpg" data-src="holder.js/100%x180" alt="썸네일 2">
    </a>
  </div>
  <div class="col-lg-4">
    <a href="play.do?contentsId=2" class="thumbnail">
      <img src="${contextPath}/img/bag.jpg" data-src="holder.js/100%x180" alt="썸네일 3">
    </a>
  </div>
</div>
