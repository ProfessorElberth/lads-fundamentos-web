<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP2021 - Cadastra!!!</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
	  <h2>Cadastro de Alunos</h2>
	  <form action="confirmacao.html" method="get">

	    <div class="form-group">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu nome" name="nome">
	    </div>

	    <div class="form-group">
	      <label>E-mail:</label>
	      <input type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
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
		      <label><input type="radio" name="curso" value="M">Mestrado</label>
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
			<option>Sul</option>
			<option>Sudeste</option>
			<option>Centro-oeste</option>
		  </select>
		</div>	
		
		<div class="form-group">
		  <label>Disciplinas:</label>
			<label class="checkbox-inline"><input name="disciplinas" type="checkbox" value="Java">Java</label>
			<label class="checkbox-inline"><input name="disciplinas" type="checkbox" value="Javascript">Javascript</label>
			<label class="checkbox-inline"><input name="disciplinas" type="checkbox" value="Python">Python</label>			
		</div>
		
	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>

</body>
</html>