import { Component, Inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MaterialModule } from '../material.module';
import {Dialog, DialogRef, DIALOG_DATA, DialogModule} from '@angular/cdk/dialog';

export interface DialogData {
  animal: string;
  name: string;
}

@Component({
  selector: 'app-test',
  standalone: true,
  imports: [MaterialModule, DialogModule],
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
  
  animal: string | undefined;
  name!: string;

myBindingModel: any;

  constructor(public dialog: Dialog) {}

  openDialog(): void {
    const dialogRef = this.dialog.open<string>(CdkDialogOverviewExampleDialog, {
      width: '250px',
      data: {name: this.name, animal: this.animal},
    });

    dialogRef.closed.subscribe(result => {
      console.log('The dialog was closed');
      this.animal = result;
    });
  }

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


@Component({
    selector: 'cdk-dialog-overview-example-dialog',
    templateUrl: '../cdk-dialog-overview-example/cdk-dialog-overview-example.component.html',
    styleUrl: '../cdk-dialog-overview-example/cdk-dialog-overview-example.component.css',
    standalone: true,
    imports: [FormsModule],
  })
  
  export class CdkDialogOverviewExampleDialog {
    constructor(
      public dialogRef: DialogRef<string>,
      @Inject(DIALOG_DATA) public data: DialogData,
    ) {}
  }


