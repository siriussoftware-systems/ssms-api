package br.com.siriussoftware.suporte.admin.service.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siriussoftware.base.service.BaseSuporteServiceImpl;
import br.com.siriussoftware.suporte.admin.domain.cliente.Contrato;
import br.com.siriussoftware.suporte.admin.infra.repository.cliente.ContratoRepository;

@Service
public class ContratoService extends BaseSuporteServiceImpl<Contrato, ContratoRepository, String> {

	@Autowired
	private ContratoRepository repository;

	@Override
	public ContratoRepository getRepository() {
		return repository;
	}

}
