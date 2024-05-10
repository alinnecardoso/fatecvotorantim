import { CanActivateFn } from '@angular/router';

export const autorizacaoGuard: CanActivateFn = (route, state) => {
  return true;
};
