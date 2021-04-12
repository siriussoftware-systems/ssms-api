package br.com.siriussoftware.notification.infra.repository.configuracao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.siriussoftware.library.base.domain.SistemaEnum;
import br.com.siriussoftware.library.base.domain.SituacaoEntidadeEnum;
import br.com.siriussoftware.library.base.infra.repository.BaseRepository;
import br.com.siriussoftware.notification.domain.configuracao.ConfiguracaoNotificacao;
import br.com.siriussoftware.notification.domain.empresa.Empresa;

@Repository
public interface ConfiguracaoNotificacaoRepository extends BaseRepository<ConfiguracaoNotificacao, String> {

	List<ConfiguracaoNotificacao> findBySituacao(SituacaoEntidadeEnum situacao);

	ConfiguracaoNotificacao findBySistemaAndEmpresa(SistemaEnum sistema, Empresa empresa);

}
