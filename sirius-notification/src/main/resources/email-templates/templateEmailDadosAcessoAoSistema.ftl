<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta content="text/html; charset=UTF-8" http-equiv="Content-Type" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>

	<title></title>

    <!-- use the font -->
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            font-size: 48px;
        }
    </style>
</head>
<body style="margin: 0; padding: 0;">
<table cellspacing="0" border="0" align="center" style="font-size: 12px; color: #565656;" width="600" cellpadding="0">
  <tbody>
    <tr>
    <td bgcolor="#ffffff" align="center">
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
         <p> Seu cadastro no ${sistema} foi realizado com sucesso.</strong> </p>
         <p>
           <font color="#B51714" face="Arial, Helvetica, sans-serif">
             E abaixo est&atilde;o sendo enviados os seus DADOS DE ACESSO ao sistema:
           </font>
          </p>
          <table cellspacing="0" cellpadding="0" width="350">
            <tbody>
              <tr>
                <td width="100px"></td>
                <td height="25" valign="middle" style="border-bottom:solid 1px #DCDCDC;" width="60">
                  Usu&aacute;rio:
                </td>
                <td valign="middle" style="border-bottom:solid 1px #DCDCDC;">
                  <b> <strong>${login}</strong> </b>
                </td>
              </tr>
              <tr>
                <td width="100px"></td>
                <td height="25" valign="middle" style="border-bottom:solid 1px #DCDCDC;" width="60">
                  Senha:
                </td>
                <td valign="middle" style="border-bottom:solid 1px #DCDCDC;">
                  <b> <strong>${senha}</span></strong> </b>
                </td>
              </tr>
              </tbody>
            </table>
            <p>
              Para realizar a ativa&ccedil;&atilde;o de sua conta/usu&aacute;rio basta que voc&ecirc; acesse a aplica&ccedil;&atilde;o atrav&eacute;s do endere&ccedil;o abaixo e quando solicitado voc&ecirc; dever&aacute; fornecer os dados informados acima:
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
        <td width="100%">
          <center>
          <a href="${urlAtivacao}"><b>Ativar usu&aacute;rio</b></a>
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
              Lembramos que, ao realizar a ativa&ccedil;&atilde;o, o sistema solicitar&aacute; que voc&ecirc; informe o login e senha recebidos neste email e depois solicitar&aacute; que voc&ecirc; informe uma nova senha de acesso, que doravante dever&aacute; ser utilizada por voc&ecirc; para realizar o acesso &agrave; aplica&ccedil;&atilde;o.
            </p>
             
            <p>
               Este email foi enviado de forma autom&aacute;tica pelo ${sistema} e 
               <font size="4" color="#B51714" face="Arial">
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

