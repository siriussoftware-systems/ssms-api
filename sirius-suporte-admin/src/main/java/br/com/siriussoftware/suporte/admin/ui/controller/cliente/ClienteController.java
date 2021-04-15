package br.com.siriussoftware.suporte.admin.ui.controller.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import br.com.siriussoftware.library.suporte.ui.model.cliente.ClienteVO;
import br.com.siriussoftware.suporte.admin.domain.cliente.Cliente;
import br.com.siriussoftware.suporte.admin.service.cliente.ClienteService;
import io.swagger.annotations.Api;

@RestController(value = "cliente")
@RequestMapping("/cliente")
@Api(value = "Cliente", description = "Operações de Clientes")
public class ClienteController extends CrudBaseController<ClienteVO, Cliente, String> {

	@Autowired
	private ClienteService service;

	@Override
	public ClienteService getService() {
		return service;
	}

}
