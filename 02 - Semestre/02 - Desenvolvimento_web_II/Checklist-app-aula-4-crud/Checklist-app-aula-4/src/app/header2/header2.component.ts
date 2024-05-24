import { Component, Input, } from '@angular/core';
import {MatMenuModule} from '@angular/material/menu';
import { MatButtonModule } from '@angular/material/button';
import { MatToolbar } from '@angular/material/toolbar';
import { MatSidenav } from '@angular/material/sidenav';
import { MatIcon } from '@angular/material/icon';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-header2',
  standalone: true,
  imports: [MatButtonModule, MatMenuModule, MatToolbar,
            MatSidenav, MatIcon, RouterLink],
  templateUrl: './header2.component.html',
  styleUrl: './header2.component.css'
})
export class Header2Component {

  @Input() sidenav!: MatSidenav
  public openSideNav() {
    this.sidenav.toggle();    
  } 

}
