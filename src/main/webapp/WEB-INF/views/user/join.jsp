<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<style>
body {
	padding-top: 100px;
	background-color: #f5f5f5;
}

.form-horizontal {
	padding: 20px 30px;
	margin: 0 auto 20px;
	max-width: 500px;
	height: 350px;
	background-color: #fff;
}

.control-group-button {
	margin-left: 150px;
}
</style>

<form class="form-horizontal" action="${contextPath}/auth.do">
	<fieldset>
	  <legend class="text-center"><h1>스토리팜</h1></legend>
	  <div class="form-group">
	    <label for="inputEmail" class="col-lg-3 control-label">아이디</label>
	    <div class="col-lg-9">
	      <input type="text" class="form-control" id="inputId" placeholder="아이디">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputEmail" class="col-lg-3 control-label">이름</label>
	    <div class="col-lg-9">
	      <input type="text" class="form-control" id="inputName" placeholder="이름">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputPassword" class="col-lg-3 control-label">비밀번호</label>
	    <div class="col-lg-9">
	      <input type="password" class="form-control" id="inputPwd" placeholder="비밀번호">
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputPassword" class="col-lg-3 control-label"></label>
	    <div class="col-lg-9">
	      이미 회원이세요? <a href="${contextPath}/login.do">로그인하기</a>
	    </div>
	  </div>
	  <div class="form-group">
	    <label for="inputPassword" class="col-lg-3 control-label"></label>
	    <div class="col-lg-9">
	      <button type="submit" class="btn btn-primary">가입하기</button>
	    </div>
	  </div>
  </fieldset>
</form>