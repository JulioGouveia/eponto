<%@include file="/WEB-INF/views/template/header-template.jsp"%>
<div class="container">
	<form action="#" method="POST" class="form-horizontal">
		<fieldset>

			<legend>Cadastro Funcionario</legend>

			<div class="form-group">
				<label class="col-md-4 control-label" for="nomeFunc">Nome:</label>
				<div class="col-md-4">
					<input id="nomeFunc" name="nomeFunc" type="text"
						placeholder="Nome Funcionario" class="form-control input-md"
						required="">
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for="cpfFunc">CPF: </label>
				<div class="col-md-4">
					<input id="cpfFunc" name="cpfFunc" type="text" placeholder="CPF"
						class="form-control input-md" required="">
				</div>
			</div>

			<div class="form-group">
				<label class="col-md-4 control-label" for=""></label>
				<div class="col-md-4">
					<button type="submit" name="" class="btn btn-primary">Enviar</button>
				</div>
			</div>

		</fieldset>
	</form>
</div>
<%@include file="/WEB-INF/views/template/footer-template.jsp"%>