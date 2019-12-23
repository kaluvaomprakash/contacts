import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// import { Observable } from 'rxjs';
import { map, filter, scan } from 'rxjs/operators';
import { Type } from './test.model';
import { Observable, Subject, asapScheduler, pipe, of, from, interval, merge, fromEvent } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class CurdserviceService {

  constructor(private http: HttpClient) { }

  geturl: string = "https://flow.500apps.com/appshome/2206/All?test=name%20like%20%27%25micr%25%27";
  posturl: string = "https://flow.500apps.com/redirect/oauth";




  getData(): Observable<CurdserviceService[]> {
    return this.http.get<CurdserviceService[]>(this.geturl);
  }

   postData(data){

alert(data);
   //debugger;

     this.http.post(this.posturl,data).subscribe(data  => {
      console.log("POST Request is successful ", data);
      },
      error  => {
      
      console.log("Error", error);
      
      });
   }

}


