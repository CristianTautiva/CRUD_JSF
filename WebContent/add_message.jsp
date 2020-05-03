<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregando Mensaje</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<div class="container p-4">
    <div class="row">
        <div class="col-md-8 mx-auto">
            <div class="card">
            <h4 class="p-4">Añadiendo Mensaje</h4>
                <div class="card-body">
<form action="AddMessage" method="post">
<div class="form-group">
 Nombre: &nbsp;<input type="text" name="nombre" required><br>
 </div>
 <div class="form-group">
 Email: &nbsp;<input type="email" name="email" required><br>
 </div>
 <div class="form-group">
 WebSite: &nbsp;<input type="text" name="website" required><br>
 </div>
 <div class="form-group">
 Mensaje:<br><textarea name="mensaje" rows="3" cols="43" required></textarea><br>
 </div>
 <br>
 <div class="form-group">
 <button class="btn btn-block btn-primary"type="submit"> Guardar mensaje</button>
 </div>
 </form>
                </div>
              </div>
           </div>
        </div>
    </div>
</body>
</html>