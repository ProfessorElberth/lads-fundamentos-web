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

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">

		<form action="/solicitante" method="get">
			<button type="submit" class="btn btn-link">Incluir</button>
		</form>
		
		<hr>
	
		<c:if test="${not empty msg}">
			<div class="alert alert-success">
			  <strong>Sucesso!</strong> ${msg}
			</div>
		</c:if>

		<c:if test="${not empty lista}">
			<h4>Quantidade de solicitantes existentes: ${lista.size()}!!!</h4>
			
			<hr>
	
			<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>Id</th>
		        <th>Nome</th>
		        <th>E-mail</th>
		        <th>Idade</th>
		        <th>Usuário</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>		    
		    	<c:forEach var="s" items="${lista}">
			      <tr>
			        <td>${s.id}</td>
			        <td>${s.nome}</td>
			        <td>${s.email}</td>
			        <td>${s.idade}</td>
			        <td>${s.usuario.nome}</td>
			        <td><a href="/solicitante/${s.id}/excluir">Excluir</a></td>
			      </tr>
		    	</c:forEach>
		    </tbody>
		  	</table>
	  	</c:if>
	  	
	  	<c:if test="${empty lista}">
			<h4>Não existem solicitantes cadastrados!!!</h4>	  	
	  	</c:if>
	</div>
</body>
</html>