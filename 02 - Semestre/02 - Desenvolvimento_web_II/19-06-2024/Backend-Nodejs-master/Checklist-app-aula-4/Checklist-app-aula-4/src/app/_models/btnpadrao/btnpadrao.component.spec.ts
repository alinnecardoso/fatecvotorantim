import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BtnpadraoComponent } from './btnpadrao.component';

describe('BtnpadraoComponent', () => {
  let component: BtnpadraoComponent;
  let fixture: ComponentFixture<BtnpadraoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BtnpadraoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BtnpadraoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
