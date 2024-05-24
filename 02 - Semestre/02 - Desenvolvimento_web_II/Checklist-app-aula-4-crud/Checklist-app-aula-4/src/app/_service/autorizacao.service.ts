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
    
    if (typeof localStorage === 'undefined') {
      console.warn('localStorage is not available');
     // return null;
    }else
      localStorage?.clear();
  }

   // Método para obter o estado do usuário 
   getUserState(): any {
    if (typeof localStorage === 'undefined') {
      console.warn('localStorage is not available');
      return null;
    }
  
    console.log("getUserState");
    const state = localStorage.getItem(this.storageKey);
    return state ? JSON.parse(state) : null;
    
  }

  // Método para definir o estado do usuário
  setUserState(state: any): void {
    console.log("setUserState");
    localStorage.setItem(this.storageKey, JSON.stringify(state));
  }


  ngOnInit(): void {
    
  }
}
