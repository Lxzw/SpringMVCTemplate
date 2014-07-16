<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="style/style.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.11.1.js">
</script>
<script type="text/javascript">
$(document).ready(function(){
  $("button").click(function(){
  $("p").html("W3School");
  });
});
</script>
<title>首页</title>
</head>
<body>
	<h2>首页</h2>
	<img alt="fbb" src="image/fbb.jpg">
	<button>click me</button>
	<p>What's this ?</p>
	
</body>
</html>