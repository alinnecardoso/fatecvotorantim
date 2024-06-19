

export class Category{
  public id! : number;
  public position!: number;
  public name!: string;
  public weight!: number;
  public symbol!: string;
};



/*

import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router, CanActivate } from '@angular/router';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})


export class AuthGuard implements CanActivate {

  constructor(private authService: AuthService, private router: Router) {}

  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    
    if (this.authService.isLoggedIn()) {
      return true;
    } else {
      // Navigate to the login page with extras
      this.router.navigate(['/login']);
      return false;
    }
  }
}

export class AuthService {

  isLoggedIn(): boolean {
    // Implemente a lógica de verificação de login aqui
    // Por exemplo, você pode verificar se o usuário está autenticado de acordo com o estado atual da aplicação
    return true; // ou false, dependendo da sua lógica de autenticação
  }
}

*/