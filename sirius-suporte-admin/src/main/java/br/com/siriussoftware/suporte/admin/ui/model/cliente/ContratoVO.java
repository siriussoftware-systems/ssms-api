package br.com.siriussoftware.suporte.admin.ui.model.cliente;

import java.util.Calendar;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import br.com.siriussoftware.library.base.ui.model.CrudValueObject;
import br.com.siriussoftware.suporte.admin.domain.cliente.Cliente;
import br.com.siriussoftware.suporte.admin.domain.cliente.CustoDeAtendimento;
import br.com.siriussoftware.suporte.admin.domain.cliente.SituacaoContratoEnum;
import br.com.siriussoftware.suporte.admin.domain.cliente.Software;
import br.com.siriussoftware.suporte.admin.domain.cliente.TipoContratoEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({ "id", "nome", "inicio", "termino", "software", "cliente", "tipo", "situacaoContrato" })
public class ContratoVO extends CrudValueObject {
	private static final long serialVersionUID = 1L;

    @ApiModelProperty(notes = "Nome do contrato", required = true)
	private String nome;
    
    @ApiModelProperty(notes = "Data de início do contrato", required = true)
	private Calendar inicio;

    @ApiModelProperty(notes = "Data de término do contrato", required = true)
	private Calendar termino;

    @ApiModelProperty(notes = "Software objeto do contrato", required = true)
	private Software software;

    @ApiModelProperty(notes = "Custos de atendimento aplicados ao contrato", required = false)
	private List<CustoDeAtendimento> custosDeAtendimento;

    @ApiModelProperty(notes = "Cliente contratante", required = true)
	private Cliente cliente;

    @ApiModelProperty(notes = "Tipo de contrato", required = true)
	private TipoContratoEnum tipo;

    @ApiModelProperty(notes = "Situação do contrato", required = true)
	private SituacaoContratoEnum situacaoContrato;
    
}
