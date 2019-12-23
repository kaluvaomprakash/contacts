import { Component, OnInit } from '@angular/core';
import { CurdserviceService } from '../curdservice.service';

@Component({
  selector: 'app-curdusingservice',
  templateUrl: './curdusingservice.component.html',
  styleUrls: ['./curdusingservice.component.css']
})
export class CurdusingserviceComponent implements OnInit {

  constructor(private curdservice: CurdserviceService) { }
  emp = [];
  obj : any  = { "app_id": 54671,"plugin_id": "54671","domain_id": 54671,"config_name": "angular","created_by": 54671,"is_active": 1};
  ngOnInit() {
    //this.curdservice.getData().subscribe(data => this.emp = data);
    //this.curdservice.postData(this.obj);
  }

}
