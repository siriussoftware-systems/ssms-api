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
         <p>Seus dados de acesso ao ${sistema} foram atualizadas com sucesso.</strong> </p>
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

