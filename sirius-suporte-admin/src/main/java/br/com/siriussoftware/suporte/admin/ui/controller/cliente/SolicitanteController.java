package br.com.siriussoftware.suporte.admin.ui.controller.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import br.com.siriussoftware.library.suporte.ui.model.cliente.SolicitanteVO;
import br.com.siriussoftware.suporte.admin.domain.cliente.Solicitante;
import br.com.siriussoftware.suporte.admin.service.cliente.SolicitanteService;
import io.swagger.annotations.Api;

@RestController(value = "solicitante")
@RequestMapping("/solicitante")
@Api(value = "Solicitante", description = "Operações de Solicitantes")
public class SolicitanteController extends CrudBaseController<SolicitanteVO, Solicitante, String> {

	@Autowired
	private SolicitanteService service;

	@Override
	public SolicitanteService getService() {
		return service;
	}

}
