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
         <p> Como o(a) sr(a). &eacute; LIBERADOR(A) do departamento ${departamento}, gostar&iacute;amos de avis&aacute;-lo(a) que o aviso FOI LIBERADO.</strong> </p>         
         <p>
           <font color="#B51714" face="Arial, Helvetica, sans-serif">
             Abaixo est&atilde;o sendo enviados um RESUMO das informa&ccedil;&otilde;es do aviso LIBERADO:
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
        <tr>
          <td height="64">
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

