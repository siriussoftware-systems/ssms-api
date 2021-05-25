package br.com.siriussoftware.suporte.admin.ui.controller.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import br.com.siriussoftware.library.suporte.ui.model.cliente.CustoDeAtendimentoVO;
import br.com.siriussoftware.suporte.admin.domain.cliente.CustoDeAtendimento;
import br.com.siriussoftware.suporte.admin.service.cliente.CustoDeAtendimentoService;
import io.swagger.annotations.Api;

@RestController(value = "custoDeAtendimento")
@RequestMapping("/custoDeAtendimento")
@Api(value = "CustoDeAtendimento", description = "Operações de Custos De Atendimentos")
public class CustoDeAtendimentoController extends CrudBaseController<CustoDeAtendimentoVO, CustoDeAtendimento, String> {

	@Autowired
	private CustoDeAtendimentoService service;

	@Override
	public CustoDeAtendimentoService getService() {
		return service;
	}

}
