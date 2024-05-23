import {  Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { CategoryComponent } from './category/category.component';
import { TestComponent } from './test/test.component';
import { LoginComponent } from './_models/login/login.component';
import { autorizacaoGuard } from './_guard/autorizacao.guard';

export const routes: Routes = [
    { path: '', component: HomeComponent },
    { path: 'home', component: HomeComponent },
    { path: 'categoria', component: CategoryComponent, canActivate: [autorizacaoGuard]},
    { path: 'about', component: AboutComponent },
    { path: 'teste', component: TestComponent },
    { path: 'login', component: LoginComponent },
    { path: '**', component: HomeComponent}
];
