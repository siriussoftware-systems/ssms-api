<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta content="text/html; charset=UTF-8" http-equiv="Content-Type" />
  <title></title>
</head>
<body>
<table cellspacing="0" border="0" align="center" style="font-family: Arial, Helvetica, sans-serif; font-size: 12px; color: #565656;" width="600" cellpadding="0">
  <tbody>
  <tr>
    <td bgcolor="#ffffff">
		<img src="cid:logo.png" style="width: 204px !important; height: 124px !important;"/>
    </td>
  </tr>
  <tr>
    <td bgcolor="#ffffff">
      <table cellspacing="0" border="0" width="600" cellpadding="10">
      <tbody>
        <tr>
        <td>
         <p>Ol&aacute; <strong> ${nome} </strong> </p>
         <p> Como o(a) sr(a). &eacute; APROVADOR(A) do departamento ${departamento}, gostar&iacute;amos de avis&aacute;-lo(a) que um novo aviso foi cadastrado para ser publicado no Mural.</strong> </p>
         <p>
           <font color="#B51714" face="Arial, Helvetica, sans-serif">
             E abaixo est&atilde;o sendo enviados um RESUMO das informa&ccedil;&otilde;es do aviso cadastrado:
           </font>
          </p>
          <table cellspacing="0" cellpadding="0" width="500">
            <tbody>
              <tr>
                <td width="100px"></td>
                <td height="25" valign="middle" style="border-bottom:solid 1px #DCDCDC;" width="120">
                  Nome do Aviso:
                </td>
                <td valign="middle" style="border-bottom:solid 1px #DCDCDC;">
                  <b> <strong>${aviso}</strong> </b>
                </td>
              </tr>
              <tr>
                <td width="100px"></td>
                <td height="25" valign="middle" style="border-bottom:solid 1px #DCDCDC;" width="120">
                  Vig&ecirc;ncia:
                </td>
                <td valign="middle" style="border-bottom:solid 1px #DCDCDC;">
                  <b> <strong>${periodoVigencia}</span></strong> </b>
                </td>
              </tr>
              <tr>
                <td width="100px"></td>
                <td height="25" valign="middle" style="border-bottom:solid 1px #DCDCDC;" width="120">
                  Locais de visualiza&ccedil;&atilde;o:
                </td>
                <td valign="middle" style="border-bottom:solid 1px #DCDCDC;">
                  <b> <strong>${locais}</span></strong> </b>
                </td>
              </tr>
              <tr>
                <td colspan="3">
                    <br/><br/>
                    <center>
                        <a href="${urlAviso}" target="_blank" style="text-decoration:none; font-size: 20px;"><b>VISUALIZAR AVISO</b></a>
                    </center>
                    <br/><br/>
                </td>
              </tr>
              </tbody>
            </table>
            <p>
              Para realizar a aprova&ccedil;&atilde;o/reprova&ccedil;&atilde;o deste aviso basta que voc&ecirc; acesse a aplica&ccedil;&atilde;o atrav&eacute;s de um dos links abaixo:
            </p>
          </td>
        </tr>
      </tbody>
      </table>
      </td>
  </tr>
  <tr>
    <td bgcolor="#ffffff">
    <center>
      <table cellspacing="15" border="0" cellpadding="10" width="495" style="background-color: #f6f6f6; -moz-border-radius: 1em 1em 1em 1em; border-radius: 1em 1em 1em 1em; -webkit-box-shadow: rgba(0,0,0,0.8) 0px 0 5px; -moz-box-shadow: rgba(0,0,0,0.8) 0 0 5px; box-shadow: rgba(0,0,0,0.8) 0 0 5px;  margin-bottom: 10px;">
      <tbody>
      <tr>
        <td width="50%">
          <center>
          <a href="${urlOperacao1}" style="color: green; text-decoration:none; font-size: 20px;"><b>APROVAR</b></a>
           </center>
        </td>
        <td width="50%">
          <center>
          <a href="${urlOperacao2}" style="color: red; text-decoration:none; font-size: 20px;"><b>REPROVAR</b></a>
           </center>
        </td>
      </tr>
    </tbody>
  </table>
  </center>
  </td>
  </tr>
    <td bgcolor="#ffffff">
      <table cellspacing="0" border="0" width="600" cellpadding="10">
      <tbody>
        <tr>
          <td height="64">
            <p>
              Lembramos que, ao realizar a aprova&ccedil;&atilde;o, o sistema automaticamente enviar&aacute;, por email, a solicita&ccedil;&atilde;o de libera&ccedil;&atilde;o do aviso para os usu&aacute;rios respons&aacute;veis por realiz&aacute;-la e que somente depois da libera&ccedil;&atilde;o &eacute; que os avisos ser&atilde;o visualizados no mural.
            </p>
             
            <p>
               Este email foi enviado de forma autom&aacute;tica pelo ${sistema} e 
               <font size="2" color="#B51714" face="Arial">
                   n&atilde;o deve ser respondido.
                  </font>
              <br />
            </p>
            <p>Atenciosamente,</p>
          </td>
        </tr>
      </tbody>
    </table>
    </td>
  </tr>
  <tr>
    <td bgcolor="#ffffff">
      <table cellspacing="0" border="0" width="600" cellpadding="10">
      <tbody>
      </tbody>
    </table>
    </td>
  </tr>
 <tr>
    <td bgcolor="#BFD73E">
    	<table cellspacing="0" border="0" width="600" cellpadding="10">
    		<tr>
    			<td align="left">
					<p>
						<b>${equipeSuporte}</b><br />
					</p>
    			</td>
    			<td align="right">
					<a href="${urlSuporte}" title="Suporte">
						<img src="cid:footer.png" alt="Suporte | ${urlSuporte}" style="width: 66px !important; height: 58px !important;"/>
					</a>
    			</td>
    		</tr>
    	</table>
    </td>
  </tr>
</tbody>
</table>

</body>
</html>

