package br.com.siriussoftware.suporte.admin.ui.model.chamado;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import br.com.siriussoftware.library.base.ui.model.CrudValueObject;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({ "id", "codigo", "nome", "situacao", "idPreenchido", "excluido" })
public class TagVO extends CrudValueObject {
	private static final long serialVersionUID = 1L;

    @ApiModelProperty(notes = "Código da tag", required = false)
	private String codigo;

    @ApiModelProperty(notes = "Nome da tag", required = true)
	private String nome;
    
}
