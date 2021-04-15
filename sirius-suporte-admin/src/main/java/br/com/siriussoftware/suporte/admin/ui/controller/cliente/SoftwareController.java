package br.com.siriussoftware.suporte.admin.ui.controller.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import br.com.siriussoftware.library.suporte.ui.model.cliente.SoftwareVO;
import br.com.siriussoftware.suporte.admin.domain.cliente.Software;
import br.com.siriussoftware.suporte.admin.service.cliente.SoftwareService;
import io.swagger.annotations.Api;

@RestController(value = "software")
@RequestMapping("/software")
@Api(value = "Software", description = "Operações de Softwares")
public class SoftwareController extends CrudBaseController<SoftwareVO, Software, String> {

	@Autowired
	private SoftwareService service;

	@Override
	public SoftwareService getService() {
		return service;
	}

}
