package br.com.siriussoftware.notification.service.empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.library.base.service.BaseServiceImpl;
import br.com.siriussoftware.notification.domain.empresa.UnidadeEmpresarial;
import br.com.siriussoftware.notification.infra.repository.empresa.UnidadeEmpresarialRepository;

@Service
public class UnidadeEmpresarialService
		extends BaseServiceImpl<UnidadeEmpresarial, UnidadeEmpresarialRepository, String> {

	/** Instância para os repositórios */
	@Autowired
	private UnidadeEmpresarialRepository repository;

	@Override
	public UnidadeEmpresarialRepository getRepository() {
		return this.repository;
	}

}