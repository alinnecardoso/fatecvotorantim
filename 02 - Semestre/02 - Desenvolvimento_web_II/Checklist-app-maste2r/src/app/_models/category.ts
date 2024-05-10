import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';


export class Category{
    public position!: number;
    public name!: string;
    public weight!: number;
    public symbol!: string;
};


@Injectable({
  providedIn: 'root'
})

export class DataService {
  private editedData = new BehaviorSubject<any>(null);
  editedData$ = this.editedData.asObservable();

  constructor() { }

  sendData(data: any) {
    this.editedData.next(data);
  }
}
