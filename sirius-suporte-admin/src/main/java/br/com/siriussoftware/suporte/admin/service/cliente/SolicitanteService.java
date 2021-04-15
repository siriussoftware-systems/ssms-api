package br.com.siriussoftware.suporte.admin.service.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.base.service.BaseSuporteServiceImpl;
import br.com.siriussoftware.suporte.admin.domain.cliente.Solicitante;
import br.com.siriussoftware.suporte.admin.infra.repository.cliente.SolicitanteRepository;

@Service
@CacheConfig(cacheNames = {"solicitante"})
public class SolicitanteService extends BaseSuporteServiceImpl<Solicitante, SolicitanteRepository, String> {

	@Autowired
	private SolicitanteRepository repository;

	@Override
	public SolicitanteRepository getRepository() {
		return repository;
	}

}
