package br.com.siriussoftware.suporte.admin.ui.controller.chamado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import br.com.siriussoftware.library.suporte.ui.model.chamado.AtendimentoVO;
import br.com.siriussoftware.suporte.admin.domain.chamado.Atendimento;
import br.com.siriussoftware.suporte.admin.service.chamado.AtendimentoService;
import io.swagger.annotations.Api;

@RestController(value = "atendimento")
@RequestMapping("/atendimento")
@Api(value = "atendimento", description = "Operações de atendimentos")
public class AtendimentoController extends CrudBaseController<AtendimentoVO, Atendimento, String> {

	@Autowired
	private AtendimentoService service;

	@Override
	public AtendimentoService getService() {
		return service;
	}

}
