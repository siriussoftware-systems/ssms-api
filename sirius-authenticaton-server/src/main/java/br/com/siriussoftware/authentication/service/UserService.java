package br.com.siriussoftware.authentication.service;

import br.com.siriussoftware.authentication.domain.User;
import br.com.siriussoftware.authentication.infra.repository.UserRepository;
import br.com.siriussoftware.library.base.service.BaseServiceImpl;

public class UserService extends BaseServiceImpl<User, UserRepository, String> {

	private UserRepository repository;

	@Override
	public UserRepository getRepository() {
		return this.repository;
	}

}
