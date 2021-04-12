package br.com.siriussoftware.suporte.admin.infra.repository.cliente;

import org.springframework.stereotype.Repository;

import br.com.siriussoftware.library.base.infra.repository.BaseRepository;
import br.com.siriussoftware.suporte.admin.domain.cliente.Solicitante;

@Repository
public interface SolicitanteRepository extends BaseRepository<Solicitante, String> {

}
