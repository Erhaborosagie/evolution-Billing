package com.osagie.evolutionbilling.models.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class InvoiceResponse {
    String message;
    String paymentEndpoint;
    String invoiceEndpoint;

}
