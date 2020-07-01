<%@ page language="java" contentType="text/html; charset=iso-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no">
<link rel="shortcut icon"
	href="https://www.adin.com.br/wp-content/uploads/2018/07/logo-1.png">
<title>Cadastro</title>
<link rel="stylesheet" href="./cadastro.css">
<link
	href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap"
	rel="stylesheet">
</head>

<body>
	<c:if test="${resultado != null}">
		<c:if test="${resultado == 'true'}">
			<script>
			   alert("Usuário cadastrado com sucesso.")
			</script>
		</c:if>
		<c:if test="${resultado == 'false'}">
			<script>
			   alert("Erro ao registrar usuário.")
			</script>
		</c:if>
	</c:if>

	<label id="switch" class="switch">
	   <input type="checkbox" onchange="toggleTheme()" id="slider">
	   <span class="slider round"></span>
	</label>

	<section class="form-section">
		<h1>Cadastro</h1>

		<div class="form-wrapper">
			<form action="Cadastro.do" method="post" id="formCadastroUsuario">
				<div class="input-block">
					<label for="nome">Nome completo:</label>
					<input type="text" id="nome" name="nome">
				</div>

				<div class="input-block">
					<label for="email">E-mail:</label>
					<input type="email" id="email" name="email">
				</div>

				<div class="input-block">
					<label for="cpf">CPF:</label>
					<input type="text" id="cpf" name="cpf">
				</div>

				<div class="input-block">
					<label for="nascimento">Data de Nascimento:</label>
					<input type="date" id="nascimento" name="nascimento">
				</div>

				<div class="input-block">
					<label for="endereco">Endereço Completo:</label>
					<input type="text" id="endereco" name="endereco">
				</div>

				<button type="submit" class="btn">Enviar</button>
			</form>
		</div>
	</section>

	<script src="script.js"></script>
</body>

</html>
