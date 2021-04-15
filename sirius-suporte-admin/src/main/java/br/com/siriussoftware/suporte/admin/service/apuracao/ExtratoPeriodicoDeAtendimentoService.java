package br.com.siriussoftware.suporte.admin.service.apuracao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.base.service.BaseSuporteServiceImpl;
import br.com.siriussoftware.suporte.admin.domain.apuracao.ExtratoPeriodicoDeAtendimento;
import br.com.siriussoftware.suporte.admin.infra.repository.apuracao.ExtratoPeriodicoDeAtendimentoRepository;

@Service
@CacheConfig(cacheNames = {"anexo"})
public class ExtratoPeriodicoDeAtendimentoService extends BaseSuporteServiceImpl<ExtratoPeriodicoDeAtendimento, ExtratoPeriodicoDeAtendimentoRepository, String> {

	@Autowired
	private ExtratoPeriodicoDeAtendimentoRepository repository;

	@Override
	public ExtratoPeriodicoDeAtendimentoRepository getRepository() {
		return repository;
	}

}
