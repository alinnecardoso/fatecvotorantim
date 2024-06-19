import { Component, OnInit, Injectable } from '@angular/core';
import { FooterComponent } from './footer/footer.component';
import { MaterialModule } from './material.module';
import { Header2Component } from "./header2/header2.component";


@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [FooterComponent, 
              MaterialModule, Header2Component]
})

@Injectable({ providedIn: 'root' })

export class AppComponent implements OnInit {

  myVariable: string = '';

  constructor () {
    
  }

  ngOnInit(): void {

             
  }
  
}
