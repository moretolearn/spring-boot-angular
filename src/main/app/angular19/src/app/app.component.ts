import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'welcome to angular-19';

  url = 'http://localhost:8080/employees';

  employeesList: any;

  constructor(private http: HttpClient) {
    http.get(this.url).subscribe(data => {
      this.employeesList = data;
    });
    console.log('AppComponent constructor');
  }
}
