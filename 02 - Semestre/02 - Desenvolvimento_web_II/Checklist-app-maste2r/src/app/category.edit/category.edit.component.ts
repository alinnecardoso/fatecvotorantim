import { Component, Inject, OnInit, Input } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material/dialog';
import { CategoryFormComponent } from '../_models/category-form/category-form.component';
import { Category } from '../_models/category';
import { ElementDialogComponent } from '../_models/element-dialog/element-dialog.component';


@Component({
  selector: 'app-category.edit',
  standalone: true,
  imports: [CategoryFormComponent, ElementDialogComponent],
  templateUrl: './category.edit.component.html',
  styleUrl: './category.edit.component.css'
})

export class CategoryEditComponent implements OnInit {

  @Input() public actionName = 'Editar testando';

  public editableCategory!: Category;

  constructor(private dialoRef: MatDialogRef<CategoryEditComponent>,
             @Inject(MAT_DIALOG_DATA) dialogData: any) 
             {

    if(dialogData.editableCategory != null) {
      this.editableCategory = dialogData.editableCategory
    }

    if(dialogData.actionName != null) {
      this.actionName = dialogData.actionName
    }
    
  }

  ngOnInit(): void {
      
  }

  public closeModalWindows($event: any) {
    if($event){
      this.dialoRef.close();
    }
    console.log("close modal windows");
  }

}
