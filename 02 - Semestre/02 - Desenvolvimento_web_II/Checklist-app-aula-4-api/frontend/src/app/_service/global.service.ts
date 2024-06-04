import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class GlobalService {

  public loginRead: boolean = false;

  constructor() { }

  setLoginRead(value: boolean): void {
    this.loginRead = value;
  }

  getLoginRead(): boolean {
    return this.loginRead;
  }

}
