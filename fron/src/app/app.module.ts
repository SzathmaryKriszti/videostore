import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { VideostoreComponent } from './components/videostore/videostore.component';
import { VideoFormComponent } from './components/video-form/video-form.component';

@NgModule({
  declarations: [
    AppComponent,
    VideostoreComponent,
    VideoFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
