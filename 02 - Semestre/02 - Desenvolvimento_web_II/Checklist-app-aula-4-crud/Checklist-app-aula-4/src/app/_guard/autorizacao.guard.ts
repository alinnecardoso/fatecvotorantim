import { Router } from '@angular/router';
import { inject } from '@angular/core';
import { AutorizacaoService } from '../_service/autorizacao.service';


export const autorizacaoGuard = () => {
    const autorizaService = inject(AutorizacaoService);
    const router = inject(Router);

  if (autorizaService.statusLogin()) {
      autorizaService.autorizar();
      return true;
  }else{
      autorizaService.deslogar();
      router.navigate(['/home']);
      return false;
  }
};

export class AutorizacaoGuard {

    constructor(private authService: AutorizacaoService, private router: Router) { }
  
    canActivate(): boolean {
      // Certifique-se de que o localStorage está limpo antes de verificar a autenticação
      localStorage.clear();
      console.log('localStorage has been cleared by AuthGuard.');
  
      if (this.authService.statusLogin()) {
        return true;
      } else {
        this.router.navigate(['/login']);
        return false;
      }
    }
  }
