import { Component, Input } from '@angular/core';

@Component({
  selector: 'btnpadrao',
  standalone: true,
  imports: [],
  templateUrl: './btnpadrao.component.html',
  styleUrl: './btnpadrao.component.css'
})
export class BtnpadraoComponent {
  @Input() typeBtn: 'solid-primary' | 'outline-primary' | 'outline-secondary' = 'solid-primary';
  @Input() text: String = 'Texto';
  
  constructor() { }


}
