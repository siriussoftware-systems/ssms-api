package br.com.siriussoftware.suporte.admin.ui.controller.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.library.base.service.BaseService;
import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import br.com.siriussoftware.suporte.admin.domain.cliente.Contrato;
import br.com.siriussoftware.suporte.admin.ui.model.cliente.ContratoVO;
import br.com.siriussoftware.suporte.admin.service.cliente.ContratoService;
import io.swagger.annotations.Api;

@RestController(value = "contrato")
@RequestMapping("/contrato")
@SuppressWarnings("rawtypes")
@Api(value = "Contrato", description = "Operações CRUD para cadastro de Contratos")
public class ContratoController extends CrudBaseController<ContratoVO, Contrato, String> {

	@Autowired
	private ContratoService service;

	@Override
	public BaseService getService() {
		return service;
	}

}
