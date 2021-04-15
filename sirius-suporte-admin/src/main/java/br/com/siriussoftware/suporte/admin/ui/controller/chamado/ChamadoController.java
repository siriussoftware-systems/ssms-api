package br.com.siriussoftware.suporte.admin.ui.controller.chamado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import br.com.siriussoftware.library.suporte.ui.model.chamado.ChamadoVO;
import br.com.siriussoftware.suporte.admin.domain.chamado.Chamado;
import br.com.siriussoftware.suporte.admin.service.chamado.ChamadoService;
import io.swagger.annotations.Api;

@RestController(value = "chamado")
@RequestMapping("/chamado")
@Api(value = "chamado", description = "Operações de chamados")
public class ChamadoController extends CrudBaseController<ChamadoVO, Chamado, String> {

	@Autowired
	private ChamadoService service;

	@Override
	public ChamadoService getService() {
		return service;
	}

}
