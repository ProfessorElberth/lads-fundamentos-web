<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP2021 - Cadastra!!!</title>
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
	  <h2>Olá, ${user.nome}!!!</h2>
	  <h3>Java WEB</h3>
	  <h4>AT</h4>
	  
	  <p> <a href="https://github.com/ProfessorElberth/lads-fundamentos-web">GITHUB</a> </p>
	</div>

</body>
</html>