<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teste</title>
</head>
<body>

<form action="/DB4-EsseECraque-web/GravaVideoServlet">
Caminho completo do arquivo de origem:(com raiz ex: /usr/local/servidor-local/user/jatoba/videos/teste.mpeg) <input type="text" name="uploadedFileName" /><br>
Código do assinante: <input type="text" name="idAssinante" /><br>
Nome do arquivo a ser gravado no servidor de vídeo(sem extensão ex.: 111234242).Esse nome deve ser o mesmo que foi registrado no banco: <input type="text" name="nomeNovoArquivo" /><br>
Path de destino (sem raiz. ex.: /user/fabio/videos/)<input type="text" name="pastaDestino" /><br>
Código do vídeo <input type="text" name="idVideo" /><br>
<br>
<input type="hidden" name="operacao" value="gravar">


<input type="submit" value="Enviar">
</form>

</body>
</html>