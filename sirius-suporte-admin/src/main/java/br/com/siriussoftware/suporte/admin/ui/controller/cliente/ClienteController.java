package br.com.siriussoftware.suporte.admin.ui.controller.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.library.base.service.BaseService;
import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import br.com.siriussoftware.suporte.admin.domain.cliente.Cliente;
import br.com.siriussoftware.suporte.admin.service.cliente.ClienteService;
import br.com.siriussoftware.suporte.admin.ui.model.cliente.ClienteVO;
import io.swagger.annotations.Api;

@RestController(value = "cliente")
@RequestMapping("/cliente")
@SuppressWarnings("rawtypes")
@Api(value = "Cliente", description = "Operações CRUD para cadastro de Clientes")
public class ClienteController extends CrudBaseController<ClienteVO, Cliente, String> {

	@Autowired
	private ClienteService service;

	@Override
	public BaseService getService() {
		return service;
	}

}
