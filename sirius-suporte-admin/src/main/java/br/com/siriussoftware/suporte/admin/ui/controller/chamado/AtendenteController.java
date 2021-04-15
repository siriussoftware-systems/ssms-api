package br.com.siriussoftware.suporte.admin.ui.controller.chamado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import br.com.siriussoftware.library.suporte.ui.model.chamado.AtendenteVO;
import br.com.siriussoftware.suporte.admin.domain.chamado.Atendente;
import br.com.siriussoftware.suporte.admin.service.chamado.AtendenteService;
import io.swagger.annotations.Api;

@RestController(value = "atendente")
@RequestMapping("/atendente")
@Api(value = "atendente", description = "Operações de atendentes")
public class AtendenteController extends CrudBaseController<AtendenteVO, Atendente, String> {

	@Autowired
	private AtendenteService service;

	@Override
	public AtendenteService getService() {
		return service;
	}

}
