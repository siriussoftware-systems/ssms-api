package br.com.siriussoftware.authentication.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.siriussoftware.authentication.domain.User;
import br.com.siriussoftware.authentication.service.UserService;
import br.com.siriussoftware.library.authentication.ui.model.UserVO;
import br.com.siriussoftware.library.base.ui.controller.CrudBaseController;
import io.swagger.annotations.Api;

@RestController(value = "user")
@RequestMapping("/user")
@Api(value = "user", description = "Operações de Usuários")
public class UserController extends CrudBaseController<UserVO, User, String> {

	@Autowired
	private UserService userService;

	@Override
	public UserService getService() {
		return this.userService;
	}

	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		User obj = this.getService().findByEmail(email);
		return ResponseEntity.ok(obj);
	}

}
