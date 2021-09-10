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

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">
	
		<c:if test="${not empty mensagem}">
			<div class="alert alert-danger">
			  <strong>Problema!</strong> ${mensagem}
			</div>
		</c:if>
	
	<h2>Cadastramento de usuários</h2>
	  	  
	<form action="/cep" class="form-inline" method="post">
	    <div class="form-group">
			<input type="text" class="form-control" placeholder="Entre com o seu cep" name="cep">
			<button type="submit" class="btn btn-primary">Buscar</button>
	    </div>
	</form>
	
	<hr>

	<form action="/usuario" method="post">	
		<div class="form-row">
			<div class="form-group col-md-5">
			  <label>Nome:</label>
			  <input type="text" value="Maria das Flores" class="form-control" placeholder="Entre com o seu nome" name="nome">
			</div>
	
			<div class="form-group col-md-5">
			  <label>E-mail:</label>
			  <input type="email" value="maria@maria.com" class="form-control" placeholder="Entre com o seu e-mail" name="email">
			</div>
	
			<div class="form-group col-md-2">
			  <label>Senha:</label>
			  <input type="password" value="123" class="form-control" placeholder="Entre com a sua senha" name="senha">
			</div>			
		</div>

		<c:import url="/WEB-INF/jsp/endereco.jsp"/>
			
		<div class="form-row">
			<div class="form-group col-md-12">
				<button type="submit" class="btn btn-default">Cadastrar</button>
			</div>
		</div>
	</form>

</div>

</body>
</html>