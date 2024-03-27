<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<head>
		<%@page import="web.CreditModel"%>
		<%CreditModel cm=(CreditModel)request.getAttribute("resultat");%>
		<meta charset="ISO-8859-1">
		<title>Credit Bancaire</title>
	</head>
		<body>
			<div> <form action="calcul" method="post">
			<table>
			<tr>
			<td> Montant: </td>
			<td><input type="text" name="montant" value=<%=cm.getCap() %>>
			</td><td>dt</td>
			</tr>
			<tr>
			<td> Duree </td>
			<td> <input type="text" name="duree" value=<%=cm.getDuree()%>></td>
			<td> mois </td>
			</tr>
			<tr>
			<td> Taux </td>
			<td> <input type="text" name="taux" value=<%=cm.getTaux()%>></td>
			<td> % </td>
			</tr>
			</table>
			<button type="submit">Calculer</button>
			</form>
			</div>
			<div> MensualitÃ©= <%=cm.getMontant() %></div>
		</body>
</html>