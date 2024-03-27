<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
content="text/html; charset=windows-1256">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@include file="Header.jsp" %>
<p></p>
<div class="container">
<div class="card">
<div class="card-header">
Recherche des Produits
</div>
<div class="card-body">
	<form action="chercher.do" method="post">
		<input type="text" class="btn btn-primary" name="motCle" value="${modele.motCle}"> <input
			type="submit" value="OK">
	</form>
	<table class="table table-striped">
		<tr>
			<th>ID</th>
			<th>Nom</th>
			<th>Prix</th>
		</tr>
		<c:forEach items="${modele.produits}" var="p">
			<tr>
				<td>${p.idProduit}</td>
				<td>${p.nomProduit}</td>
				<td>${p.prix}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>