import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { ReactiveFormsModule } from '@angular/forms';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { CommonModule } from '@angular/common';
import { MaterialModule } from './material.module';


@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, ReactiveFormsModule,
      CommonModule,  FooterComponent, HeaderComponent,
      MaterialModule 
    ],
   
})

export class AppComponent {
  public events: string[] = [];
  public opened: boolean = false;
}
