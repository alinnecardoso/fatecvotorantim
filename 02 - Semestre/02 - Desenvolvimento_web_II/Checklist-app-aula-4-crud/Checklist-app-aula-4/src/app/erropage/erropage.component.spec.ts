import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ErropageComponent } from './erropage.component';

describe('ErropageComponent', () => {
  let component: ErropageComponent;
  let fixture: ComponentFixture<ErropageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ErropageComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ErropageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
