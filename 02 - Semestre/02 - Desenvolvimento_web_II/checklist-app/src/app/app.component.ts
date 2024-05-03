import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CategoryComponent } from './category/category.component';
import { TestComponent } from "./test/test.component";
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { CommonModule } from '@angular/common';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
import { MatIconModule } from '@angular/material/icon';
import {MatDividerModule} from '@angular/material/divider';
import {MatButtonModule} from '@angular/material/button';

 @Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, FormsModule, 
      CategoryComponent, TestComponent, 
      FormsModule, ReactiveFormsModule,
      HeaderComponent,FooterComponent,CommonModule,
      MatSidenavModule, MatListModule, MatIconModule, MatDividerModule, MatButtonModule],
})
export class AppComponent {
  title = 'checklist-app';
  valorTexto = '';

  public events: string[] = [];
  public opened: boolean = false;

}
