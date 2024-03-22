package com.osagie.evolutionbilling.models.response;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceResponse {
    String message;
    String paymentEndpoint;
    String invoiceEndpoint;

}
