package br.com.siriussoftware.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.authentication.domain.Role;
import br.com.siriussoftware.authentication.infra.repository.RoleRepository;
import br.com.siriussoftware.library.base.service.BaseServiceImpl;

@Service
public class RoleService extends BaseServiceImpl<Role, RoleRepository, String> {

	@Autowired
	private RoleRepository repository;

	@Override
	public RoleRepository getRepository() {
		return this.repository;
	}

}
