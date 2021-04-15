package br.com.siriussoftware.suporte.admin.ui.controller.chamado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import br.com.siriussoftware.library.suporte.ui.model.chamado.TagVO;
import br.com.siriussoftware.suporte.admin.domain.chamado.Tag;
import br.com.siriussoftware.suporte.admin.service.chamado.TagService;
import io.swagger.annotations.Api;

@RestController(value = "tag")
@RequestMapping("/tag")
@Api(value = "tag", description = "Operações de tags")
public class TagController extends CrudBaseController<TagVO, Tag, String> {

	@Autowired
	private TagService service;

	@Override
	public TagService getService() {
		return service;
	}

}
