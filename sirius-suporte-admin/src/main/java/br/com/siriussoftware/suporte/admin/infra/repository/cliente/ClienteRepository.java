package br.com.siriussoftware.suporte.admin.infra.repository.cliente;

import org.springframework.stereotype.Repository;

import br.com.siriussoftware.library.base.infra.repository.BaseRepository;
import br.com.siriussoftware.suporte.admin.domain.cliente.Cliente;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente, String> {

}
