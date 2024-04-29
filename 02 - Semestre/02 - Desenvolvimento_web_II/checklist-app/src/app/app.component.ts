import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TestComponent } from "./test/test.component";
import { HeaderComponent } from "./header/header.component";

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, TestComponent, HeaderComponent]
})
export class AppComponent {
  title = 'checklist-app';
}
