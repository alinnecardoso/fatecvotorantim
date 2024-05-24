
import { Component } from '@angular/core';
import { CommonModule, FormStyle } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MaterialModule } from '../material.module';
import { RouterLink } from '@angular/router';


@Component({
  selector: 'app-test',
  standalone: true,
  imports: [CommonModule, FormsModule,  MaterialModule, RouterLink],
  templateUrl: './test.component.html',
  styleUrl: './test.component.css'
})

export class TestComponent {
  
  status: boolean = true;
  statusUsuario = "pendente";
  public valorTexto = '';

  public showTitle = true;
  public stringInterpolation = 'isto é um teste';
  public isDisabled = false;
  public myBindingproperty: string = ' ';

  public itens = [
    { descricao: 'Item 1', id : 1},
    { descricao: 'Item 2', id : 2},
    { descricao: 'Item 3', id : 3},
    { descricao: 'Item 4', id : 4}
  ];
  
myBindingModel: any;

  constructor() {}

  ngOninit(): void {

  }

  public processClick(input: string){
    console.log(`Este botão foi clicado: ${input}`);
  }
  public changeButtonDisplayStatus(){
    if(this.showTitle) 
      this.showTitle = false;
    else this.showTitle = true; 
  }

  public disableButton(){
    if(this.isDisabled) this.isDisabled = false;
    else this.isDisabled = true; 
  }

}
