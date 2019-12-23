import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CurdusingserviceComponent } from './curdusingservice.component';

describe('CurdusingserviceComponent', () => {
  let component: CurdusingserviceComponent;
  let fixture: ComponentFixture<CurdusingserviceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CurdusingserviceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CurdusingserviceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
