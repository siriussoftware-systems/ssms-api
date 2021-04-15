package br.com.siriussoftware.suporte.admin.service.chamado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.base.service.BaseSuporteServiceImpl;
import br.com.siriussoftware.suporte.admin.domain.chamado.Atendimento;
import br.com.siriussoftware.suporte.admin.infra.repository.chamado.AtendimentoRepository;

@Service
@CacheConfig(cacheNames = {"atendimento"})
public class AtendimentoService extends BaseSuporteServiceImpl<Atendimento, AtendimentoRepository, String> {

	@Autowired
	private AtendimentoRepository repository;

	@Override
	public AtendimentoRepository getRepository() {
		return repository;
	}

}
