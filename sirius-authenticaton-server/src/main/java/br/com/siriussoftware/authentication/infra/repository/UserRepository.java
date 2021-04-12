package br.com.siriussoftware.authentication.infra.repository;

import br.com.siriussoftware.authentication.domain.User;
import br.com.siriussoftware.library.base.infra.repository.BaseRepository;

public interface UserRepository extends BaseRepository<User, String> {

	User findByEmail(String email);
}
