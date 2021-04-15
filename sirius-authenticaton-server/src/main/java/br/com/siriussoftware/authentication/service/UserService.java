package br.com.siriussoftware.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.authentication.domain.User;
import br.com.siriussoftware.authentication.infra.repository.UserRepository;
import br.com.siriussoftware.library.base.service.BaseServiceImpl;

@Service
public class UserService extends BaseServiceImpl<User, UserRepository, String> {

	@Autowired
	private UserRepository repository;

	@Override
	public UserRepository getRepository() {
		return this.repository;
	}

	public User findByEmail(String email) {
		return this.getRepository().findByEmail(email);
	}

}
