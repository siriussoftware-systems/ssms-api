package br.com.siriussoftware.authentication.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.authentication.domain.Role;
import br.com.siriussoftware.authentication.service.RoleService;
import br.com.siriussoftware.library.authentication.ui.model.RoleVO;
import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import io.swagger.annotations.Api;

@RestController(value = "role")
@RequestMapping("/role")
@Api(value = "role", description = "Operações de Roles")
public class RoleController extends CrudBaseController<RoleVO, Role, String> {

	@Autowired
	private RoleService roleService;

	@Override
	public RoleService getService() {
		return this.roleService;
	}

}
