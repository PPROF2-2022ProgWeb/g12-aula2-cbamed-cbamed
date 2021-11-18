document.addEventListener("DOMContentLoaded", function() {
  document.getElementById("formulario").addEventListener('submit', validarFormulario); 
   
 });
 
 function validarFormulario(evento) {
   evento.preventDefault();
   var usuario = document.getElementById('user').value;
   var correo = document.getElementById('correo').value;
   var fechaNac = document.getElementById('fechaNacimiento').value;
   var nac = document.getElementById('Nacionalidad').value;
   var provincia = document.getElementById('Provincia').value;
   
   if(usuario.length == 0) {
     alert('No has escrito nada en el usuario');
     return;
   }
   var clave = document.getElementById('clave').value;
   if (clave.length < 6) {
     alert('La clave no es válida');
     return;
   }
   if(provincia.length === 0) {
     alert('Ingresa tu provincia');
     return;
   }
   if(correo.length === 0) {
     alert('Ingresa tu email');
     return;
   }
   if(fechaNac.length === 0) {
     alert('Ingresa tu fecha de nacimiento');
     return;
   }
   if(nac.length === 0) {
     alert('Ingresa tu nacionalidad');
     return;
   }
   this.submit();{
     alert('Se ha registrado con exito');
   }
 }


 // Boton enviar de la pagina Acerca de nosotros

 function enviar2(){
   var fecha = new Date();
   var dia = fecha.getDate();
   var mes = fecha.getUTCMonth() + 1;
   var year = fecha.getFullYear();
   alert("Se envio con exito su consulta en la fecha " + dia +"/"+mes+"/"+year);
   
 }
