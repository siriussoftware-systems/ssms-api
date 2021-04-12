package br.com.siriussoftware.notification.infra.repository.empresa;

import org.springframework.stereotype.Repository;

import br.com.siriussoftware.library.base.infra.repository.BaseRepository;
import br.com.siriussoftware.notification.domain.empresa.Empresa;

@Repository
public interface EmpresaRepository extends BaseRepository<Empresa, String> {

}
