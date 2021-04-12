package br.com.siriussoftware.notification.infra.repository.empresa;

import org.springframework.stereotype.Repository;

import br.com.siriussoftware.library.base.infra.repository.BaseRepository;
import br.com.siriussoftware.notification.domain.empresa.UnidadeEmpresarial;

@Repository
public interface UnidadeEmpresarialRepository extends BaseRepository<UnidadeEmpresarial, String> {

}
