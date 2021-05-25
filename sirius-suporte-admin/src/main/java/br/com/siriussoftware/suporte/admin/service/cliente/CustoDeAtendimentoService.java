package br.com.siriussoftware.suporte.admin.service.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.base.service.BaseSuporteServiceImpl;
import br.com.siriussoftware.suporte.admin.domain.cliente.CustoDeAtendimento;
import br.com.siriussoftware.suporte.admin.infra.repository.cliente.CustoDeAtendimentoRepository;

@Service
@CacheConfig(cacheNames = {"custoDeAtendimento"})
public class CustoDeAtendimentoService extends BaseSuporteServiceImpl<CustoDeAtendimento, CustoDeAtendimentoRepository, String> {

	@Autowired
	private CustoDeAtendimentoRepository repository;

	@Override
	public CustoDeAtendimentoRepository getRepository() {
		return repository;
	}

}
