package br.com.siriussoftware.suporte.admin.service.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.base.service.BaseSuporteServiceImpl;
import br.com.siriussoftware.suporte.admin.domain.cliente.Cliente;
import br.com.siriussoftware.suporte.admin.infra.repository.cliente.ClienteRepository;

@Service
public class ClienteService extends BaseSuporteServiceImpl<Cliente, ClienteRepository, String> {

	@Autowired
	private ClienteRepository repository;

	@Override
	public ClienteRepository getRepository() {
		return repository;
	}

}
