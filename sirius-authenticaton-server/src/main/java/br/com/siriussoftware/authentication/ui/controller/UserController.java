package br.com.siriussoftware.authentication.ui.controller;

import br.com.siriussoftware.authentication.domain.User;
import br.com.siriussoftware.authentication.service.UserService;
import br.com.siriussoftware.library.authentication.ui.model.UserVO;
import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;

public class UserController extends CrudBaseController<UserVO, User, String> {

	private UserService userService;

	@Override
	public UserService getService() {
		return this.userService;
	}

}
