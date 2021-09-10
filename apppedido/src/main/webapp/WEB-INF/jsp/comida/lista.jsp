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

		<form action="/comida" method="get">
			<button type="submit" class="btn btn-link">Incluir</button>
		</form>
		
		<hr>
		
		<c:if test="${not empty msg}">
			<div class="alert alert-success">
			  <strong>Sucesso!</strong> ${msg}
			</div>
		</c:if>

		<c:if test="${not empty comidas}">
			<h4>Quantidade de comidas existentes: ${comidas.size()}!!!</h4>
			
			<hr>
	
			<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>Id</th>
		        <th>Descrição</th>
		        <th>Valor</th>
		        <th>Artesanal</th>
		        <th>Porção</th>
		        <th>Vegano</th>
		        <th>Ingrediente</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>		    
		    	<c:forEach var="c" items="${comidas}">
			      <tr>
			        <td>${c.id}</td>
			        <td>${c.descricao}</td>
			        <td>${c.valor}</td>
			        <td>${c.artesanal}</td>
			        <td>${c.porcao}</td>
			        <td>${c.vegano}</td>
			        <td>${c.ingrediente}</td>
			        <td><a href="/comida/${c.id}/excluir">Excluir</a></td>
			      </tr>
		    	</c:forEach>
		    </tbody>
		  	</table>
	  	</c:if>
	  	
	  	<c:if test="${empty comidas}">
			<h4>Não existem comidas cadastradas!!!</h4>	  	
	  	</c:if>
	</div>
</body>
</html>