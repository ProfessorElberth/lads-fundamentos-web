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
	  <h2>Cadastro de Alunos</h2>
	  <form action="/aluno/incluir" method="post">

	    <div class="form-group">
	      <label>Nome:</label>
	      <input value="Elberth Moraes" type="text" class="form-control" placeholder="Entre com o seu nome" name="nome">
	    </div>

	    <div class="form-group">
	      <label>Idade:</label>
	      <input value="42" type="text" class="form-control" placeholder="Entre com a sua idade" name="idade">
	    </div>

	    <div class="form-group">
	      <label>Mensalidade:</label>
	      <input value="1000" type="number" class="form-control" placeholder="Entre com a sua mensalidade" name="mensalidade">
	    </div>

	    <div class="form-group">
	      <label>E-mail:</label>
	      <input value="elberth.moraes@prof.infnet.edu.br" type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
	    </div>

	    <div class="form-group">
	      <label>Curso:</label>
			<div class="radio">
		      <label><input type="radio" name="curso" value="G">Graduação</label>
		    </div>
			<div class="radio">
		      <label><input type="radio" name="curso" value="E">Especialização</label>
		    </div>
			<div class="radio">
		      <label><input checked="checked" type="radio" name="curso" value="M">Mestrado</label>
		    </div>
			<div class="radio">
		      <label><input type="radio" name="curso" value="D">Doutorado</label>
		    </div>
		</div>
		
		<div class="form-group">
		  <label>Região:</label>
		  <select class="form-control" name="regiao">
			<option>Norte</option>
			<option>Nordeste</option>
			<option selected="selected" >Sul</option>
			<option>Sudeste</option>
			<option>Centro-oeste</option>
		  </select>
		</div>	
		
		<div class="form-group">
		  <label>Disciplinas:</label>
			<label class="checkbox-inline"><input name="disciplinas" type="checkbox" checked="checked" value="Java">Java</label>
			<label class="checkbox-inline"><input name="disciplinas" type="checkbox" value="Javascript">Javascript</label>
			<label class="checkbox-inline"><input name="disciplinas" type="checkbox" checked="checked" value="Python">Python</label>			
		</div>
		
	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>

</body>
</html>