<?php
//Configuracion necesaria para acceder a la data base
function conn(){
$hostname= "localhost";
$usuariodb= "root";
$passworddb= "";
$dbname= "proyecto";



//generando la conexion con el servidor

$conectar= mysqli_connect($hostname, $usuariodb, $passworddb, $dbname);
return $conectar;
}

?>