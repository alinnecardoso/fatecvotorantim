import { Component, OnInit, ViewChild } from '@angular/core';
import { DialogComponent } from '../_models/dialog/dialog.component';
import { MaterialModule } from '../material.module';
import { MatTable, MatTableDataSource } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';
import { Element } from '../_models/elements';
import { CategoryEditComponent } from '../category.edit/category.edit.component';
import { CommonModule } from '@angular/common';
import { ElementService } from '../_service/element.service';

@Component({
  selector: 'app-element',
  standalone: true,
  imports: [ MaterialModule, CategoryEditComponent, CommonModule],
  templateUrl: './element.component.html',
  styleUrl: './element.component.css',
  providers: [ElementService],
})

export class ElementComponent implements OnInit {
  blnEdit !: boolean;

  elements: Element[] = [];
  newElement: Element = { id: 0, position: 0, name: '', weight: 0, symbol: '' };
  editElement: Element = { id: 0, position: 0, name: '', weight: 0, symbol: '' };

  displayedColumns: string[] = ['id', 'position', 'name', 'weight', 'symbol', 'actions'];

  dataSource!: MatTableDataSource<Element>;

  @ViewChild(MatTable) tableRef!: MatTable<any>;

  constructor(private dialog: MatDialog,
              public elementService : ElementService,  ) { 
      this.dataSource = new MatTableDataSource<Element>();
    }

  ngOnInit(): void {
    this.getElements();
  }

 
  getElements(): void {
    this.elementService.getElement().subscribe((data: Element[]) => {
      {this.dataSource.data = data};
    }, (error) => {
      console.error('Erro ao obter elementos:', error);
    });
  }

  public createElement(createElement: Element | null) : void {
    console.log("create element")
    this.blnEdit = false;
    this.openDialog(createElement);
  }

  public editElements(editElement: Element | null): void  {
    this.blnEdit = true;
    this.openDialog(editElement);
  }

  deleteElement(id: number): void {
    this.dialog.open(DialogComponent, {disableClose: true, 
      data: {dialogMsg: 'Confirma a exclusão do registro ?', 
            leftButtonLabel: 'Sim', rightButtonLabel: 'Não'}})
            .afterClosed().subscribe(
      resp => { if(resp){
           console.log('Elemento não apagado !');
      } else {
        console.log(id);
  
        this.elementService.deleteElement(id).subscribe(() => {
          this.getElements();
          console.log('Elemento apagado !');
        }, (error) => {
          console.error('Erro ao deletar usuário:', error);
        });
   
      }
    }  
    );
  }
  
  openDialog(inputElement: Element | null): void {
    const dialogRef = this.dialog.open(CategoryEditComponent, {
      disableClose: true,
      data: {editableCategory: inputElement, 
             actionName: this.blnEdit ? 'Editar' : 'Criar'}
    });

    dialogRef.afterClosed().subscribe(resp => {
      if (resp !== undefined) {
        const tableResp : Element = resp;
        console.log(resp.position -1);

        if (this.blnEdit && this.dataSource.data.map(p => p.position).includes(resp.position)) {
            this.elementService.updateElement(resp.id,  resp).subscribe(() => {
                this.getElements();
              })
            
            console.log('Elemento Editado!');
        } 
        else {
          
          if (! this.blnEdit && resp.position > 0) {
            this.elementService.addElement(resp).subscribe(() => {
              this.getElements();
              console.log('Elemento Incluido!');
            }, (error) => {
              console.error('Erro ao adicionar usuário:', error);
            });

            
          }
        }
        
      } else {
        console.log('Elemento não EDITADO!');
      } 
    });
  }
}
