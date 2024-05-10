import { Component, OnInit, Injectable } from '@angular/core';
import { MaterialModule } from '../material.module';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [MaterialModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent{
  //  constructor(private autorizacaoService: AutorizacaoService){implements OnInit

  //  }

  //  descricaoLogin() =>
  //  this.autorizacaoService.status
}
