<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Historia clinica Digital:Ingresa ahora y realiza todos tus tramites medicos desde un solo lugar, a traves de unos pocos click en nuestra plataforma">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <meta name="keywords" content="sistema de hospital, software de salud, historia clinica digital, cordoba argentina, telemedicina">
    <link rel="Icon" href="./imagenes/iconmedicina.ico">

    <title>Ingreso al sistema </title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body class="bodyregistro">
    <header>
    <!-- barra de navegacion -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-secondary ">
        <div class="container">
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <a class="navbar-brand" href="index.html">
            <img id="logo" src="CbaMed2-removebg-preview.png">
          </a>
          <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="login.html">Login</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="registro.html">Registro</a>
              </li>
              <li class="nav-item">
                 <a  class="nav-link" href="Acerca de nosotros.html">Acerca de Nosotros</a>
              </li>
             </li>
            </ul>
          </div>
        </div>
      </nav>
    <!-- fin de la barra de navegacion -->
    </header>



<?php
include_once('db.php');

//recibo los datos

$name=$_POST["usuario"];
$clave=$_POST["clave"];




$conectar=conn(); //ejecuta la conexion bd
$sql="INSERT INTO `usuarios`(`nombres`, `clave`) VALUES ('$name','$clave')";
$resul= mysqli_query($conectar , $sql) or trigger_error ("query failed SQL ERROR:" .mysqli_error($conectar) );


?>
<seccion class="mensaje" style="color:blue ">
<center>
<h3 class="baseresultado">Bienvenido  </h3>
<?php
print "<p> Su usuario registrado es $name.</p>";

?>
<h5 class="bbdd"> Gracias por confiar en nosotros </h5>
</center>
</seccion>
<?php
?>

