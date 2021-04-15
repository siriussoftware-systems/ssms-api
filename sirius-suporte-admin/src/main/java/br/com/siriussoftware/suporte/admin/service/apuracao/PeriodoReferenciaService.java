package br.com.siriussoftware.suporte.admin.service.apuracao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.base.service.BaseSuporteServiceImpl;
import br.com.siriussoftware.suporte.admin.domain.apuracao.PeriodoReferencia;
import br.com.siriussoftware.suporte.admin.infra.repository.apuracao.PeriodoReferenciaRepository;

@Service
@CacheConfig(cacheNames = {"anexo"})
public class PeriodoReferenciaService extends BaseSuporteServiceImpl<PeriodoReferencia, PeriodoReferenciaRepository, String> {

	@Autowired
	private PeriodoReferenciaRepository repository;

	@Override
	public PeriodoReferenciaRepository getRepository() {
		return repository;
	}

}
