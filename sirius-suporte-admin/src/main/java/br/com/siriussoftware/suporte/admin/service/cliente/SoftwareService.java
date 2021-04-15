package br.com.siriussoftware.suporte.admin.service.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.base.service.BaseSuporteServiceImpl;
import br.com.siriussoftware.suporte.admin.domain.cliente.Software;
import br.com.siriussoftware.suporte.admin.infra.repository.cliente.SoftwareRepository;

@Service
@CacheConfig(cacheNames = {"software"})
public class SoftwareService extends BaseSuporteServiceImpl<Software, SoftwareRepository, String> {

	@Autowired
	private SoftwareRepository repository;

	@Override
	public SoftwareRepository getRepository() {
		return repository;
	}

}
