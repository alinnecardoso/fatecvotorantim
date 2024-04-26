import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TesteComponent } from './teste/teste.component'
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from "./header/header.component";


@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, TesteComponent, FooterComponent, HeaderComponent]
})
export class AppComponent {
  title = 'checklist-app';
}
