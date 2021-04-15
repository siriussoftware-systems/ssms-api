package br.com.siriussoftware.suporte.admin.infra.repository.apuracao;

import org.springframework.stereotype.Repository;

import br.com.siriussoftware.library.base.infra.repository.BaseRepository;
import br.com.siriussoftware.suporte.admin.domain.apuracao.ExtratoPeriodicoDeAtendimento;

@Repository
public interface ExtratoPeriodicoDeAtendimentoRepository extends BaseRepository<ExtratoPeriodicoDeAtendimento, String> {

}
