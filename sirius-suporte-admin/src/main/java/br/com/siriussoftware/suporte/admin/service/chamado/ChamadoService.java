package br.com.siriussoftware.suporte.admin.service.chamado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.base.service.BaseSuporteServiceImpl;
import br.com.siriussoftware.suporte.admin.domain.chamado.Chamado;
import br.com.siriussoftware.suporte.admin.infra.repository.chamado.ChamadoRepository;

@Service
@CacheConfig(cacheNames = {"chamado"})
public class ChamadoService extends BaseSuporteServiceImpl<Chamado, ChamadoRepository, String> {

	@Autowired
	private ChamadoRepository repository;

	@Override
	public ChamadoRepository getRepository() {
		return repository;
	}

}
