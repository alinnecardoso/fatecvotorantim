import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Category } from '../_models/category';

const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

@Injectable()
export class CategoryService {
    categoryApiUrl = 'http://localhost:3000/api/PeriodicElement';

    constructor(private http: HttpClient) { }

    getElements(): Observable<Category[]> {
        return this.http.get<Category[]>(this.categoryApiUrl);
    };

    // Método para inserir um usuário
  addUser(user: any): Observable<any> {
    return this.http.post<any>(this.categoryApiUrl, user, httpOptions);
  }

  // Método para atualizar um usuário
  updateUser(id: number, user: any): Observable<any> {
    const url = `${this.categoryApiUrl}/${id}`;
    return this.http.put<any>(url, user, httpOptions);
  }

  // Método para deletar um usuário
  deleteUser(id: number): Observable<any> {
    const url = `${this.categoryApiUrl}/${id}`;
    return this.http.delete<any>(url, httpOptions);
  }

  // Método para obter todos os usuários (se necessário)
  getUsers(): Observable<any[]> {
    return this.http.get<any[]>(this.categoryApiUrl);
  }

  // Método para obter um usuário por ID (se necessário)
  getUserById(id: number): Observable<any> {
    const url = `${this.categoryApiUrl}/${id}`;
    return this.http.get<any>(url);
  }

}