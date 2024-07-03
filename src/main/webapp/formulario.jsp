<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EXAMEN CL3 - LENGUAJE DE PROGRAMACIÓN II</title>
</head>
<body bgcolor="c5dec9">

<h1 align="center">INGRESAR AL SISTEMA</h1>
<form action="ControladorUsuario" method="post">
<table border="2" align="center">

<tr>
<td>Usuario</td>
<td><input type="text" name="Usuario"></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="contraseña"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Registrar">
</td>
</tr>

</table>
</form>

</body>
</html>