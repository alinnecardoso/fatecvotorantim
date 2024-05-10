import { Component, OnInit, Injectable } from '@angular/core';
import { MaterialModule } from '../material.module';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [MaterialModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit {
   constructor(private autorizacaoService: AutorizacaoService){

   }

   descricaoLogin() =>
   this.autorizacaoService.status
}
