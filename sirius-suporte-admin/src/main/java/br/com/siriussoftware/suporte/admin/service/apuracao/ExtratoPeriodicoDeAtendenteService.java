package br.com.siriussoftware.suporte.admin.service.apuracao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.base.service.BaseSuporteServiceImpl;
import br.com.siriussoftware.suporte.admin.domain.apuracao.ExtratoPeriodicoDeAtendente;
import br.com.siriussoftware.suporte.admin.infra.repository.apuracao.ExtratoPeriodicoDeAtendenteRepository;

@Service
@CacheConfig(cacheNames = {"anexo"})
public class ExtratoPeriodicoDeAtendenteService extends BaseSuporteServiceImpl<ExtratoPeriodicoDeAtendente, ExtratoPeriodicoDeAtendenteRepository, String> {

	@Autowired
	private ExtratoPeriodicoDeAtendenteRepository repository;

	@Override
	public ExtratoPeriodicoDeAtendenteRepository getRepository() {
		return repository;
	}

}
