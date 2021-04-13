package br.com.siriussoftware.authentication.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.authentication.domain.User;
import br.com.siriussoftware.authentication.service.UserService;
import br.com.siriussoftware.library.authentication.ui.model.UserVO;
import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import io.swagger.annotations.Api;

@RestController(value = "user")
@RequestMapping("/user")
@Api(value = "user", description = "Operações CRUD para cadastro de Usuários")
public class UserController extends CrudBaseController<UserVO, User, String> {

	@Autowired
	private UserService userService;

	@Override
	public UserService getService() {
		return this.userService;
	}

}
