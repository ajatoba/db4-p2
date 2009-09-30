<%@ taglib uri="/WEB-INF/TLD/struts-bean.tld" prefix="bean" %>   
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>   
<html>   
<head>
        <style>
            .visualInputErro {
                border: 1px solid #b22222;
                font-family: Arial, Helvetica, sans-serif;
                color: #666666;
                background-color: #ffe4e1;
            }
        </style>   
<link href="<html:rewrite page="/visual.css" />" rel="stylesheet" type="text/css">   
<title><bean:message key="titulo.pgAssinante"/></title>   
</head>   
<body>   
<h1><bean:message key="titulo.pgAssinante"/></h1>   
<html:form action="cadAssinante.do?act=list" focus="VC_EMAIL_ASSINANTE" onsubmit="return validateAssinanteForm(this)">   
<table>
<tr>   
    <td >ID Assinante:</td>   
    <td><html:text property="idAssinante" /></td>   
</tr>         
</table>   
<html:submit><bean:message key="botao.submit"/>
</html:submit>
<html:javascript formName="AssinanteForm" dynamicJavascript="true" staticJavascript="true" />   
</html:form>   
</body>   
</html>