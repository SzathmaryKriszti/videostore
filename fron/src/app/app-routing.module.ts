import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {VideostoreComponent} from "./components/videostore/videostore.component";
import {VideoFormComponent} from "./components/video-form/video-form.component";

const routes: Routes = [
  {path: '', component: VideostoreComponent, pathMatch: 'full'},
  {path: 'video-form', component: VideoFormComponent, pathMatch: 'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
