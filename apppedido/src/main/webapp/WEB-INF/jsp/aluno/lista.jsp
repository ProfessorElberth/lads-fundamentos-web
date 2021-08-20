<%@page import="br.edu.infnet.apppedido.model.domain.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP2021 - Confirma!!!</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>	

	<div class="container">

		<form action="/aluno" method="get">
			<button type="submit" class="btn btn-link">Incluir</button>
		</form>
		
		<hr>
		
		<c:if test="${not empty lista}">
			<h4>Quantidade de alunos existentes: ${lista.size()}!!!</h4>
			
			<hr>
	
			<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>Id</th>
		        <th>Nome</th>
		        <th>E-mail</th>
		        <th>Idade</th>
		        <th>Curso</th>
		        <th>Região</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>		    
		    	<c:forEach var="a" items="${lista}">
			      <tr>
			        <td>${a.id}</td>
			        <td>${a.nome}</td>
			        <td>${a.email}</td>
			        <td>${a.idade}</td>
			        <td>${a.curso}</td>
			        <td>${a.regiao}</td>
			        <td><a href="/aluno/${a.id}/excluir">Excluir</a></td>
			      </tr>
		    	</c:forEach>
		    </tbody>
		  	</table>
	  	</c:if>
	  	
	  	<c:if test="${empty lista}">
			<h4>Não existem alunos cadastrados!!!</h4>	  	
	  	</c:if>
	</div>
</body>
</html>