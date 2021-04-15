package br.com.siriussoftware.suporte.admin.infra.repository.apuracao;

import org.springframework.stereotype.Repository;

import br.com.siriussoftware.library.base.infra.repository.BaseRepository;
import br.com.siriussoftware.suporte.admin.domain.apuracao.ExtratoPeriodicoDeAtendente;

@Repository
public interface ExtratoPeriodicoDeAtendenteRepository extends BaseRepository<ExtratoPeriodicoDeAtendente, String> {

}
