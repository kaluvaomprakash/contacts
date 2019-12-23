import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CurdusingserviceComponent } from './curdusingservice/curdusingservice.component';
import { CurdserviceService } from './curdservice.service';
import { TestingComponentComponent } from './testing-component/testing-component.component';

@NgModule({
  declarations: [
    AppComponent,
    CurdusingserviceComponent,
    TestingComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [CurdserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
