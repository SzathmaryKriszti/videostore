import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VideostoreComponent } from './videostore.component';

describe('VideostoreComponent', () => {
  let component: VideostoreComponent;
  let fixture: ComponentFixture<VideostoreComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VideostoreComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VideostoreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
