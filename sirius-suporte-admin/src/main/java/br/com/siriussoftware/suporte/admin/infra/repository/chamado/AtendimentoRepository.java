package br.com.siriussoftware.suporte.admin.infra.repository.chamado;

import org.springframework.stereotype.Repository;

import br.com.siriussoftware.library.base.infra.repository.BaseRepository;
import br.com.siriussoftware.suporte.admin.domain.chamado.Atendimento;

@Repository
public interface AtendimentoRepository extends BaseRepository<Atendimento, String> {

}
