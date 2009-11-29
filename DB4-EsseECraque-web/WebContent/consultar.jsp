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

Código do vídeo: <input type="text" name="idVideo" /><br>

<input type="hidden" name="operacao" value="consultar">
Tipo: <select name="tipo">
	<option value="imagem">Imagem</option>
	<option value=video>Vídeo</option>
</select><br><br>

<input type="submit" value="Enviar">
</form>

</body>
</html>