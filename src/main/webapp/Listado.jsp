<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title align="center">Insert title here</title>
</head>
<body bgcolor="c5dec9">

<h1 align="center">REGISTRAR PRODUCTO</h1>
<form action="ControladorProducto" method="post">
<table border="2" align="center">

<tr>
<td>Nombre</td>
<td><input type="text" name="Nombre"></td>
</tr>

<tr>
<td>Precio</td>
<td><input type="text" name="Precio"></td>
</tr>

<td>PrecioVen</td>
<td><input type="text" name="PrecioVen"></td>
</tr>

<td>Estado</td>
<td><input type="text" name="Estado"></td>
</tr>

<td>Descripcion</td>
<td><input type="text" name="Descripcion"></td>
</tr>



<tr>
<td colspan="2" align="center">
<input type="submit" value="Registrar">
</td>
</tr>

</table>
</form>

<h1 style="color: blue;" align="center">Dato Registrado en la BD</h1>

<h2 align="center">Listado de Productos</h2>


</body>
</html>