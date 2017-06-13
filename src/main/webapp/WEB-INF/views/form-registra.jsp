<%@include file="/WEB-INF/views/template/header-template.jsp"%>

<form action="${s:mvcUrl('RC#registraHora').build() }" method="POST" class="form-horizontal">

	<fieldset>
		<legend>Form Name</legend>

		<div class="form-group">
			<label class="col-md-4 control-label" for="radios"></label>
			<div class="col-md-4">
				<label class="radio-inline" for="radios-0">
				 <input type="radio" name="tipo" id="radios-0" value="ENTRADA"
					checked="checked"> entrada
				</label> <label class="radio-inline" for="radios-1"> 
				<input type="radio" name="tipo" id="radios-1" value="ALMOCO"> almoço
				</label>
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-md-4 control-label" for=""></label>
			<div class="col-md-4">
				<button type="submit" class="btn btn-primary">Enviar</button>
			</div>
		</div>

	</fieldset>
</form>


<%@include file="/WEB-INF/views/template/footer-template.jsp"%>