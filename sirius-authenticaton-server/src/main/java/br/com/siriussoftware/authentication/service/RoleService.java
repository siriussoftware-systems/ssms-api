package br.com.siriussoftware.authentication.service;

import br.com.siriussoftware.authentication.domain.Role;
import br.com.siriussoftware.authentication.infra.repository.RoleRepository;
import br.com.siriussoftware.library.base.service.BaseServiceImpl;

public class RoleService extends BaseServiceImpl<Role, RoleRepository, String> {

	private RoleRepository repository;

	@Override
	public RoleRepository getRepository() {
		return this.repository;
	}

}
