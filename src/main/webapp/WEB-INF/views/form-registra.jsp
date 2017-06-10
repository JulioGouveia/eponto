<%@include file="/WEB-INF/views/template/header-template.jsp"%>

<form class="form-horizontal">

	<fieldset>
		<legend>Form Name</legend>

		<div class="form-group">
			<label class="col-md-4 control-label" for="radios"></label>
			<div class="col-md-4">
				<label class="radio-inline" for="radios-0"> <input
					type="radio" name="radios" id="radios-0" value="1"
					checked="checked"> entrada
				</label> <label class="radio-inline" for="radios-1"> <input
					type="radio" name="radios" id="radios-1" value="2"> almoço
				</label>
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-md-4 control-label" for=""></label>
			<div class="col-md-4">
				<button id="" name="" class="btn btn-primary">Enviar</button>
			</div>
		</div>

	</fieldset>
</form>


<%@include file="/WEB-INF/views/template/footer-template.jsp"%>