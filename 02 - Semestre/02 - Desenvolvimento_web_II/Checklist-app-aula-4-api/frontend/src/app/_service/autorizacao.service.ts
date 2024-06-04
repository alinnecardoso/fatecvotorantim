import { Injectable, OnInit } from '@angular/core';

@Injectable({ providedIn: 'root' })

export class AutorizacaoService implements OnInit{

  private storageKey = 'userState';

  constructor() { }

  // Método para verificar se o usuário está autenticado
  statusLogin() : boolean {
    console.log("statusLogin");

    return this.getUserState() !== null;
   }

  // Método para Carregar storageLocal
  autorizar(){
    const userState = { login: 'SIM' };
    this.setUserState(userState);
    }

  // Método para Limpar storageLocal
  deslogar(){
    
    if (typeof sessionStorage === 'undefined') {
      console.warn('localStorage is not available');
     // return null;
    }else
      sessionStorage?.clear();
  }

   // Método para obter o estado do usuário 
   getUserState(): any {
    if (typeof sessionStorage === 'undefined') {
      console.warn('localStorage is not available');
      return null;
    }
  
    console.log("getUserState");
    const state = sessionStorage.getItem(this.storageKey);
    return state ? JSON.parse(state) : null;
    
  }

  // Método para definir o estado do usuário
  setUserState(state: any): void {
    console.log("setUserState");
    sessionStorage.setItem(this.storageKey,  JSON.stringify(state));
  }


  ngOnInit(): void {
    
  }
}
