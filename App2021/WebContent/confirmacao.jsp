<%@page import="br.edu.infnet.model.domain.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP2021 - Confirma!!!</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>	
	<%
	String nome = (String)request.getAttribute("nomeDoAluno");
	%>

	<div class="container">
		<a href="aluno">Voltar</a>
		<hr>
		<h3>O aluno <%=nome%> foi cadastrado com sucesso!!!</h3>
		<hr>		
	</div>
</body>
</html>