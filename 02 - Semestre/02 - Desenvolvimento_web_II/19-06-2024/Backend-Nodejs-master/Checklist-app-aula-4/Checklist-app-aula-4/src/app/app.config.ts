import { ApplicationConfig } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { provideClientHydration } from '@angular/platform-browser';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';

//import { SocialAuthServiceConfig } from '@abacritt/angularx-social-login';
//import { GoogleLoginProvider} from '@abacritt/angularx-social-login';


export const appConfig: ApplicationConfig = {
  
  providers: [provideRouter(routes), provideClientHydration(), provideAnimationsAsync(),
    
    
  ]

  
};
