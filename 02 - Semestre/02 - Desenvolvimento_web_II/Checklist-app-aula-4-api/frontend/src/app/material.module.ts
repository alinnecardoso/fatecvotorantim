import { NgModule } from '@angular/core';
import { provideHttpClient, withFetch } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatSidenav, MatSidenavModule } from '@angular/material/sidenav';
import { MatListModule } from '@angular/material/list';
import { MatIconModule } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { MatDividerModule } from '@angular/material/divider';
import { MatCardModule } from '@angular/material/card';
import { MatTable, MatTableModule } from '@angular/material/table';
import { MatDialogModule } from '@angular/material/dialog';
import { RouterLink } from '@angular/router';
import { MatError, MatFormField, MatInput, MatInputModule } from '@angular/material/input';
import { CommonModule } from '@angular/common';
import { MatMenuModule } from '@angular/material/menu';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';


//import { SocialLoginModule, SocialAuthServiceConfig } from '@abacritt/angularx-social-login';
//import { GoogleLoginProvider, FacebookLoginProvider } from '@abacritt/angularx-social-login';



@NgModule({
  
     imports: [MatSidenavModule, MatListModule, MatCheckboxModule,
              MatIconModule, MatToolbarModule, MatButtonModule, FormsModule,
              MatTableModule, RouterLink, MatTable,
              MatDialogModule,  MatCardModule, ReactiveFormsModule,
              MatInputModule, MatDividerModule, MatSidenav,
              ReactiveFormsModule, MatError, ReactiveFormsModule,
              MatFormField, MatInput, MatMenuModule,  CommonModule, HttpClientModule] ,
    exports: [MatSidenavModule, MatListModule, MatCheckboxModule,
              MatIconModule, MatToolbarModule, MatButtonModule, FormsModule,
              MatTableModule, RouterLink, MatTable,
              MatDialogModule, MatCardModule, ReactiveFormsModule,
              MatInputModule, MatDividerModule, MatSidenav,
              ReactiveFormsModule,  MatError, ReactiveFormsModule,
              MatFormField, MatInput, MatMenuModule,CommonModule, HttpClientModule], 

              providers: [
                provideHttpClient(withFetch())  // Configura o HttpClient para usar fetch API
              ],

              /*
      providers: [
                {
                  provide: 'SocialAuthServiceConfig',
                  useValue: {
                    autoLogin: false,
                    providers: [
                      {
                        id: GoogleLoginProvider.PROVIDER_ID,
                        provider: new GoogleLoginProvider(
                          'YOUR_GOOGLE_CLIENT_ID'
                        )
                      },
                      {
                        id: FacebookLoginProvider.PROVIDER_ID,
                        provider: new FacebookLoginProvider('YOUR_FACEBOOK_APP_ID')
                      }
                    ],
                  } as SocialAuthServiceConfig,
                }
              ],
              */
})

export class MaterialModule {

  constructor() {
    
  }
 
 }
