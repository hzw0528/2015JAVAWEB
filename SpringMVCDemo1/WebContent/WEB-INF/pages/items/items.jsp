<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表</title>
</head>
<body>
	<h2 align="center">商品列表</h2>
	<table border="1" cellpadding="3" cellspacing="0" align="center">
		<tr>
			<th>编号</th>
			<th>名称</th>
			<th>价格</th>
			<th>描述</th>
			<th>操作</th>
		</tr>
		<c:forEach var="item" items="${list}">
		<tr>
			<td>${item.id }</td>
			<td>${item.name }</td>
			<td>${item.price }</td>
			<td>${item.detail }</td>
			<td><a href="#">编辑</a>|<a href="#">删除</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>