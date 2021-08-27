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

	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#">AppPedido</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="#">Home</a></li>
	      <c:if test="${not empty user}">
	      	  <li><a href="/aluno/lista">Aluno</a></li>
	      </c:if>
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	      <c:if test="${empty user}">
		      <li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
		      <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	      </c:if>
	      <c:if test="${not empty user}">
   			  <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout, ${user.nome}</a></li>
	      </c:if>
	    </ul>
	  </div>
	</nav>

	<div class="container">

		<c:if test="${not empty msg}">		
		  <div class="alert alert-success">
			  <strong>Informação!</strong> ${msg}
		  </div>		
		</c:if>

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
		        <th>Usuário</th>
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
			        <td>${a.usuario.nome}</td>
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