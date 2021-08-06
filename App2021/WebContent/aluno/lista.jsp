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
	List<Aluno> alunos = (List<Aluno>)request.getAttribute("lista");
	%>

	<div class="container">

		<form action="aluno" method="get">
			<button type="submit" class="btn btn-link" name="tela" value="lista">Incluir</button>
		</form>
		
		<hr>

		<h4>Quantidade de alunos existentes: <%=alunos.size()%>!!!</h4>
		
		<hr>

	<table class="table table-striped">
    <thead>
      <tr>
        <th>Nome</th>
        <th>E-mail</th>
        <th>Idade</th>
        <th>Curso</th>
        <th>Região</th>
      </tr>
    </thead>
    <tbody>
	  <%for(Aluno a : alunos) {%>
      <tr>
        <td><%=a.getNome()%></td>
        <td><%=a.getEmail()%></td>
        <td><%=a.getIdade()%></td>
        <td><%=a.getCurso()%></td>
        <td><%=a.getRegiao()%></td>
      </tr>
      <%}%>
    </tbody>
  	</table>		
	</div>
</body>
</html>