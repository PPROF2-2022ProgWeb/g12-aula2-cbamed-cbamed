import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InicioComponent } from './Inicio/inicio/inicio.component';
import { NavbarComponent } from './navbar/navbar/navbar.component';
import { FooterComponent } from './footer/footer/footer.component';
import { AcercaDeNosotrosComponent } from './pages/acerca-de-nosotros/acerca-de-nosotros.component';
import { EcommerceComponent } from './pages/ecommerce/ecommerce.component';


@NgModule({
  declarations: [
    AppComponent,
    InicioComponent,
    NavbarComponent,
    FooterComponent,
    AcercaDeNosotrosComponent,
    EcommerceComponent
  ],
  
  imports: [
    BrowserModule,  
    AppRoutingModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent],

 exports: [
    InicioComponent,
    NavbarComponent,
    FooterComponent
    
  ],
  
})
export class AppModule { }
