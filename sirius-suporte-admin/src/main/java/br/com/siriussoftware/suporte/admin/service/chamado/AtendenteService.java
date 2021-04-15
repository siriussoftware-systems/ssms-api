package br.com.siriussoftware.suporte.admin.service.chamado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.base.service.BaseSuporteServiceImpl;
import br.com.siriussoftware.suporte.admin.domain.chamado.Atendente;
import br.com.siriussoftware.suporte.admin.infra.repository.chamado.AtendenteRepository;

@Service
@CacheConfig(cacheNames = {"atendente"})
public class AtendenteService extends BaseSuporteServiceImpl<Atendente, AtendenteRepository, String> {

	@Autowired
	private AtendenteRepository repository;

	@Override
	public AtendenteRepository getRepository() {
		return repository;
	}

}
