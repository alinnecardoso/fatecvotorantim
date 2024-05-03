import { Routes } from '@angular/router';
import { CategoryComponent } from './category/category.component';
import { TestComponent } from './test/test.component';

export const routes: Routes = [
    {path: 'categoria', component: CategoryComponent},
    {path: 'teste', component: TestComponent}
];
