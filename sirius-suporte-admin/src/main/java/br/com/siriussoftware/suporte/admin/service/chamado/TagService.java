package br.com.siriussoftware.suporte.admin.service.chamado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.base.service.BaseSuporteServiceImpl;
import br.com.siriussoftware.suporte.admin.domain.chamado.Tag;
import br.com.siriussoftware.suporte.admin.infra.repository.chamado.TagRepository;

@Service
@CacheConfig(cacheNames = {"tag"})
public class TagService extends BaseSuporteServiceImpl<Tag, TagRepository, String> {

	@Autowired
	private TagRepository repository;

	@Override
	public TagRepository getRepository() {
		return repository;
	}

}
