import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Element } from '../_models/elements';

const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

@Injectable()
export class ElementService {
    elementApiUrl = 'http://localhost:3000/api/PeriodicElement';

    constructor(private http: HttpClient) { }

  getElement(): Observable<Element[]> {
        return this.http.get<Element[]>(this.elementApiUrl);
    };

    // Método para inserir um usuário
  addElement(element: any): Observable<any> {
    console.log(element);
    return this.http.post<any>(this.elementApiUrl, element, httpOptions);
  }

  // Método para atualizar um usuário
  updateElement(id: number, element: any): Observable<any> {
    console.log(`numero do id ${id}`)
    console.log(element)
    const url = `${this.elementApiUrl}/${id}`;
    return this.http.put<any>(url, element, httpOptions);
  }

  // Método para deletar um usuário
  deleteElement(id: number): Observable<any> {
    const url = `${this.elementApiUrl}/${id}`;
    return this.http.delete<any>(url, httpOptions);
  }

  // Método para obter todos os usuários (se necessário)
  /*
  getElement(): Observable<any[]> {
    return this.http.get<any[]>(this.elementApiUrl);
  }*/

  // Método para obter um usuário por ID (se necessário)
  getElementById(id: number): Observable<any> {
    const url = `${this.elementApiUrl}/${id}`;
    return this.http.get<any>(url);
  }

}