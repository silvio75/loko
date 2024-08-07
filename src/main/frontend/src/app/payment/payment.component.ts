// payment.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent {
  selectedPayment: string = '';

  selectPayment(payment: string) {
    this.selectedPayment = payment;
  }

  onSubmit() {
    console.log('Selected Payment:', this.selectedPayment);
    // Envoyer les données au backend
  }
}
