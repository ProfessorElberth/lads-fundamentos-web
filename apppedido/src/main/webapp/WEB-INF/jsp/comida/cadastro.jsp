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
	  <h2>Cadastro de Comidas</h2>
	  <form action="/comida/incluir" method="post">

	    <div class="form-group">
	      <label>Descri��o:</label>
	      <input type="text" value="Churrasco" class="form-control" placeholder="Entre com a descri��o" name="descricao">
	    </div>

	    <div class="form-group">
	      <label>Valor:</label>
	      <input type="text" value="100" class="form-control" placeholder="Entre com o valor" name="valor">
	    </div>
		
	    <div class="form-group">
	      <label>Por��o:</label>
	      <input type="text" value="4" class="form-control" placeholder="Entre com a por��o" name="porcao">
	    </div>

	    <div class="form-group">
	      <label>Ingrediente:</label>
	      <input type="text" value="Carne, frango e lingui�a" class="form-control" placeholder="Entre com os ingredientes" name="ingrediente">
	    </div>

	    <div class="form-group">
	      <label>Caracter�sticas:</label>
			<label class="checkbox-inline"><input type="checkbox" name="artesanal">Artesanal</label>
			<label class="checkbox-inline"><input type="checkbox" name="vegano">Vegano</label>
	    </div>

	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>

</body>
</html>