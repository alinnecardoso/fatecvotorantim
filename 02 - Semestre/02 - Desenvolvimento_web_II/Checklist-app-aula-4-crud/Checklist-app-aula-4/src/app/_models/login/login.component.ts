import { Component, OnInit, Injectable } from '@angular/core';
import { MaterialModule } from '../../material.module';
import { AutorizacaoService } from '../../_service/autorizacao.service';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [MaterialModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})

@Injectable({  providedIn: 'root' })

export class LoginComponent implements OnInit{

  constructor(private autorizacaoService:AutorizacaoService) {  }

  public descricaoLogin !: string

  ngOnInit(): void {
    //this.descricaoLogin =
//      this.autorizacaoService.statusLogin() ? "Estou Autorizado" : "Não Autorizado";

      if (this.autorizacaoService.statusLogin()) {
        // O usuário está autenticado, faça algo
        this.descricaoLogin = "Estou Autorizado" ;

      } else {
        // O usuário não está autenticado, talvez redirecione para a página de login
        this.descricaoLogin = "Não Autorizado";
      }

      console.log(this.descricaoLogin);
  }

  
  clickLogin(){
    //if (this.autorizacaoService.statusLogin()) {
    if (this.autorizacaoService.statusLogin()) {
      this.autorizacaoService.deslogar();
      this.descricaoLogin = "Não Autorizado";
    }else{
      this.autorizacaoService.autorizar();
      this.descricaoLogin = "Autorizado";
    }
  };

  /*
  loginAutotizado = false;

  ngOnInit(): void {
      this.statusLogin();
  }
  
  
  descricaoLogin = () => this.loginAutotizado ? "Estou Autorizado" : "Não Autorizado";
  */

  /*
  statusLogin(){
    this.loginAutotizado = !!localStorage.getItem("login");
  
  clickLogin(){
    if(this.loginAutotizado) {
      localStorage.clear();
      console.log("clear login");
    }else{
      localStorage.setItem("login", "SIM")
      console.log("logado")
      this.statusLogin();
    }
  };
  */
}


