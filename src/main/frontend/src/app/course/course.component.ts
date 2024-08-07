// course.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-course',
  templateUrl: './course.component.html',
  styleUrls: ['./course.component.css']
})
export class CourseComponent {
  form = {
    destination: 'default',
    time: 'now',
    isForOther: false,
    phone: '',
    firstName: '',
    carType: 'economy'
  };

  onSubmit() {
    console.log(this.form);
    // Naviguer vers la page de paiement
  }
}
