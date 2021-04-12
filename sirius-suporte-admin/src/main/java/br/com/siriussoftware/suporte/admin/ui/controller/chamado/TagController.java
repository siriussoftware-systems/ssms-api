package br.com.siriussoftware.suporte.admin.ui.controller.chamado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.library.base.service.BaseService;
import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import br.com.siriussoftware.suporte.admin.domain.chamado.Tag;
import br.com.siriussoftware.suporte.admin.service.chamado.TagService;
import br.com.siriussoftware.suporte.admin.ui.model.chamado.TagVO;
import io.swagger.annotations.Api;

@RestController(value = "tag")
@RequestMapping("/tag")
@SuppressWarnings("rawtypes")
@Api(value = "tag", description = "Operações CRUD para cadastro de tags")
public class TagController extends CrudBaseController<TagVO, Tag, String> {

	@Autowired
	private TagService service;

	@Override
	public BaseService getService() {
		return service;
	}

}
