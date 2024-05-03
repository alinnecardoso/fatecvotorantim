
import { Component } from '@angular/core';
import { CommonModule, FormStyle } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MatIconModule } from '@angular/material/icon';
import { MaterialModule } from '../material.module';


@Component({
  selector: 'app-test',
  standalone: true,
  imports: [CommonModule, FormsModule, MatIconModule, MaterialModule],
  templateUrl: './test.component.html',
  styleUrl: './test.component.css'
})

export class TestComponent {
  status: string = 'pendente';
  public showTitle = false;
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
