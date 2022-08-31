import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from 'src/app/pages/autenticacion/login/login.component';
import {RegistroComponent} from 'src/app/pages/autenticacion/registro/registro.component';
import {InicioComponent } from './Inicio/inicio/inicio.component';
import { AcercaDeNosotrosComponent } from './pages/acerca-de-nosotros/acerca-de-nosotros.component';

//defino las rutas path:'Inicio',component:nombre de componente
const routes: Routes = [
{path: 'AcercaDeNosotros', component:AcercaDeNosotrosComponent },
{path: 'Login', component: LoginComponent},
{path: 'Registro', component: RegistroComponent},
{path: '', component: InicioComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
