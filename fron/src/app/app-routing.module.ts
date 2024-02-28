import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {VideostoreComponent} from "./videostore/videostore.component";

const routes: Routes = [
  {path: '', component: VideostoreComponent, pathMatch: 'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
