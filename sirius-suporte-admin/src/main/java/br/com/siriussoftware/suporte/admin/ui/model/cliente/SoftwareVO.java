package br.com.siriussoftware.suporte.admin.ui.model.cliente;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import br.com.siriussoftware.library.base.ui.model.CrudValueObject;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({ "id", "nome" })
public class SoftwareVO extends CrudValueObject {
	private static final long serialVersionUID = 1L;

    @ApiModelProperty(notes = "Nome do software", required = true)
	private String nome;
}
