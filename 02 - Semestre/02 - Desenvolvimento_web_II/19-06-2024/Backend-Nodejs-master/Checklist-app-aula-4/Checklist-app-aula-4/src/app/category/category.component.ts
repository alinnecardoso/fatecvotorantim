import { Component, ViewChild, AfterViewInit, ChangeDetectorRef} from '@angular/core';
import { MatTable } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';
import { MaterialModule } from '../material.module';
import { DialogComponent } from '../_models/dialog/dialog.component';
import { Category } from '../_models/category';
import { CategoryEditComponent } from '../category.edit/category.edit.component';


export interface PeriodicElement {
  position: number;
  name: string;
  weight: number;
  symbol: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {position: 1, name: 'Hydrogen', weight: 1.0079, symbol: 'H'},
  {position: 2, name: 'Helium', weight: 4.0026, symbol: 'He'},
  {position: 3, name: 'Lithium', weight: 6.941, symbol: 'Li'},
  {position: 4, name: 'Beryllium', weight: 9.0122, symbol: 'Be'},
  {position: 5, name: 'Boron', weight: 10.811, symbol: 'B'},
  {position: 6, name: 'Carbon', weight: 12.0107, symbol: 'C'},
  {position: 7, name: 'Nitrogen', weight: 14.0067, symbol: 'N'},
  {position: 8, name: 'Oxygen', weight: 15.9994, symbol: 'O', },
  {position: 9, name: 'Fluorine', weight: 18.9984, symbol: 'F'},
  {position: 10, name: 'Neon', weight: 20.1797, symbol: 'Ne'},
];

@Component({
  selector: 'app-category',
  standalone: true,
  imports: [MaterialModule, DialogComponent, CategoryEditComponent],
  templateUrl: './category.component.html',
  styleUrl: './category.component.css'
 })

export class CategoryComponent {
  blnEdit !: boolean;
  
  public displayedColumns: string[] = ['position', 'name', 'weight', 'symbol', 'actions'];
  
  @ViewChild(MatTable) tableRef!: MatTable<any>;

  public dataSource = ELEMENT_DATA;
    
  constructor(private dialog: MatDialog) { }
  
  openDialog(inputCategory: Category | null): void {
      const dialogRef = this.dialog.open(CategoryEditComponent, {
        disableClose: true,
        data: {editableCategory: inputCategory, 
               actionName: this.blnEdit ? 'Editar' : 'Criar'}
      });

      dialogRef.afterClosed().subscribe(resp => {
        if (resp !== undefined) {
          const tableResp : Category = resp;

          console.log(resp.position -1);

          if (this.blnEdit && this.dataSource.map(p => p.position).includes(resp.position)) {
              this.dataSource[resp.position -1] = resp;
              this.tableRef.renderRows();

              console.log('Elemento Editado!');
          } 
          else {
            
            const positionExists = this.dataSource.map(p => p.position).includes(resp.position)

            console.log(positionExists);

            if (! this.blnEdit && resp.position > 0) {
              this.dataSource.push(resp);
              this.tableRef.renderRows();
              console.log('Elemento Incluido!');
            }
          }
          
        } else {

          console.log('Elemento não EDITADO!');
        }
      });
  }
 

  public editElement(inputCategory: Category | null): void  {
      this.blnEdit = true;
      console.log(inputCategory);
      this.openDialog(inputCategory);
    }

  public deleteElement(deleteCategory: Category | null): void  {
    this.dialog.open(DialogComponent, {disableClose: true, 
      data: {dialogMsg: 'Confirma a exclusão do registro ?', 
            leftButtonLabel: 'Sim', rightButtonLabel: 'Não'}}).afterClosed().subscribe(
      resp => {
      if(resp){
        console.log('Elemento não apagado !');
      } else {
        this.dataSource = this.dataSource.filter(p => p.position !== deleteCategory?.position);
        console.log('Elemento apagado !');
      }

    })
  }

  public createElement(inputCategory: Category | null) {
    console.log("create element")
    this.blnEdit = false;

    this.openDialog(inputCategory);

  }
}
