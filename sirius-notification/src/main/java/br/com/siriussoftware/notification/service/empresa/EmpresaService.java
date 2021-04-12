package br.com.siriussoftware.notification.service.empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.library.base.service.BaseServiceImpl;
import br.com.siriussoftware.notification.domain.empresa.Empresa;
import br.com.siriussoftware.notification.infra.repository.empresa.EmpresaRepository;

@Service
public class EmpresaService extends BaseServiceImpl<Empresa, EmpresaRepository, String> {

	/** Instância para os repositórios */
	@Autowired
	private EmpresaRepository repository;

	@Override
	public EmpresaRepository getRepository() {
		return this.repository;
	}

}