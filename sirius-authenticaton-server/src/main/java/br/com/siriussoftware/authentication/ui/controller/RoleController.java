package br.com.siriussoftware.authentication.ui.controller;

import br.com.siriussoftware.authentication.domain.Role;
import br.com.siriussoftware.authentication.service.RoleService;
import br.com.siriussoftware.library.authentication.ui.model.RoleVO;
import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;

public class RoleController extends CrudBaseController<RoleVO, Role, String> {

	private RoleService roleService;

	@Override
	public RoleService getService() {
		return this.roleService;
	}

}
