package br.com.siriussoftware.authentication.infra.repository;

import org.springframework.stereotype.Repository;

import br.com.siriussoftware.authentication.domain.Role;
import br.com.siriussoftware.library.base.infra.repository.BaseRepository;

@Repository
public interface RoleRepository extends BaseRepository<Role, String> {

}
